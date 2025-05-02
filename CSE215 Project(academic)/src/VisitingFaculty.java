/*Ashraful Islam writes this class
 * ID: 2111765642*/


import java.util.Arrays;

public class VisitingFaculty extends Faculty {

	 private final double BASIC_SALARY = 4000;
	    private Course[] courses;
	    private int numberOfCourses = 0;

	    public VisitingFaculty(){
	        courses = new Course[3];
	    }

	    public VisitingFaculty(String name, int age, String address){
	        super(name, age, address);
	        courses = new Course[3];
	    }

	    public void addCourse(Course newCourse) {
	        if(numberOfCourses < courses.length){
	            courses[numberOfCourses] = newCourse;
	            numberOfCourses++;
	        }else{
	            System.out.println("Cannot add course, Course limit reached\n");
	        }
	    }

	    public void printCourses() {
	        for (int i = 0; i < numberOfCourses; i++) {
	            System.out.print(courses[i].toString());
	        }
	        System.out.println();
	    }

	    public int getNumberOfCourses() {
	        return this.numberOfCourses;
	    }

	    public double getSalary() {
	        double salary = BASIC_SALARY + (numberOfCourses)*(BASIC_SALARY*0.20);
	        return salary;
	    }

	    
	    @Override
	    public String toString(){
	        return  super.toString() +
	                "salary: " + getSalary() + "\n";
	    }
	    
	}