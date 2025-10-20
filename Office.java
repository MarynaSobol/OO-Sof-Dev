class Address
{
    private String street;
    private String city;
    private String county;

    public Address(String city, String county, String street)
    {
        setCity(city);
        setCounty(county);
        setStreet(street);
    }
    public Address()
    {
        setStreet("");
        setCounty("");
        setCity("");
    }

    // Getters and Setters
    public void setCity(String city) 
    {
        this.city = city;
    }
    public void setCounty(String county) 
    {
        this.county = county;
    }
    public void setStreet(String street) 
    {
        this.street = street;
    }
    public String getCity() 
    {
        return city;
    }
    public String getCounty() 
    {
        return county;
    }
    public String getStreet() 
    {
        return street;
    }

    //ToString
    public String toString() {
        
        return "The Street :" + street + 
        " The County: " + county + 
        " The City: " + city;
    }
    
}
class Employee
{
    private static int employeeNumberCounter = 1000;  // auto increment employee number
    private static int countOfEmp = 0;                 // total employees count

    private int numOfEmp;
    private String name;
    private String employeeType;  // "Staff" or "Manager"
    private String carDetails;    // for Manager only
    private Address address;
    private Office office;        // assigned office
    

    // Constructor
    public Employee(String name, Address address, String employeeType, String carDetails, Office office) 
    {
        this.numOfEmp = employeeNumberCounter++;
        this.name = name;
        this.address = address;
        this.employeeType = employeeType;
        this.carDetails = carDetails;
        this.office = office;
        countOfEmp++;
    }

    // Getters
    public static int getCountOfEmp() {
        return countOfEmp;
    }

    public int getNumOfEmp() {
        return numOfEmp;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public Office getOffice() 
    {
        return office;
    }


    //ToString
    public String toString() 
    {
        String result = "Employee Number: " + numOfEmp + 
        ", Name: " + name + 
        ", Type: " + employeeType + 
        ", Address: " + address.toString() +  
        ", Office: " + office.getRoomNumber();
        
        if (employeeType.equals("Manager")) 
        {
            result += ", Car: " + carDetails;
        }
        
        return result;
    }


}

public class Office 
{
    private static int roomCounter = 100;   // static room number counter
    private int roomNumber;
    private Employee[] employees;           // fixed array to hold max 2 employees
    private int employeeCount;              // current number of employees assigned

    public Office() 
    {
        this.roomNumber = roomCounter++;
        this.employees = new Employee[2];  // max 2 employees
        this.employeeCount = 0;
    }

    // Adds employee if less than 2 assigned, returns true if successful
    public boolean addEmployee(Employee e) 
    {
        if (employeeCount < 2) {
            employees[employeeCount] = e;
            employeeCount++;
            return true;
        }
        return false;
    }

    public int getEmployeeCount() 
    {
        return employeeCount;
    }

    public int getRoomNumber() 
    {
        return roomNumber;
    }

    // List employees in the office
    public String listEmployees() 
    {
        StringBuilder sb = new StringBuilder("Office " + roomNumber + " employees:\n");
        for (int i = 0; i < employeeCount; i++) {
            sb.append(employees[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public String toString()
    {
        return "Office Number: " + roomNumber + " (Employees Assigned: " + employeeCount + ")";
    }
}
