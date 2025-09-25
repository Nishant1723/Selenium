package googleProject;
import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class ExcelUtility {
    private static final String filePath = System.getProperty("user.dir") + File.separator + "Reports"+File.separator+"Book4.xlsx";
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
                header.createCell(0).setCellValue("Console Output");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeResult(String consoleOutput) {
        int rowCount = sheet.getLastRowNum();
        Row row = sheet.createRow(rowCount + 1);
        row.createCell(0).setCellValue(consoleOutput);

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 