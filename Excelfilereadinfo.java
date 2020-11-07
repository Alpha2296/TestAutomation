import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfilereadinfo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		FileInputStream exof = new FileInputStream("C:\\Users\\Omega\\OneDrive\\Desktop\\InfoWriting.xlsx");
		XSSFWorkbook wbos=new XSSFWorkbook(exof);
		XSSFSheet wsos = wbos.getSheet("sheet1");
		
		Row rs;
		
		System.out.println(wsos.getRow(0).getCell(0).getStringCellValue());
		
		System.out.println(wsos.getRow(0).getCell(1).getStringCellValue());
		
		System.out.println(wsos.getRow(1).getCell(0).getStringCellValue());
		
		System.out.println(wsos.getRow(1).getCell(1).getStringCellValue());
		
		System.out.println(wsos.getRow(2).getCell(0).getStringCellValue());
		
		System.out.println(wsos.getRow(2).getCell(1).getStringCellValue());
		
	
	}

}
