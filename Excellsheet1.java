package Week6.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excellsheet1 extends BaseClass1 {
	
	@DataProvider()
	//public String[][]sendData()throws IOException{
	//return readExcelIntegration.readExcelData();
		
	//}
	public static String[][]readExcelData(String ecxelFileName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook(",/data/"+ecxelFileName+".xlsx");
		XSSFSheet sheet =wb.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
		System.out.println("The total number of rows: "+rowCount);
		short coloumnCount= sheet.getRow(0).getLastCellNum();
		System.out.println("The total number of coloumn: "+coloumnCount);
		
		String[][]data = new String[rowCount][coloumnCount];
		for(int i=1;i<rowCount;i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for(int j=0; j<coloumnCount;j++) {
				String stringCellValue= eachRow.getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
				
			}
		}
			
		wb.close();
		return data;
			
		
	}

}
