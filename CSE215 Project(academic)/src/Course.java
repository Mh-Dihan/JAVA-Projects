/*Muhaiminul Hasan Dihan writes this class
 * ID: 2111208642*/


public class Course extends Student {

	private String nameofCourse;
	private String courseCode;
	
	public Course() {
		
	}
	public Course(String nameofCourse,String courseCode) {
		this.courseCode = courseCode;
		this.nameofCourse = nameofCourse;
		
	}
	
	public String getNameofCourse() {
		return nameofCourse;
	}
	public void setNameofCourse(String nameofCourse) {
		this.nameofCourse = nameofCourse;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	@Override
	public String toString() {
		return "Course [nameofCourse=" + nameofCourse + ", courseCode=" + courseCode + "]";
	}
	

}

