/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
    /**
     * The emplyees name.
     */
    private String myName;
    /**
     * The employees manager.
     */
    private String myManager;

    /**
     * Constructor for initialization.
     * @param name The employees name
     * @param manager The managers name.
     */
    public Employee(final String name, final String manager) {
        myName = name;
        myManager = manager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return myName;
    }

    /**
     * Setter for name.
     * @param name the new name of the employee.
     */
    public void setName(final String name) {
        myName = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return myManager;
    }

    /**
     * Setter for manager.
     * @param manager The new manager.
     */
    public void setManager(final String manager) {
        myManager = manager;
    }
}
