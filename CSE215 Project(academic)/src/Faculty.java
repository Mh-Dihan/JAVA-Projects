/*Ashraful Islam writes this class
 * ID: 2111765642*/

public abstract class Faculty extends Person {

	 public Faculty() {
	    }

	    public Faculty(String name, int age, String address){
	        super(name, age, address);
	    }

	    public abstract void addCourse(Course newCourse);
	    public abstract void printCourses();
	    public abstract int getNumberOfCourses();
	    public abstract double getSalary();

	    public String toString(){
	        return  "name: " + getName() + "\n" +
	                "age: " + getAge() + "\n" +
	                "address: " + getAddress() + "\n";
	    }
	    
	}
