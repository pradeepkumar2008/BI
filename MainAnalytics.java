import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;
public class MainAnalytics {
    public static void main(String[] args) {
        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();
        s.printSales();
        e.printEmployeePerformance();
    }
}