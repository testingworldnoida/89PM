package org.hcl.testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="dp_excel")
	public static Object[][] testData1() throws IOException
	{
		File f = new File("E:\\ReadyAPI.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wk = new XSSFWorkbook(fs);
		XSSFSheet s1 = wk.getSheet("Sheet1");
		
		int r = s1.getPhysicalNumberOfRows();
		Object [][] arr = new Object[r][2];
		
		for(int i=0;i<r;i++)
		{
			XSSFRow r1 = s1.getRow(i);
			XSSFCell cu = r1.getCell(0);
			XSSFCell cp = r1.getCell(1);
		    arr[i][0] =  cu.getStringCellValue();
		    arr[i][1] =  cp.getStringCellValue();
		}
	return arr;
	}
	
}
