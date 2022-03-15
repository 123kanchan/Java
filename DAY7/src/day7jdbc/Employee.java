package day7jdbc;



	import java.io.Serializable;

	public class Employee implements Serializable {
		private int Empno;
		private String empNm;
		private	 double empSal;
			
		public Employee(int empno, String empNm, double empSal) {
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

			public double getEmpSal() {
				return empSal;
			}

			public void setEmpSal(double empSal) {
				this.empSal = empSal;
			}

		

	}



