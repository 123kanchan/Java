package day2;

import java.time.LocalDate;

//for enum demonstration
public class loanapplication {
	private long id;
	private String applicantName;
	private LocalDate dateOfApplication;
	private Loantype loanType;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public LocalDate getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(LocalDate dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	public Loantype getLoanType() {
		return loanType;
	}
	public void setLoanType(Loantype loanType) {
		this.loanType = loanType;
	}
	public loanapplication(long id, String applicantName, LocalDate i, Loantype loanType) {
		super();
		this.id = id;
		this.applicantName = applicantName;
		this.dateOfApplication = i;
		this.loanType = loanType;
	}
	public loanapplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "loanapplication [id=" + id + ", applicantName=" + applicantName + ", dateOfApplication="
				+ dateOfApplication + ", loanType=" + loanType + "]";
	}
}
