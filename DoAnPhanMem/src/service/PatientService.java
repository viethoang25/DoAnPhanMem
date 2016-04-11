package service;

import java.rmi.*;
import java.util.ArrayList;

import service.model.Patient;

public interface PatientService extends Remote {

	public ArrayList<Patient> getAllPatient() throws RemoteException;

	public ArrayList<Patient> getAllByName(String name) throws RemoteException;
	
	public Patient getById(String id) throws RemoteException;

	public Patient getByName(String name) throws RemoteException;
	
	
}
