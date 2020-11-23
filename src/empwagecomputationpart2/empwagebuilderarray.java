package empwagecomputationpart2;

public class empwagebuilderarray {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	private int numofcompany=0;
	private companyempwage[] companyempwagearray;
	
	public empwagebuilderarray() {
		companyempwagearray = new companyempwage[5];
	}
	
	private void addcompanyempwage(String company,int emprateperhour,int noofworkingdays,int maxhrspermonth) {
		companyempwagearray[numofcompany]=new companyempwage(company,emprateperhour,noofworkingdays,maxhrspermonth);
		numofcompany++;
	}
	
	private void computeempwage() {
		for(int i=0;i<numofcompany;i++) {
			companyempwagearray[i].setTotalEmpWage(this.computeempwage(companyempwagearray[i]));
			System.out.println(companyempwagearray[i]);
		}
	}
	
	private int computeempwage(companyempwage obj) {
		int emphrs=0, totalemphrs=0, totalworkingdays=0;
		while(totalemphrs<=companyempwage.maxhrspermonth && totalworkingdays<companyempwage.noofworkingdays) {
			totalworkingdays++;
			int empcheck=(int)Math.floor(Math.random()*10)%3;
			switch(empcheck) {
			case IS_PART_TIME:
				emphrs=4;
				break;
			case IS_FULL_TIME:
				emphrs=8;
				break;
			default:
				emphrs=0;
			}
			totalemphrs+=emphrs;
			System.out.println("Day: "+totalworkingdays+" emphr:"+ emphrs);
		
		}
		return totalemphrs*companyempwage.emprateperhour;
	}
	public static void main(String[] args) {
		empwagebuilderarray obj=new empwagebuilderarray();
		obj.addcompanyempwage("DMart",20,2,10);
		obj.addcompanyempwage("Reliance",20,2,10);
		obj.computeempwage();
		
	}

}
