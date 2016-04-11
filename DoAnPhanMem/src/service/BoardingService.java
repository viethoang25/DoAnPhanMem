package service;

import java.rmi.*;
import java.sql.Date;

import service.model.RoomDetail;

public interface BoardingService extends Remote {

	public void addBoarding(String id, String name, String major, String roomName, Date startDate)
			throws RemoteException;

	public void deleteBoarding(String id) throws RemoteException;

	public void updateBoarding(String id, String name, String major, String roomName, Date startDate)
			throws RemoteException;

	public RoomDetail getByMajor(String major) throws RemoteException;

	public RoomDetail getByRoomName(String roomName) throws RemoteException;

	public RoomDetail getByDate(Date startDate) throws RemoteException;

	public RoomDetail getByPatientName(String name) throws RemoteException;
}
