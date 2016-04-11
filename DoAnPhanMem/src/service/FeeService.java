package service;

import java.rmi.*;

public interface FeeService extends Remote {

	public void addFee(String id, String patientId) throws RemoteException;
}
