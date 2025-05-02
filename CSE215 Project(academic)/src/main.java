
public class Main {
	
	public static void main(String[] args) {
		
		    Course CSE215 = new Course("Programming Language 2", "215");
		    Course CSE115 = new Course("Programming Language 1", "115");
		    Course CSE225 = new Course("Data Structures and Algorithms", "225");
		    Course CSE331 = new Course("Microprocessors", "331");
		    Course CSE311 = new Course("Database Management", "311");
		    Course CSE323 = new Course("Operatings Systems", "323");
		    Course CSE231 = new Course("DLD", "231");

		    // Task 1
		    System.out.println("----------------------- Task 1 -----------------------");
		    
		    Student student1 = new Student("Dave Mustaine",23,"mirpur, dhaka-1216",3.1,"16112839234");
		    student1.addCourse(CSE215);
		    student1.addCourse(CSE115);
		    student1.addCourse(CSE225);
		    student1.addCourse(CSE331);
		    student1.addCourse(CSE311);
		    
		    System.out.println(student1.toString());
		    student1.printCourses();


		    //Task 2
		    System.out.println("----------------------- Task 2 -----------------------");

		    student1.addCourse(CSE323);
		    student1.addCourse(CSE231);

		    System.out.println(student1.toString());
		    student1.printCourses();



		    //Task 3
		    System.out.println("----------------------- Task 3 -----------------------");

		    Student student2 = new Student("Dimebag",24,"Dhanmondi, dhaka-1207",2.4,"17112184642");
		    student2.addCourse(CSE215);
		    student2.addCourse(CSE115);
		    student2.addCourse(CSE225);
		    student2.addCourse(CSE331);
		    student2.addCourse(CSE311);

		    System.out.println(student2.toString());
		    student2.printCourses();

		    
		    
		    //Task 4
		    System.out.println("----------------------- Task 4 -----------------------");

		    PermanentFaculty P_Faculty1 = new PermanentFaculty("Slash", 30, "Mirpur");
		    
		    P_Faculty1.addCourse(CSE225);
		    P_Faculty1.addCourse(CSE231);
		    P_Faculty1.addCourse(CSE323);
		    P_Faculty1.addCourse(CSE115);

		    System.out.println(P_Faculty1.toString());
		    P_Faculty1.printCourses();

		    
		    //Task 5
		    System.out.println("----------------------- Task 5 -----------------------");

		    P_Faculty1.addCourse(CSE215);
		    P_Faculty1.addCourse(CSE115);
		    P_Faculty1.addCourse(CSE311);
		    P_Faculty1.addCourse(CSE323);

		    System.out.println(P_Faculty1.toString());
		    P_Faculty1.printCourses();
		   


	  }
	}
