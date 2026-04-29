package utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import testbase.BaseTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExportVehicleDetails {
    static Workbook workbook = new XSSFWorkbook();
    public static void writeBikeDetailsToExcel(List<String> names, List<String> prices, List<String> dates) throws IOException {

        Sheet sheet1 = workbook.createSheet("BikeDetails");
        Row header = sheet1.createRow(0);
        header.createCell(0).setCellValue("Bike Name");
        header.createCell(1).setCellValue("Bike Price");
        header.createCell(2).setCellValue("Launch Date");
        for (int i = 0; i < names.size(); i++) {
            Row row = sheet1.createRow(i + 1);
            row.createCell(0).setCellValue(names.get(i));
            row.createCell(1).setCellValue(prices.get(i));
            row.createCell(2).setCellValue(dates.get(i));
        }
        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "/src/test/resources/testData/VehicleDetails.xlsx");
        workbook.write(fos);
    }

    public static void writeAllBikeDetailsToExcel(List<String> allBikenames) throws IOException {

        Sheet sheet2 = workbook.createSheet("AllBikeDetails");
        Row header = sheet2.createRow(0);
        header.createCell(0).setCellValue("Bike Names");
        for (int i = 0; i < allBikenames.size(); i++) {
            Row row = sheet2.createRow(i + 1);
            row.createCell(0).setCellValue(allBikenames.get(i));
        }
        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "/src/test/resources/testData/VehicleDetails.xlsx");
        workbook.write(fos);
    }

    public static void writeCarDetails(List<String> carDetails) throws IOException {
        Sheet sheet3 = workbook.createSheet("CarDetails");
        Row header1 = sheet3.createRow(0);
        header1.createCell(0).setCellValue("Car Models");
        for (int i = 0; i < carDetails.size(); i++) {
            Row row = sheet3.createRow(i + 1);
            row.createCell(0).setCellValue(carDetails.get(i));
        }
        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "/src/test/resources/testData/VehicleDetails.xlsx");
        workbook.write(fos);
        workbook.close();
    }
}