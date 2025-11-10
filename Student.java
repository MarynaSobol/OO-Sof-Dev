package lab6;

public class Student extends Person {
    private int numCourses = 0;
    // Using a smaller, fixed size for simplicity
    private String[] courses = new String[10]; 
    private int[] grades = new int[10]; 

    public Student(String name, String address) {
        // Calls the constructor in the Person superclass
        super(name, address); 
    }

    // Adds a course and its grade to the parallel arrays
    public void addCourseGrade(String course, int grade) {
        if (numCourses < courses.length) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        }
    }

    // Calculates the average grade
    public double getAverageGrade() {
        if (numCourses == 0) return 0.0;
        
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    // Prints the student's name, address, and all course grades
    public void printGrades() {
        System.out.print("Student: " + super.toString() + " ");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i] + ":" + grades[i] + (i < numCourses - 1 ? " " : ""));
        }
        System.out.println();
    }

    // Overrides the Person's toString to include the class type
    @Override
    public String toString() {
        return "Student: " + super.toString(); 
    }
}
