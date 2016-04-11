package service;

import java.rmi.*;
import java.util.ArrayList;

import service.model.Staff;

public interface StaffService extends Remote{

	public ArrayList<Staff> getAllStaff() throws RemoteException;
	
	public ArrayList<Staff> getAllByName(String name) throws RemoteException;
	
	public Staff getById(String id) throws RemoteException;
	
	public Staff getByName(String name) throws RemoteException;
}
