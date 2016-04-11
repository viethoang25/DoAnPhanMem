package service.model;

import java.io.Serializable;
import java.sql.Date;

public class Staff implements Serializable {
	String id;
	String majorId;
	String name;
	int sex;
	Date birthday;
	String address;
	String phoneNumber;
	String hometown;
	String competence;
	String status;
	String salary;
	String salaryCoefficient;
	public Staff(String id, String majorId, String name, int sex, Date birthday, String address, String phoneNumber, String hometown, String competence, String status, String salary, String salaryCoefficient){
		this.id = id;
		this.majorId = majorId;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.hometown = hometown;
		this.competence = competence;
		this.status = status;
		this.salary = salary;
		this.salaryCoefficient = salaryCoefficient;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getCompetence() {
		return competence;
	}
	public void setCompetence(String competence) {
		this.competence = competence;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getSalaryCoefficient() {
		return salaryCoefficient;
	}
	public void setSalaryCoefficient(String salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	
}
