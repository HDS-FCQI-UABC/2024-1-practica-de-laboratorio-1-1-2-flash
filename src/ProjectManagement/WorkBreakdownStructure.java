package ProjectManagement;

public class WorkBreakdownStructure {
    String name;
    Task[] theTasks;

    public WorkBreakdownStructure(String name, Task[] theTasks) {
        this.name = name;
        this.theTasks = theTasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task[] getTheTasks() {
        return theTasks;
    }

    public void setTheTasks(Task[] theTasks) {
        this.theTasks = theTasks;
    }
}
