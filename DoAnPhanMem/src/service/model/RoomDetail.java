package service.model;

import java.io.Serializable;
import java.sql.Date;

public class RoomDetail implements Serializable {
	String id;
	String roomId;
	String patientId;
	String bedId;
	Date startDay;
	public RoomDetail(String id, String roomId, String patientId, String bedId, Date startDay){
		this.id = id;
		this.roomId = roomId;
		this.patientId = patientId;
		this.bedId = bedId;
		this.startDay = startDay;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getBedId() {
		return bedId;
	}
	public void setBedId(String bedId) {
		this.bedId = bedId;
	}
	public Date getStartDay() {
		return startDay;
	}
	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}
	
}
