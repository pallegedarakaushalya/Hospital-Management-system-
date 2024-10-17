import java.rmi.Naming;

public class HMSServer{
	public static void main(String[] args) {
			try{
				HMSInterface ob=new HMS();
				Naming.rebind("HMS",ob);

		}
		catch(Exception e){
			System.out.print("Error"+e);
		}
	}
}