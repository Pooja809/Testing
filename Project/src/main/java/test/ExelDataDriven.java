package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelDataDriven 
{

	public ArrayList<String> getExcelData(String testCaseName)  throws IOException
	{
			//ArrayList
			ArrayList<String> array = new ArrayList<String>();
			
			//file input stream argument
			FileInputStream fis = new FileInputStream("C://Software_Testing//test2.xlsx");
			XSSFWorkbook workBook = new XSSFWorkbook(fis);	
			
			int sheets = workBook.getNumberOfSheets();
			for(int i=0;i<sheets;i++)
			{
				if(workBook.getSheetName(i).equalsIgnoreCase("testdata1")) 
				{
					XSSFSheet sheet =  workBook.getSheetAt(i);
					
					//Identify testcases coloum by scanning the entire row
					
					Iterator<Row> rows = sheet.iterator();
					
					//Identify perticular row
					Row firstRow = rows.next();
					
					Iterator<Cell> cell1 =  firstRow.cellIterator();
					
					int coloum = 0 , k=0;
					
					while(cell1.hasNext())
					{
						Cell cellValue = cell1.next();
						
						if(cellValue.getStringCellValue().equalsIgnoreCase("TestCases"))
						{
							//desired coloum
							coloum = k;
						}
						k++;
					}
					System.out.println(coloum);			
					
					//once coloum is identified then scan entire testcases coloum to identify perticular testcase row
					
					while(rows.hasNext())
					{
						Row rw = rows.next();
						if(rw.getCell(coloum).getStringCellValue().equalsIgnoreCase(testCaseName))
						{
							//after you grab perticular testcase row = pull all the data of that row & feed into test
							Iterator<Cell> cell2 = rw.cellIterator();
							while(cell2.hasNext())
							{
								// System.out.println(cell2.next().getStringCellValue());
								
								//check value is numeric
								Cell cell3 = cell2.next();
								if(cell3.getCellTypeEnum() == CellType.STRING)
								{
									//adding data into arraylist
									array.add(cell3.getStringCellValue());
								}
								else
								{
									array.add(NumberToTextConverter.toText(cell3.getNumericCellValue()));
								}	
							}
						}
					}						
				}
			}
			return array;
	}
}
