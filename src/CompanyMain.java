public class CompanyMain {
    public static void main(String[] args) {

        // int empId, String name, String designation, double salary, int experience, String contactNumber
        Employee employee = new Employee("1001","John Smith","Senior Manager","$80,000","10 years","+1 555-1234-567");

        Employee[] employeesList = new Employee[5];
        employeesList[0] = new Employee("001","John Smith","Senior Manager","$80,000","8 years","+1 555-123-4567");
        employeesList[1] = new Employee("002","Emily Johnson","Software Engineer","$60,000","2 years","+1 148-123-4567");
        employeesList[2] = new Employee("003","Michael Davis","Sales Associate","$40,000","6 years","+1 666-654-4567");
        employeesList[3] = new Employee("004","Sarah Anderson","HR Specialist","$75,000","12 years","+1 222-987-4567");
        employeesList[4] = new Employee("005","David Thompson","Marketing Manager","$95,000","5 years","+1 111-321-4567");


        //System.out.println(employee);

        // String id, String name, String expertise, String budget, Employee[] employees
        Department department = new Department("1050","Information Technology","IT Services","$1,000,000",employeesList);
        //System.out.println(department);


        Department[] departmentsList = new Department[5];
        departmentsList[0] = new Department("001", "Finance", "Financial Management", "$500,000",employeesList);
        departmentsList[1] = new Department("002", "Marketing", "Digital Marketing", "$300,000",employeesList);
        departmentsList[2] = new Department("003", "IT", "Software Development", "$700,000",employeesList);
        departmentsList[3] = new Department("004", "Human Resources", "Employee Relations", "$400,000",employeesList);
        departmentsList[4] = new Department("005", "Operations", "Supply Chain Management", "$600,000",employeesList);

        // String companyName, String location, int size, double value, Department[] departments

        Company company = new Company("ABC Corp", "New York", 1000, 10_000_000.0,departmentsList);
        System.out.println(company);

    }
}
