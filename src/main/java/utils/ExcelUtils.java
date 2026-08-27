package utils;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

public class ExcelUtils {

    public static Object[][] getSheetData(String TestData, String sheetName) {
        Object[][] data = null;

        try {
            FileInputStream fis = new FileInputStream(TestData);
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheet(sheetName);

            int rows = sheet.getPhysicalNumberOfRows();
            int cols = sheet.getRow(0).getLastCellNum();

            data = new Object[rows - 1][cols];

            for (int i = 1; i < rows; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < cols; j++) {
                    data[i - 1][j] = row.getCell(j).toString();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}
