package service;

import java.rmi.*;
import java.sql.Date;

public interface ExaminationService extends Remote {

	public void addExaminationBallot(String id, String patientId, String staffId) throws RemoteException;

	public void updateExaminationBallot(String diagnoses, String result, String prescription, Date date)
			throws RemoteException;

}
