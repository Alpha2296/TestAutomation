import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Readdatausingloo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Omega\\OneDrive\\Desktop\\Month.xlsx");
        
		FileInputStream fis = new FileInputStream(file);
		
		HSSFWorkbook wbk =new HSSFWorkbook(fis);
		HSSFSheet  sheet =new wbk.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum()+1;
		
		for(int i=0;i<rowcount;i++)
		{
			HSSFRow row = sheet.getRow(i);
			for (int j=0;j<row.getLastCellNum();j++)
			{
				System.out.println();
			}
		fis.close();
		wbk.close();
		
		
		}
		
		
	}

}
