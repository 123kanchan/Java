package lab8;

import java.io.Serializable;

public class Employee implements Serializable {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	private int Empno;
	private String empNm;
	private	 int empSal;
		
	public Employee(int empno, String empNm, int empSal) {
			super();
			Empno = empno;
			this.empNm = empNm;
			this.empSal = empSal;
		}

	@Override
		public String toString() {
			return "Employee [Empno=" + Empno + ", empNm=" + empNm + ", empSal=" + empSal + "]";
		}

	public int getEmpno() {
			return Empno;
		}

		public void setEmpno(int empno) {
			Empno = empno;
		}

		public String getEmpNm() {
			return empNm;
		}

		public void setEmpNm(String empNm) {
			this.empNm = empNm;
		}

		public int getEmpSal() {
			return empSal;
		}

		public void setEmpSal(int empSal) {
			this.empSal = empSal;
		}

	public static void main(String[] args) {
	
	}

}
