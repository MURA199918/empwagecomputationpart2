package empwagecomputationpart2;

public class companyempwage {
	public final String company;
	public static int emprateperhour = 0;
	public static int noofworkingdays = 0;
	public static int maxhrspermonth = 0;
	private int totalempwage;
	
	public companyempwage(String company,int emprateperhour,int noofworkingdays,int maxhrspermonth) {
		this.company=company;
		this.emprateperhour=emprateperhour;
		this.noofworkingdays=noofworkingdays;
		this.maxhrspermonth=maxhrspermonth;
	}
	public void companyempwage(String company2, int emprateperhour2, int noofworkingdays2, int maxhrspermonth2) {
		// TODO Auto-generated constructor stub
	}
	public void companyempwage1(String company2, int emprateperhour2, int noofworkingdays2, int maxhrspermonth2) {
		// TODO Auto-generated constructor stub
	}
	public void setTotalEmpWage(int totalempwage) {
		this.totalempwage=totalempwage;
	}
	public String toString() {
		return "Total emp wage for company:" +company+" is: "+totalempwage;
	}
	

}
