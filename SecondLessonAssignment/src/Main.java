
public class Main {
	public static void main(String[] args) {
		
	
	Courses course1 = new Courses(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demirog", 28);
	
	Courses course2 = new Courses(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demirog", 0);
	
	Courses[] courseList = {course1,course2};
	
	CourseManager courseManager1 = new CourseManager();
	
	courseManager1.yourLecturer();
	courseManager1.skipToNextLesson();
	
	
	
	}
}
