import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ru.leeloo.dashboard.Application;
import ru.leeloo.dashboard.ApplicationDAOImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

;

public class Excel {
    public static void main(String[] args) throws IOException {
        List<Application> applications = new ApplicationDAOImpl().findAll();
        System.out.println(applications);
    }
}

