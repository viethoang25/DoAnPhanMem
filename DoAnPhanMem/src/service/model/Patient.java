package service.model;

import java.io.Serializable;
import java.sql.Date;

public class Patient implements Serializable {
	String id;
	String name;
	Date birthday;
	String sex;
	String phoneNumber;
	String address;
	String insuranceCode;
	String insuranceType;
	public Patient(String id, String name, Date birthday, int sex, String phoneNumber, String address, String insuranceCode, String insuranceType){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.insuranceCode = insuranceCode;
		this.insuranceType = insuranceType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInsuranceCode() {
		return insuranceCode;
	}
	public void setInsuranceCode(String insuranceCode) {
		this.insuranceCode = insuranceCode;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
}
