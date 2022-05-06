package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {

	public static void write_Data() throws Throwable {

		File f = new File("C:\\Users\\Sundar\\eclipse-workspace\\Training\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet createSheet = w.createSheet("user1");

		Row createRow = createSheet.createRow(0);

		Cell createCell = createRow.createCell(0);

		createCell.setCellValue("Saravanan");

		w.getSheet("user1").getRow(0).createCell(1).setCellValue("123");
		
		w.getSheet("user1").createRow(1).createCell(0).setCellValue("Suganya");
		
		w.getSheet("user1").getRow(1).createCell(1).setCellValue("525");
		
		w.getSheet("user1").createRow(2).createCell(0).setCellValue("Gayathri");
		
		w.getSheet("user1").getRow(2).createCell(1).setCellValue("255");
		
		w.getSheet("user1").createRow(3).createCell(0).setCellValue("Sekar");
		
		w.getSheet("user1").getRow(3).createCell(1).setCellValue("652");

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		w.close();

	}
	public static void main(String[] args) throws Throwable {


		write_Data();
	}





















}
