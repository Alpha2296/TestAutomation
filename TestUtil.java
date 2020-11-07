package com.ap.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ap.qa.base.TestBase;

//Extend TestBase because there are characteristic we are importing from TestBase.
//For Example
//Page Loan TimeOut
//Implicit Wait
public class TestUtil extends TestBase {

public static long PAGE_LOAD_TIMEOUT = 30;
public static long IMPLICIT_WAIT= 30;

//Creating object to handel testdata. TestData for Excel.
public static String TESTDATA_SHEET_PATH="";

static Workbook book;
static Sheet sheet;
static JavascriptExecutor js;

public void SwitchToFrame() {
driver.switchTo().frame("");

}


public static Object[][] getTestData(String sheetname){
FileInputStream file = null;

//To see if the file exist or not
try {
file = new FileInputStream(TESTDATA_SHEET_PATH);

}catch (FileNotFoundException e) {
e.printStackTrace();
}
try {
book = WorkbookFactory.create(file);

}catch (InvalidFormatException e) {
e.printStackTrace();
}catch (IOException e) {
e.printStackTrace();
}

sheet = book.getSheet(sheetname);
Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
for(int i=0; i<sheet.getLastRowNum(); i++) {
for(int k=0; k<sheet.getRow(0).getLastCellNum(); k++) {
data[i][k]=sheet.getRow(i+1).getCell(k).toString();
}
}
return data;
}

public static void TakeScreenShotAtEnd() throws IOException{
File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String currentdriver= System.getProperty("user.dir");
FileUtils.copyFile(srcfile, new File(currentdriver + "/screenshots/"+System.currentTimeMillis()+"png"));
}

public static void runtimeinfo (String MessageType, String Message) throws InterruptedException {
js = (JavascriptExecutor)driver;
js.executeScript("(\"if (!window.jQuery) {"
+ "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
+ "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
+ "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
Thread.sleep(5000);

// Use jQuery to add jquery-growl to the page
js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

// Use jQuery to add jquery-growl styles to the page
js.executeScript("$('head').append('<link rel=\"stylesheet\" "
+ "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
Thread.sleep(5000);

//JQuery-growl w/ no frills
js.executeScript("$.growl,({ title: 'GET', message: '/' });");

if(MessageType.equals("errors")) {
js.executeScript("$.growl.error({title: 'ERROR', message: '"+ Message +"'});");
}else if(MessageType.equals("info")) {
js.executeScript("$.growl.notice({title: ' Notice', message: 'your notice message goes here'});");
}else if(MessageType.equals("warning")) {
js.executeScript("$.growl.warning({title: 'warning!', message: 'your warning message goes here'});");

}else
System.out.println("no error message");
Thread.sleep(5000);

}
}

