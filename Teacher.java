package lab6;

public class Teacher extends Person {
    private int numCourses = 0;
    // Using a smaller, fixed size for simplicity
    private String[] courses = new String[5]; 

    public Teacher(String name, String address) {
        // Calls the constructor in the Person superclass
        super(name, address); 
    }

    // Adds a course if it's not already listed and the array isn't full
    public boolean addCourse(String course) {
        // Check for duplicate course
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; 
            }
        }
        
        // Add course if there is space
        if (numCourses < courses.length) {
            courses[numCourses] = course;
            numCourses++;
            return true; 
        } else {
            return false; // Array full
        }
    }

    // Removes a course by shifting array elements
    public boolean removeCourse(String course) {
        int index = -1;

        // Find the course's position
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false; // Course not found
        }

        // Shift elements left to fill the gap
        for (int i = index; i < numCourses - 1; i++) {
            courses[i] = courses[i + 1];
        }

        numCourses--;
        return true; 
    }

    // Overrides the Person's toString to include the class type
    @Override
    public String toString() {
        return "Teacher: " + super.toString(); 
    }
}
