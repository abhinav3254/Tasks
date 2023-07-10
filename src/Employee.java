public class Employee {
    private String empId;
    private String name;
    private String designation;
    private String salary;
    private String experience;
    private String contactNumber;

    public Employee() {
    }

    public Employee(String empId, String name, String designation, String salary, String experience, String contactNumber) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.experience = experience;
        this.contactNumber = contactNumber;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary='" + salary + '\'' +
                ", experience='" + experience + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
