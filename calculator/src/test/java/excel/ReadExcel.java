package excel;
import org.apache.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	private static XSSFSheet ExcelSheet;

	private static XSSFWorkbook ExcelBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	
	public static String[][] getTableArray(String FilePath, String SheetName) throws Exception {  

		   String[][] tabArray = null;

		   try {

			   FileInputStream ExcelFile = new FileInputStream(FilePath);

			   ExcelBook = new XSSFWorkbook(ExcelFile);

			   ExcelSheet = ExcelBook.getSheet(SheetName);

			   int startRow = 1;

			   int startCol = 0;

			   int ci,cj;

			   int totalRows = ExcelSheet.getLastRowNum();

			   int totalCols = 2;

			   tabArray=new String[totalRows][totalCols];

			   ci=0;

			   for (int i=startRow;i<=totalRows;i++, ci++) {           	   

				  cj=0;

				   for (int j=startCol;j<=totalCols;j++, cj++){

					   tabArray[ci][cj]=getCellData(i,j);

					   System.out.println(tabArray[ci][cj]);  

						}

					}

				}

			catch (FileNotFoundException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

				}

			catch (IOException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

				}

			return(tabArray);

	}
	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try{

			Cell = ExcelSheet.getRow(RowNum).getCell(ColNum);

			int dataType = Cell.getCellType();

			if  (dataType == 3) {

				return "";

			}
			
			else
				
			{

				String CellData =String.valueOf(Cell.getNumericCellValue());

				return CellData;

			}}
			catch (Exception e)
			{

			System.out.println(e.getMessage());

			throw (e);

			}
	}}
	



