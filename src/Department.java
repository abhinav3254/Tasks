import java.util.Arrays;

public class Department {
    // id name location employee[]
    private String id;
    private String name;
    private String expertise;
    private String Budget;
    private Employee[] employees;

    public Department() {
    }

    public Department(String id, String name, String expertise, String budget, Employee[] employees) {
        this.id = id;
        this.name = name;
        this.expertise = expertise;
        Budget = budget;
        this.employees = employees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getBudget() {
        return Budget;
    }

    public void setBudget(String budget) {
        Budget = budget;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", expertise='" + expertise + '\'' +
                ", Budget='" + Budget + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
