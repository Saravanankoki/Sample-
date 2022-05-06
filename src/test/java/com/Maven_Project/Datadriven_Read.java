package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {

	public static void read_All_Data() throws Throwable {


		File f = new File("C:\\Users\\Sundar\\eclipse-workspace\\Training\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		int numberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i <numberOfRows ; i++) {

			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells ; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();
					System.out.println(value);

				}
				else if (cellType.equals(CellType.NUMERIC)) {

					double value = cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(num);


				}
			}
		}
	}
	public static void read_Particular_Data() throws Throwable {

		File f = new File("C:\\Users\\Sundar\\eclipse-workspace\\Training\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(3);

		Cell cell = row.getCell(1);

		CellType type = cell.getCellType();

		if (type.equals(CellType.STRING)) {
			String value = cell .getStringCellValue();
			System.out.println(value);

		}
		else if (type.equals(CellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			int num = (int) value;
			System.out.println(num);

		}



	}
	public void read_Particular_Column() throws Throwable {
		
		File f = new File("C:\\Users\\Sundar\\eclipse-workspace\\Training\\Maven_Project\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		

		
		

	}
	public static void main(String[] args) throws Throwable {
		read_All_Data();
		read_Particular_Data();
	}














}

