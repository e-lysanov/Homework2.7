import exceptions.EmployeeAlreadyAddedException;
import exceptions.EmployeeNotFoundException;
import exceptions.EmployeeStorageIsFullException;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBookImpl implements EmployeeBook {

    public Map<String, Employee> Employees;

    public EmployeeBookImpl() {
        this.Employees = new HashMap<>();
    }

    @Override
    public void addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (Employees.size() > 3) {
            throw new EmployeeStorageIsFullException("Employee storage is full");
        } else if (Employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException(employee.getFullName() + " is already added");
        } else {
            Employees.put(employee.getFullName(), employee);
            System.out.println(employee.getFullName()  + " added");
        }
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (Employees.containsKey(employee.getFullName())) {
            System.out.println(employee.getFullName()  + " removed");
            Employees.remove(employee.getFullName());
        } else {
            throw new EmployeeNotFoundException(employee.getFullName() + " don^t finded");
        }
    }

    @Override
    public void findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (Employees.containsKey(employee.getFullName())) {
            System.out.println(employee.getFullName() + " finded");
        } else {
            throw new EmployeeNotFoundException(employee.getFullName() + " don^t finded");
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
