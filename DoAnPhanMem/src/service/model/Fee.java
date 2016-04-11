package service.model;

import java.io.Serializable;

public class Fee implements Serializable {
	String id;
	String patientId;
	String examinationFee;
	String drugFee;
	String roomFee;
	String bloodFee;
	public Fee(String id, String patientId, String examinationFee, String drugFee, String roomFee, String bloodFee){
		this.id = id;
		this.patientId = patientId;
		this.examinationFee = examinationFee;
		this.drugFee = drugFee;
		this.roomFee = roomFee;
		this.bloodFee = bloodFee;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getExaminationFee() {
		return examinationFee;
	}
	public void setExaminationFee(String examinationFee) {
		this.examinationFee = examinationFee;
	}
	public String getDrugFee() {
		return drugFee;
	}
	public void setDrugFee(String drugFee) {
		this.drugFee = drugFee;
	}
	public String getRoomFee() {
		return roomFee;
	}
	public void setRoomFee(String roomFee) {
		this.roomFee = roomFee;
	}
	public String getBloodFee() {
		return bloodFee;
	}
	public void setBloodFee(String bloodFee) {
		this.bloodFee = bloodFee;
	}
	
}
