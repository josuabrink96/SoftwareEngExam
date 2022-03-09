package gmit.ie;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employeeList;

    public EmployeeList() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        for(Employee i : employeeList) {
            if(e.getPPS().equals(i.getPPS())) {
                throw new IllegalArgumentException("Employee already exists in list");
            }
        }
        employeeList.add(e);
    }

    public int getListSize() {
        return employeeList.size();
    }
}
