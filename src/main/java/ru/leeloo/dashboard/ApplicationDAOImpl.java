package ru.leeloo.dashboard;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationDAOImpl implements ApplicationDAO {
    @Override
    public List<Application> findAll() {
        List<Application> applications = new ArrayList<>();

        try {
            FileInputStream file = new FileInputStream("Excel.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            Application application = new Application();
            application.setId(workbook.getSheetAt(0).getRow(5).getCell(3).getStringCellValue());
            application.setType(workbook.getSheetAt(0).getRow(5).getCell(3).getStringCellValue());

            applications.add(application);
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return applications;
    }
}
