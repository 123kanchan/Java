package javacodestopractice;

public class StudentNitIIt {

	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	public StudentNitIIt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentNitIIt(int studentId, String studentName, String studentAddress, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	
	public StudentNitIIt(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}
	@Override
	public String toString() {
		return "StudentNitIIt [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + ", collegeName=" + collegeName + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


}
