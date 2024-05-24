package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Employee extends Person {
    private Double salary;

    public Employee(String firstName, String lastName, Double salary) {
        super(firstName,lastName);
        this.salary=salary;
        // throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("Firstname: "+firstName+" Lastname: "+lastName+" Salary: "+salary);
    }

    public Double getSalary() {
        return salary;
    }

    /**
     * Show employee information
     * @return employee information (Firstname: firstname Lastname: lastname Salary: salary)
     */
    public String showEmployeeInfo() {
       // throw new UnsupportedOperationException("Not supported yet.");
        return "Firstname: "+this.getFirstName()+" Lastname: "+this.getLastName()+" Salary: "+salary;
    }
}
