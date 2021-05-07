
public class Student extends User {
	private String grade;
	private int gpo;
	private String department;
	
	
	public Student(int id, String firstName, String lastName, String email, String password, String grade, int gpo,
			String department) {
		super(id, firstName, lastName, email, password);
		this.grade = grade;
		this.gpo = gpo;
		this.department = department;
	}

	public Student() {
		
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getGpo() {
		return gpo;
	}

	public void setGpo(int gpo) {
		this.gpo = gpo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
