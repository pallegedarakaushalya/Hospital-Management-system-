import java.rmi.Naming;
//import java.util.Scanner;
import java.util.*;
import java.util.Arrays;


public class HMSClient{
	public static void main(String[] args) {
		try{
			HMSInterface ob2=(HMSInterface) Naming.lookup("HMS");
			//System.out.print(ob2.display());
			String[] s=ob2.display();
			String[] s1=ob2.docter();
			String[] s2=ob2.Ghanendra();
			String[] s3=ob2.Vikram();
			String[] s4=ob2.Rekha();
			String[] s5=ob2.Yadav();
			String[] s6=ob2.Pramod();

			//LAB
			String[] l1=ob2.lab();
			String[] l2=ob2.pharmacy();
			String[] l3=ob2.medicines();
			String[] l4=ob2.laboratory();
			String[] l5=ob2.lab_info();

			//Facilities
			String[] f1=ob2.fac();
			String[] f2=ob2.bank();
			String[] f3=ob2.room();
			String[] f4=ob2.cafe();

			//Contact Us
			String[] c1=ob2.contact();
			String[] c2=ob2.con_info();
			

			while(true){
				for (int i=0;i<5 ;i++ ) {
					System.out.println((i+1)+"."+s[i]);
				}
				Scanner sc=new Scanner(System.in);
				System.out.println("\nEnter the Choice");
				int a=sc.nextInt();
				System.out.print("\n");
				if (a==1) {	
					while (true) {
						for (int i=0;i<6 ;i++ ) {
							System.out.println((i+1)+"."+s1[i]);

						}
						System.out.println("\nEnter the Choice");
						int a1=sc.nextInt();
						System.out.print("\n");

						if(a1==1){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(s2[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
									continue;
							}
							if (b1==2) {
								System.exit(0);
							}

							
						}
						else if(a1==2){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(s3[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
									continue;
							}
							if (b1==2) {
								System.exit(0);
							}

							
						}
						else if(a1==3){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(s4[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
									continue;
							}
							if (b1==2) {
								System.exit(0);
							}

							
						}
						else if(a1==4){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(s5[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
									continue;
							}
							if (b1==2) {
								System.exit(0);
							}

							
						}
						else if(a1==5){
							for (int i=0;i<6 ;i++ ) {
								System.out.println(s6[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
									continue;
							}
							if (b1==2) {
								System.exit(0);
							}

							
						}
						else if (a1==6) {
							break;
						}
						
					}
				//LAB
				}else if (a==2) {
					while (true) {
						for (int i=0;i<3 ;i++ ) {
							System.out.println((i+1)+"."+l1[i]);

						}
						System.out.println("\nEnter the Choice");
						int a1=sc.nextInt();
						System.out.print("\n");
						if(a1==1){
							for (int i=0;i<2 ;i++ ) {
								System.out.println(l2[i]);
							}
							
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
								for (int i=0;i<4 ;i++ ) {
								System.out.println(l3[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b2=sc.nextInt();
							if (b2==1) {
									continue;
							}
							if (b2==2) {
								System.exit(0);
							}
							}

						}else if(a1==2){
							for (int i=0;i<2 ;i++ ) {
								System.out.println(l4[i]);
							}
							
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
								for (int i=0;i<4 ;i++ ) {
								System.out.println(l5[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b2=sc.nextInt();
							if (b2==1) {
									continue;
							}
							if (b2==2) {
								System.exit(0);
							}
							}
							
						}else if (a1==3) {
							break;
						}
					}
					
				//LAB#		
				
				//facilities
				
				}else if (a==3) {	
					while (true) {
						for (int i=0;i<4 ;i++ ) {
							System.out.println((i+1)+"."+f1[i]);
							}	//

						System.out.println("\nEnter the Choice");
						int a1=sc.nextInt();
						System.out.print("\n");

						if(a1==1){
							for (int i=0;i<1 ;i++ ) {
								System.out.println(f2[i]);
							}	//
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
									continue;
							}	//
							if (b1==2) {
								System.exit(0);
							}	//

							
						}	//

						else if(a1==2){
							for (int i=0;i<1 ;i++ ) {
								System.out.println(f3[i]);
							}	//
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
									continue;
							}	//
							if (b1==2) {
								System.exit(0);
							}		//
						}	//

						else if(a1==3){
							for (int i=0;i<1;i++ ) {
								System.out.println(f4[i]);
							}	//
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
									continue;
							}	//
							if (b1==2) {
								System.exit(0);
							}	//
						}	//


						else if (a1==4) {
							break;
						}	//
						
					}	//
					
				}	//
				//Facilities#

				//Contact Us
				else if (a==4) {	
					while (true) {
						for (int i=0;i<2 ;i++ ) {
							System.out.println((i+1)+"."+c1[i]);
							}

						System.out.println("\nEnter the Choice");
						int a1=sc.nextInt();
						System.out.print("\n");

						if(a1==1){
							for (int i=0;i<1 ;i++ ) {
								System.out.println(c2[i]);
							}
							System.out.println("\n1.back");
							System.out.println("2.Exit\n");
							System.out.print("Enter the choice:");
							int b1=sc.nextInt();
							if (b1==1) {
									continue;
							}
							if (b1==2) {
								System.exit(0);
							}
						}
						else if (a1==4) {
							break;
						}
						
					}
					
				}
				//Contact US#

				else if(a==5){
					System.exit(0);
					
				}	
				
			}
			
		}


		
		catch(Exception e){
			System.out.print("error"+e);
		}
	}

}