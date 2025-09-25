package googleProject;
import java.io.*;
import java.time.LocalDateTime;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class ExcelUtility {
    private static final String filePath = System.getProperty("user.dir") + File.separator + "Reports"+File.separator+"Book.xlsx";
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    static {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                workbook = new XSSFWorkbook(fis);
                sheet = workbook.getSheetAt(0);
            } else {
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Sheet1");

                XSSFRow header = sheet.createRow(0);
                header.createCell(0).setCellValue("Test Name");
                header.createCell(1).setCellValue("Output");
                header.createCell(2).setCellValue("Timestamp");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeResult(String testName, String output) {
        int rowCount = sheet.getLastRowNum();
        Row row = sheet.createRow(rowCount + 1);
        row.createCell(0).setCellValue(testName);
        row.createCell(1).setCellValue(output);
        row.createCell(2).setCellValue(LocalDateTime.now().toString());

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 