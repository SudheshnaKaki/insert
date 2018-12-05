package com.cg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "anu")
public class Employee {

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empDesignation=" + empDesignation + ", empSalary="
				+ empSalary + ", empGender=" + empGender + ", date=" + date
				+ "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @SequenceGenerator(name="emo_seq",sequenceName="emp_seq_eid")
	@Column(name = "emp_id")
	private Integer empId;

	@Column(name = "emp_name")
	@NotEmpty(message = "Name should not be empty")
	private String empName;

	@Column(name = "emp_desig")
	private String empDesignation;

	@Column(name = "emp_sal")
	@NotNull(message = "salary should not be blank")
	private double empSalary;

	@Column(name = "emp_gen")
	private String empGender;
	@Column(name = "date")
	private Date date;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

}
