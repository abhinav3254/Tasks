import java.util.Arrays;

public class Company {
    private String companyName;
    private String location;
    private int size;
    private double value;
    private Department[] departments;

    public Company() {
    }

    public Company(String companyName, String location, int size, double value, Department[] departments) {
        this.companyName = companyName;
        this.location = location;
        this.size = size;
        this.value = value;
        this.departments = departments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", size=" + size +
                ", value=" + value +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}
