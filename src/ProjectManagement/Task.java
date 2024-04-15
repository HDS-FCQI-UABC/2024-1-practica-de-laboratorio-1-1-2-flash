package ProjectManagement;

public class Task {
    String name;
    Employee[] theEmployees;
    Resource[] theResources;

    public Task(String name, Employee[] theEmployees, Resource[] theResources) {
        this.name = name;
        this.theEmployees = theEmployees;
        this.theResources = theResources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getTheEmployees() {
        return theEmployees;
    }

    public void setTheEmployees(Employee[] theEmployees) {
        this.theEmployees = theEmployees;
    }

    public Resource[] getTheResources() {
        return theResources;
    }

    public void setTheResources(Resource[] theResources) {
        this.theResources = theResources;
    }
}
