
public class Instructor extends User {
	private int salary;
	private String lecture;

	public Instructor(int id, String firstName, String lastName, String email, String password, int salary,
			String lecture) {
		super(id, firstName, lastName, email, password);
		this.salary = salary;
		this.lecture = lecture;
	}

	public Instructor() {

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

}
