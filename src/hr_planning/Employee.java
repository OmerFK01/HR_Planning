
package hr_planning;

/**
 *
 * @author Omer Khan
 */
public class Employee {

    private String name;
    private double Salary;
    private EmployeeEnum e1;
       
    public Employee(String name, double salary, EmployeeEnum e1){
        this.name = name;
        this.e1 = e1;
        this.Salary = Salary;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public EmployeeEnum getE1() {
        return e1;
    }

    public void setE1(EmployeeEnum e1) {
        this.e1 = e1;
    }
}
