import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;

public class HMS extends UnicastRemoteObject implements HMSInterface {
	public HMS() throws RemoteException {
	}

	public String[] display() {
		String[] a = { "Docter", "Laboratories", "Facilities", "Contact Us", "Exit" };
		return a;
	}

	public String[] docter() {
		String[] b = { "Dr Ghanendra", "Dr Vikram", "Dr Rekha", "Dr Pramod", "Dr Yadav", "Back" };
		return b;
	}

	public String[] Ghanendra() {
		String[] b = { "ID number:21", "Name:Dr Ghanendra", "Specialist:ENT", "Timing:10.00am-04.00pm",
				"Qualification:MBBS, MD", "Room No.17" };
		return b;
	}

	public String[] Vikram() {
		String[] b = { "ID number:32", "Name:Dr Vikram", "Specialist:Physician", "Timing:10.00am-04.00pm",
				"Qualification:MBBS, MD", "Room No.17" };
		return b;
	}

	public String[] Rekha() {
		String[] b = { "ID number:17", "Name:Dr Rekha", "Specialist:Child", "Timing:10.00am-04.00pm",
				"Qualification:BDM", "Room No.8" };
		return b;

	}

	public String[] Pramod() {
		String[] b = { "ID number:33", "Name:Dr Pramod", "Specialist:Artho", "Timing:10.00am-04.00pm",
				"Qualification:MBBS, MS", "Room No.40" };
		return b;
	}

	public String[] Yadav() {
		String[] b = { "ID number:33", "Name:Dr Yadav", "Specialist:Artho", "Timing:08.00am-12.00pm",
				"Qualification:MBBS", "Room No.12" };
		return b;

	}

	// LAB
	public String[] lab() {
		String[] x = { "PHARMACY", "LABORATORIES", "BACK" };
		return x;
	}

	public String[] pharmacy() {
		String[] y = { "1.MEDICINES", "2.BACK" };
		return y;
	}

	public String[] laboratory() {
		String[] z = { "1.LAB INFO", "2.BACK" };
		return z;
	}

	public String[] medicines() {
		String[] q = { "NAME: Corex  COST: 200",
				"NAME: Nytra  COST: 500",
				"NAME: Brufa  COST: 100",
				"NAME: Pride  COST: 1200" };
		return q;
	}

	public String[] lab_info() {
		String[] t = { "LABORATORY: X-RAY LAB COST: 1200",
				"LABORATORY: CT SCAN LAB COST: 1500",
				"LABORATORY: OR SCAN LAB COST: 1000",
				"LABORATORY: BLOOD BANK LAB COST: 200" };
		return t;

	}

	// Facilities
	public String[] fac() {
		String[] f = { "Bank and ATM Facilities", "Room Facilities", "Cafe", "Back" };
		return f;
	}

	public String[] bank() {
		String[] g = { "----Bank & ATM Facilities---- \n\nEasy access to money is guranteed thanks to branch of the BOC with an ATM that is located within the hospital premises.\n" };
		return g;
	}

	public String[] room() {
		String[] h = { "----Room Facilities--- \n\nTo make a hospital stay more comfortable we arrange extras and cater to any special dietry requiments, so that you and your visitors feel at home.\n" };
		return h;
	}

	public String[] cafe() {
		String[] i = { "----Cafe---- \n\nThe touching taste cafe has open air seating and serves a variety of meals from 7am to 10pm for the convienience of visitors to our hospital.\n" };
		return i;
	}

	// Contact Us
	public String[] contact() {
		String[] j = {"INFORMATION", "BACK"};
		return j;
	}

	public String[] con_info() {
		String[] k = {"----- CONTACT US ----- \n\n Telephone Number : 011 2 700 700 \n Email Address : hospital@gmail.com \n Address : No.310, TB Jaya Mawatha, Colombo 10"};
		return k;
	}

}