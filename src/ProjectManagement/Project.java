package ProjectManagement;

public class Project {
    String name;
    Resource[] theResources;
    Employee[] theEmployees;
    WorkBreakdownStructure theWorkBreakdownStructure;

    public Project(String name, Resource[] theResources, Employee[] theEmployees, WorkBreakdownStructure theWorkBreakdownStructure) {
        this.name = name;
        this.theResources = theResources;
        this.theEmployees = theEmployees;
        this.theWorkBreakdownStructure = theWorkBreakdownStructure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Resource[] getTheResources() {
        return theResources;
    }

    public void setTheResources(Resource[] theResources) {
        this.theResources = theResources;
    }

    public Employee[] getTheEmployees() {
        return theEmployees;
    }

    public void setTheEmployees(Employee[] theEmployees) {
        this.theEmployees = theEmployees;
    }

    public WorkBreakdownStructure getTheWorkBreakdownStructure() {
        return theWorkBreakdownStructure;
    }

    public void setTheWorkBreakdownStructure(WorkBreakdownStructure theWorkBreakdownStructure) {
        this.theWorkBreakdownStructure = theWorkBreakdownStructure;
    }
}
