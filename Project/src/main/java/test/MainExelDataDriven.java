package test;

import java.io.IOException;
import java.util.ArrayList;

public class MainExelDataDriven 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		ExelDataDriven dataDriven = new ExelDataDriven();
		ArrayList arrayData = dataDriven.getExcelData("AddProfile");
		
		System.out.println(arrayData.get(0));
		System.out.println(arrayData.get(1));
		System.out.println(arrayData.get(2));
		System.out.println(arrayData.get(3));
		
			
		//if you want to pass data to the url then you can send dta to the browser by using selenium
	}

}
