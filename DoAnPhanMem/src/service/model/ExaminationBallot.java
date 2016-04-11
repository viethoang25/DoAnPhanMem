package service.model;

import java.io.Serializable;

public class ExaminationBallot implements Serializable {
	String id; 
	String patientId; 
	String staffId; 
	String diagnoses;
	String result;
	String prescription;
	public ExaminationBallot(String id, String patientId, String staffId, String diagnoses, String result, String prescription){
		this.id = id;
		this.patientId = patientId;
		this.staffId = staffId;
		this.diagnoses = diagnoses;
		this.result = result;
		this.prescription = prescription;
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
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getDiagnoses() {
		return diagnoses;
	}
	public void setDiagnoses(String diagnoses) {
		this.diagnoses = diagnoses;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
}
