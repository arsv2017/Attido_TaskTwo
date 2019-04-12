
//added some more new lines
public class MainApp {

    public static void main(String[] args) {

        Employee employeeOne = new Employee("Arturs", "Svarinskis", 500, 100);
        Employee employeeTwo = new Employee("John", "Johnson", 3000, 300);
        Employee employeeThree = new Employee("Peter", "Peterson", 3500, 500);
        DataBase db = new DataBase();
        db.addEmployee(employeeOne);
        db.addEmployee(employeeTwo);
        db.addEmployee(employeeThree);

        for (Employee emp : db.getEmployees()) {

            System.out.println(emp.toString());
        }

           salaryIncrease(db, 1000, 5000, 1.5);

        System.out.println("After promotion");
        for (Employee emp : db.getEmployees()) {

            System.out.println(emp.toString());
        }

    }
        public static void salaryIncrease (DataBase db,int salaryIncreaseFrom, int salaryIncreaseTo, double factor){

            for (Employee emp : db.getEmployeeDataBase())
                if (emp.getTaxeableSalary() >= salaryIncreaseFrom && emp.getTaxeableSalary() <= salaryIncreaseTo) {
                    emp.increaseSalary(factor);


                }


        }
    }

