package com.cg.jpaastart.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="emp_store")

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)       //This annotation must be written only on parent class

@DiscriminatorColumn(name="emo_type",discriminatorType=DiscriminatorType.STRING)	//additional column to differ parent
@DiscriminatorValue("EMP")		//parent rows will have this value in Discriminator column


public class Employee implements Serializable {
	
	/**
	 * 
	 */
	
	public static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int employeeID;
	private String name;
	private double salary;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}