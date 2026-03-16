package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constantsData.ConstantsData;

public class Fetchdatafromexcelfile {
	
	public static  String getDataFromExcel(int x,int y) throws IOException
	{
	 FileInputStream fs=new  FileInputStream(ConstantsData.Excel_path);
	 XSSFWorkbook workbook=new XSSFWorkbook(fs);
	 XSSFSheet sheet=workbook.getSheetAt(0); //index//
	 XSSFCell val= sheet.getRow(x).getCell(y); //it returns byte format//
	 String URL=val.toString();// converting it to string and storing it in a variable"URL"//
	 return URL;
	}

}
