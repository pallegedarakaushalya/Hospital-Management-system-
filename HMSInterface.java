import java.rmi.*;

public interface HMSInterface extends Remote{
	public String[] display() throws RemoteException;
	public String[] docter() throws RemoteException;
	public String[] Ghanendra() throws RemoteException;
	public String[] Vikram() throws RemoteException;
	public String[] Rekha() throws RemoteException;
	public String[] Yadav() throws RemoteException;
	public String[] Pramod() throws RemoteException;

	//LAB
	public String[] lab() throws RemoteException;
	public String[] pharmacy() throws RemoteException;
	public String[] medicines() throws RemoteException;
	public String[] laboratory() throws RemoteException;
	public String[] lab_info() throws RemoteException;

	//Facilities
	public String[] fac() throws RemoteException;
	public String[] bank() throws RemoteException;
	public String[] room() throws RemoteException;
	public String[] cafe() throws RemoteException;

	//Contact Us
	public String[] contact() throws RemoteException;
	public String[] con_info() throws RemoteException;
	

}