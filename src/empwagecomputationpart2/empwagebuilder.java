package empwagecomputationpart2;
import java.util.*;

public class empwagebuilder {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<companyempwage> companies=new ArrayList<>();
		int select=1;
		while(select==1) {
			System.out.println("1.Add 2.Exit");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Name of company");
				String name=sc.next();
				System.out.println("Enter working days");
				int workingdays=sc.nextInt();
				System.out.println("Enter wage per hour");
				int wageperhour=sc.nextInt();
				System.out.println("Working hours in a day");
				int workinghrsinday=sc.nextInt();
				companyempwage c=new companyempwage(name,workingdays,wageperhour,workinghrsinday);
				double monthlywage=c.calculateempwage();
				System.out.println(name+" monthly wage"+monthlywage);
				companies.add(c);
				select=1;
				break;
			case 2:
				System.out.println("Thankyou");
				select=0;
				break;
			}
		}
		if(companies.size()!=0) {
			System.out.println("which company you wanna see?");
			String name=sc.next();
			for(int i=0;i<companies.size();i++) {
				if(companies.get(i).nameofcompany.equals(name)) {
					System.out.println("total wage is"+companies.get(i).totalmonthlywage);
				}
			}
		}
	}
}	
