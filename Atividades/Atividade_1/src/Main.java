import entities.Employee;
import service.PensionService;
import service.SalaryService;
import service.TaxService;

public class Main {

    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        Employee employee = new Employee("Maria", 4000.00);


        System.out.println(employee.getName() + ": " +salaryService.netSalary(employee));
    }
}