package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName) {
        this.lastName = "";
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Person(String firstName, String lastName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
