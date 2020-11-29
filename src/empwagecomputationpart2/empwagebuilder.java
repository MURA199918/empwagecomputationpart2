package empwagecomputationpart2;
import java.util.*;

public class empwagebuilder {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number of companies");
		int noofcompany=sc.nextInt();
		companyempwage[] companies=new companyempwage[noofcompany];
		for(int i=0;i<companies.length;i++) {
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
			companies[i]=c;
		}
    }
	
}

