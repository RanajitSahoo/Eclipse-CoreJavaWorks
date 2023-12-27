package IfelseSt;
import java.util.Scanner;


public class ElecBill {

	public static void main(String[] args) {
		double total = 0,pBill=0;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the consumer name –--> ");
		String cName = s.nextLine();
		System.out.println("Enter the Consumer meter Number--->");
		String cMtrNum = s.nextLine();
		System.out.println("Enter the number of unit consume by Consumer --->");
		int cUnit = s.nextInt();
		int temp = cUnit;
		if(cUnit<=200) {
			total = total+cUnit*3;
		}else {
			if(cUnit>200) {
				
				cUnit = cUnit-100;
				 total = total+(100*3);
				 
				
			}
			if(cUnit>100) {
				
				cUnit=cUnit-50;
				total=total+(50*5);
				
				
			}
			if(cUnit>50) {
				
				cUnit=cUnit-50;
				total=total+(50*7);
				
			}
			if(cUnit>=1) {
				
				
				total=total+(cUnit*11);
				
				
			}
			
		}
		System.out.println("Have Consumer any pending bills in previous month? 0/1");
		System.out.println("press--> 1 for 'YES'");
		System.out.println("press--> 0 for 'NO'");
		int res = s.nextInt();
		if(res==1) {
			System.out.print("Enter how much money was pending in last month--> ");
			pBill= s.nextInt();
			total=total+(pBill+((pBill*10)/100));
			;
			
			
			System.out.println("");
			System.err.println("|----------------------------------------------|");
			System.out.println("|-----WELCOME TO JSPIDER ELECTRYCITY SYSTEM----|");
			System.err.println("|______________________________________________|");
			System.out.println("|                                              |");
			System.out.println("|Consumer Name:- "+cName);
			System.out.println("|Consummer Meter Number:-"+cMtrNum);
			System.out.println("|Billing System of Jspider-Elec-Sys");
			System.out.println("|Under 200 unit you've to pay only 3Rs/per unit|");
			System.out.println("|Above 200 unit you have to pay as follows");
			System.out.println("|for 1st 100 unit -- 100 X 3Rs /per unit");
			System.out.println("|for next 50 unit --  50 X 5Rs /per unit");
			System.out.println("|for next 50 unit --  50 X 7Rs /per unit");
			System.out.println("|for next  units  --     X 11Rs/per unit");
			System.out.println("|for any pending bill you've to 10% interest on \n pending bills.. ");
			System.out.println("|You have consumed Unit in this month "+temp+" Units");
			System.err.println("|----------------------------------------------|");
			System.out.println("|you have pending bill of           "+pBill+"/Rs|");
			System.err.println("|----------------------------------------------|");
			System.out.println("| 100 X 3                             300.00/Rs|");
			System.out.println("|  50 X 5                             250.00/Rs|");
			System.out.println("|  50 X 7                             350.00/Rs|");
			System.out.println("|  "+cUnit+" X 11                            "+(cUnit*11)+".00/Rs|");
			System.out.println("| pending bill                         "+(pBill+((pBill*10)/100))+"/Rs|");
			System.out.println("|                                              |");
			System.out.println("| Total Elec-Bill                    "+total+"0/Rs|");
			System.err.println("|----------------------------------------------|");
			System.out.println("|...            Thank you                   ...|");
			System.err.println("|______________________________________________|");
			
			
			
		}else if(res==0){
			System.out.println("");
			System.err.println("|----------------------------------------------|");
			System.out.println("|-----WELCOME TO JSPIDER ELECTRYCITY SYSTEM----|");
			System.err.println("|______________________________________________|");
			System.out.println("|                                              |");
			System.out.println("|Consumer Name:- "+cName);
			System.out.println("|Consummer Meter Number:-"+cMtrNum);
			System.out.println("|Billing System of Jspider-Elec-Sys");
			System.out.println("|Under 200 unit you've to pay only 3Rs/per unit|");
			System.out.println("|Above 200 unit you have to pay as follows");
			System.out.println("|for 1st 100 unit -- 100 X 3Rs /per unit");
			System.out.println("|for next 50 unit --  50 X 5Rs /per unit");
			System.out.println("|for next 50 unit --  50 X 7Rs /per unit");
			System.out.println("|for next  units  --     X 11Rs/per unit");
			System.out.println("|for any pending bill you've to 10% interest on \n pending bills.. ");
			System.out.println("|You have consumed Unit in this month "+temp+" Units");
			
			System.err.println("|----------------------------------------------|");
			System.out.println("|you have pending bill of           "+pBill+"/Rs|");
			System.err.println("|----------------------------------------------|");
			System.out.println("| 100 X 3                             300.00/Rs|");
			System.out.println("|  50 X 5                             250.00/Rs|");
			System.out.println("|  50 X 7                             350.00/Rs|");
			System.out.println("|     X 11                              0.00/Rs|");
			System.out.println("| you have consumed less than 200 units you've |");
			System.out.println("| just pay 3rs per units                       |");
			System.out.println("|                                              |");
			System.out.println("| Total Elec-Bill                    "+total+"0/Rs|");
			System.err.println("|----------------------------------------------|");
			System.out.println("|...            Thank you                   ...|");
			System.err.println("|______________________________________________|");
			;

		}else {
			System.out.println("give a valid choice");
			System.out.println("Network Error... ");
			System.out.println("Sorry do the process again");

		}
		
	}

}
	