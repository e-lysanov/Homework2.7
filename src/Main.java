import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        EmployeeBookImpl Employees = new EmployeeBookImpl();

//        Map<String, Integer> Employees = new HashMap<>();

        Employees.addEmployee("Антон Чехов", 100_000);
        Employees.addEmployee("Лев Толстой", 70_000);

        Employees.findEmployee("Лев Толстой");
        Employees.findEmployee("Антон Чехов");

        Employees.removeEmployee("Антон Чехов");
        Employees.findEmployee("Антон Чехов");

    }
}