package dataProvider;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;



	public class ExcelDataProvider {

		XSSFWorkbook wb;
		XSSFSheet sheet;
		
		public ExcelDataProvider() 
		{
			try{
		
			File src=new File("./ApplicationTestData/AppData.xlsx");
			FileInputStream fis=new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
			} catch (Exception e)
			{
				System.out.println("Exception is" +e.getMessage());
			}
			
		}
		
		public String getData(int sheetno, int row, int col)
		{
			sheet= wb.getSheetAt(sheetno);
			String data=sheet.getRow(row).getCell(col).getStringCellValue();
			return data;

		}
		
		public String getData(String sheetname, int row, int col)
		{
			sheet= wb.getSheet(sheetname);
			String data=sheet.getRow(row).getCell(col).getStringCellValue();
			return data;

		}
		
		public int getRow(int sheetno)
		{
			int row_no=wb.getSheetAt(sheetno).getLastRowNum();
			int row =row_no+1;
			return row;
			
			}
	}


}
