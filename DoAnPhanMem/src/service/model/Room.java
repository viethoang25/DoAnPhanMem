package service.model;

import java.io.Serializable;

public class Room implements Serializable {
	String id;
	String majorId;
	String roomName;
	public Room(String id, String majorId, String roomName){
		this.id = id;
		this.majorId = majorId;
		this.roomName = roomName;
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
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
}
