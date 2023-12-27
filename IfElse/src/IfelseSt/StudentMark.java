package IfelseSt;
import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sAvg,sTotal;
		System.out.println("Enter the name of the Student");
		String sName = s.nextLine();
		System.out.print("Enter the mark of sub1 out of 100 --> ");
		int s1 = s.nextInt();
		System.out.print("Enter the mark of sub2 out of 100 --> ");
		int s2 = s.nextInt();
		System.out.print("Enter the mark of sub3 out of 100 --> ");
		int s3 = s.nextInt();
		System.out.print("Enter the mark of sub4 out of 100 --> ");
		int s4 = s.nextInt();
		System.out.print("Enter the mark of sub5 out of 100 --> ");
		int s5 = s.nextInt();
		sTotal = s1+s2+s3+s4+s5;
		
		sAvg = sTotal/5;
		
		int sPer = (sTotal*100)/500;
		
		
		if(s1<35||s2<35||s3<35||s4<35||s5<35) {
			System.out.println("You have less than 35 in one subject\n you are fail. Better-luck next-time");
		}
		else {
			switch(sPer) {
				case 100:
				
				case 99:
				case 98:
				case 97:
				case 96:
				case 95:
				case 94:
				case 93:
				case 92:
				case 91:
				case 90:
					System.out.println(sName+" got A Grade "+sPer+"percentage with aggregate of"+sAvg+"marks");
					break;
				case 89:
				case 88:
				case 87:
				case 86:
				case 85:
				case 84:
				case 83:
				case 82:
				case 81:
				case 80:
					System.out.println(sName+" got B Grade "+sPer+"percentage with aggregate of"+sAvg+"marks");
					break;
				case 79:
				case 78:
				case 77:
				case 76:
				case 75:
				case 74:
				case 73:
				case 72:
				case 71:
				case 70:
					System.out.println(sName+" got C Grade "+sPer+"percentage with aggregate of"+sAvg+"marks");
					break;
				case 69:
				case 68:
				case 67:
				case 66:
				case 65:
				case 64:
				case 63:
				case 62:
				case 61:
				case 60:
					System.out.println(sName+" got D Grade "+sPer+"percentage with aggregate of"+sAvg+"marks");
					break;
				case 59:
				case 58:
				case 57:
				case 56:
				case 55:
				case 54:
				case 53:
				case 52:
				case 51:
				case 50:
					System.out.println(sName+" got E Grade "+sPer+"percentage with aggregate of"+sAvg+"marks");
					break;
				default:
					System.out.println(sName+" you have below 50% marks "+sPer+"percentage Sorry you are fail");


			}
		}
		
	}

}
