import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EmployeeBook {
    void addEmployee(String fullName, int salary);

    void removeEmployee(String fullName);

    void findEmployee(String fullName);
}
