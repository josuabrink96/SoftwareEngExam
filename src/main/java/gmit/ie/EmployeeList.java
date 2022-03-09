package gmit.ie;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employeeList;

    public EmployeeList() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        if(e != null) {
            for(Employee i : employeeList) {
                if(e.getPPS().equals(i.getPPS())) {
                    throw new IllegalArgumentException("Employee already exists in list");
                }
            }
            employeeList.add(e);
        }
        else {
            throw new IllegalArgumentException("Unable to add null to list");
        }
    }

    public int getListSize() {
        return employeeList.size();
    }
}
