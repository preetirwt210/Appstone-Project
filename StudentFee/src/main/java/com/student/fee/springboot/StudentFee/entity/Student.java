package com.student.fee.springboot.StudentFee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="Fee_Name")
	private String feeName;
	
	@Column(name="Periodicity")
	private String periodicity;
	
	@Column(name="Fine_Applicable")
	private String fineApplicable;
	
	@Column(name="Consession_Applicable")
	private String concessionApplicable;
	

	@Column(name="Payment_priority")
	private String payementPrior;
	
	@Column(name="Account_Heads")
	private String accountHeads;
	public Student() {
		
	}


	public Student(int id, String feeName, String periodicity, String fineApplicable, String concessionApplicable,
			String payementPrior, String accountHeads) {
		super();
		this.id = id;
		this.feeName = feeName;
		this.periodicity = periodicity;
		this.fineApplicable = fineApplicable;
		this.concessionApplicable = concessionApplicable;
		this.payementPrior = payementPrior;
		this.accountHeads = accountHeads;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFeeName() {
		return feeName;
	}


	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}


	public String getPeriodicity() {
		return periodicity;
	}


	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}


	public String getFineApplicable() {
		return fineApplicable;
	}


	public void setFineApplicable(String fineApplicable) {
		this.fineApplicable = fineApplicable;
	}


	public String getConcessionApplicable() {
		return concessionApplicable;
	}


	public void setConcessionApplicable(String concessionApplicable) {
		this.concessionApplicable = concessionApplicable;
	}


	public String getPayementPrior() {
		return payementPrior;
	}


	public void setPayementPrior(String payementPrior) {
		this.payementPrior = payementPrior;
	}


	public String getAccountHeads() {
		return accountHeads;
	}


	public void setAccountHeads(String accountHeads) {
		this.accountHeads = accountHeads;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", feeName=" + feeName + ", periodicity=" + periodicity + ", fineApplicable="
				+ fineApplicable + ", concessionApplicable=" + concessionApplicable + ", payementPrior=" + payementPrior
				+ ", accountHeads=" + accountHeads + "]";
	}

	
	
}
