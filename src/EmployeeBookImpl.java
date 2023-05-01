import exceptions.EmployeeAlreadyAddedException;
import exceptions.EmployeeNotFoundException;
import exceptions.EmployeeStorageIsFullException;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBookImpl implements EmployeeBook {

    public Map<String, Integer> Employees;

    public EmployeeBookImpl() {
        this.Employees = new HashMap<>();
    }

    @Override
    public void addEmployee(String fullName, int salary) {
        if (Employees.size() > 3) {
            throw new EmployeeStorageIsFullException("Employee storage is full");
        } else if (Employees.containsKey(fullName)) {
            throw new EmployeeAlreadyAddedException(fullName + " с зарплатой " + Employees.get(fullName)  + " is already added");
        } else {
            Employees.put(fullName, salary);
            System.out.println(fullName + " с зарплатой " + Employees.get(fullName)  + " added");
        }
    }

    @Override
    public void removeEmployee(String fullName) {
        if (Employees.containsKey(fullName)) {
            System.out.println(fullName + " с зарплатой " + Employees.get(fullName)  + " removed");
            Employees.remove(fullName);
        } else {
            throw new EmployeeNotFoundException(fullName + " don^t finded");
        }
    }

    @Override
    public void findEmployee(String fullName) {
        if (Employees.containsKey(fullName)) {
            System.out.println(fullName + " с зарплатой " + Employees.get(fullName) + " finded");
        } else {
            throw new EmployeeNotFoundException(fullName + " don^t finded");
        }
    }



//    List<String> Employees = new ArrayList<>();
//
//    @Override
//    public String addEmployee(String fullName, int salary) {
//        Employee employee = new Employee(fullName, salary);
//        if (Employees.size() > 1) {
//            throw new EmployeeStorageIsFullException("Employee storage is full");
//        } else if (Employees.contains(String.valueOf(employee))) {
//            throw new EmployeeAlreadyAddedException("Employee is already added");
//        } else {
//            Employees.add(String.valueOf(employee));
//        }
//        return employee.toString();
//    }

//    @Override
//    public String removeEmployee(String fullName, int salary) {
//        Employee employee = new Employee(fullName, salary);
//        if (Employees.contains(String.valueOf(employee))) {
//            return "Employee removed";
//        } else {
//            throw new EmployeeNotFoundException("Employee don^t finded");
//        }
//    }

//    @Override
//    public String findEmployee(String fullName, int salary) {
//        Employee employee = new Employee(fullName, salary);
//        if (Employees.contains(String.valueOf(employee))) {
//            return "Employee finded";
//        } else {
//            throw new EmployeeNotFoundException("Employee don^t finded");
//        }
//    }
}
