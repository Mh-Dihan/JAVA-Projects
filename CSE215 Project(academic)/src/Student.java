/*Muhaiminul Hasan Dihan writes this class
 * ID: 2111208642*/


import java.util.Arrays;

public class Student extends Person  {

	    private double cgpa;
	    private String id;
	    private Course[] courses;
	    private int numberOfCourses = 0;

	    public Student(){
	        courses = new Course[6];
	    }

	    public Student(String name, int age, String address, double cgpa, String id){
	        super(name, age, address);
	        this.cgpa = cgpa;
	        this.id = id;
	        if (cgpa<2.5) {
	            courses = new Course[4];
	        }else{
	            courses = new Course[6];
	        }
	    }


	    public double getCgpa() {
	        return this.cgpa;
	    }

	    public void setCgpa(double cgpa) {
	        this.cgpa = cgpa;
	    }

	    public String getId() {
	        return this.id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public Course[] getCourses() {
	        return this.courses;
	    }

	    public int getNumberOfCourses() {
	        return this.numberOfCourses;
	    }

	    public void addCourse(Course newCourse){
	        if(numberOfCourses<courses.length){
	            courses[numberOfCourses] = newCourse;
	            numberOfCourses++;
	        }else{
	            System.out.println("You are not allowed to take more than " + courses.length + " courses \n");
	        }
	        
	    }

	    public void printCourses(){
	        for (int i = 0; i < numberOfCourses; i++) {
	             System.out.print(courses[i].toString());
	        }
	        System.out.println();
	    }




	    @Override
	    public String toString(){
	        return super.toString() + 
	                "cgpa: " + getCgpa() + "\n" +
	                "id: " + getId() + "\n";
	    }

	}
	