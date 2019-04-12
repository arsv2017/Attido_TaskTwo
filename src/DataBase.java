import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private ArrayList<Employee> employeeDataBase = new ArrayList<>();


    public ArrayList<Employee> getEmployeeDataBase() {
        return employeeDataBase;
    }


    public void addEmployee(Employee employee) {

        employeeDataBase.add(employee);

    }

    public List<Employee> getEmployees() {

        ArrayList<Employee> selection = new ArrayList<>();

        for (Employee emp : employeeDataBase) {

            selection.add(emp);
        }

        return selection;
    }

}













































































