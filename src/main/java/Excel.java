import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

;

public class Excel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("/Users/leeloo/dev/dashboard/Excel.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        String result = workbook.getSheetAt(0).getRow(3).getCell(3).getStringCellValue();
        System.out.println(result);
        file.close();
    }
}

