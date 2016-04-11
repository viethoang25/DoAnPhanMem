package service;

import java.rmi.*;

import service.model.Account;

public interface AccountService extends Remote {

	public boolean checkAccount(String username, String password) throws RemoteException;
	
	public void addAccount(String id, String staffId, String username, String password, int decentralization)
			throws RemoteException;
	
	public Account getById(String id) throws RemoteException;
	
	public Account getByUsername(String username) throws RemoteException;
}
