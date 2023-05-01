import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        EmployeeBookImpl Employees = new EmployeeBookImpl();

        Employees.addEmployee("Антон", "Чехов");
        Employees.addEmployee("Лев", "Толстой");

        Employees.findEmployee("Лев", "Толстой");
        Employees.findEmployee("Антон", "Чехов");

        Employees.removeEmployee("Антон", "Чехов");
        Employees.findEmployee("Антон", "Чехов");

    }
}