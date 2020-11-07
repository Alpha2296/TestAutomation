import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class ReadingInfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream exo= new FileInputStream("C:\\Users\\Omega\\OneDrive\\Desktop\\Test1.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook(exo);
		XSSFSheet wso=wbo.getSheet("sheet1");
		
		Row r;
		
		for(int i=0;i<=10;i++) {
			r=wso.createRow(i);
			r.createCell(1).setCellValue("Selenium");		
			}
			FileOutputStream data=new FileOutputStream("C:\\Users\\Omega\\OneDrive\\Desktop\\Test1.xlsx");
			wbo.write(data);
	
			
			
	
	}

}
