package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports getExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("src/main/java/reports/extentreport/extentreport.html");
        reporter.config().setReportName("Extent Report | F45");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Framework Name", "Selenium Java | Jennie");
        extentReports.setSystemInfo("Author", "Jennie");
        return extentReports;
    }

}
