public class MyHR {
    public static void main(String[] args) 
    {
        //Create 3 offices
        Office[] offices = new Office[3];
        for (int i = 0; i < offices.length; i++) 
        {
            offices[i] = new Office();
        }

        //Create 5 addresses
        Address addr1 = new Address("Dublin", "Dublin", "123 Main St");
        Address addr2 = new Address("Cork", "Cork", "45 River Rd");
        Address addr3 = new Address("Galway", "Galway", "78 Ocean View");
        Address addr4 = new Address("Limerick", "Limerick", "10 Castle Lane");
        Address addr5 = new Address("Waterford", "Waterford", "89 Hilltop");

        //Create 5 employees
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Alice", addr1, "Staff", "", offices[0]);
        offices[0].addEmployee(employees[0]);

        employees[1] = new Employee("Bob", addr2, "Manager", "Ford Mondeo", offices[0]);
        offices[0].addEmployee(employees[1]);

        employees[2] = new Employee("Charlie", addr3, "Staff", "", offices[1]);
        offices[1].addEmployee(employees[2]);

        employees[3] = new Employee("Diana", addr4, "Manager", "Audi A4", offices[1]);
        offices[1].addEmployee(employees[3]);

        employees[4] = new Employee("Eve", addr5, "Staff", "", offices[2]);
        offices[2].addEmployee(employees[4]);

        //Print all offices and the employees assigned to them
        System.out.println("Office Overview:");
        for (int i = 0; i < offices.length; i++) 
        {
            System.out.println(offices[i].listEmployees());
            System.out.println(); // extra line for spacing
        }

        //Print all employee records
        System.out.println("All Employees:");
        for (int i = 0; i < employees.length; i++) 
        {
            System.out.println(employees[i].toString());
            System.out.println(); // extra line for spacing
        }
    }
}
