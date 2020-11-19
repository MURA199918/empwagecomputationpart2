package empwagecomputationpart2;

public class empwagebuilder {
	 public static final int IS_PART_TIME = 1;
	    public static final int IS_FULL_TIME = 2;
	   
	    public static int computeempwage(String company, int emprateperhour,int numofworkingdays,int maxhourspermonth){
	    	 int emphrs = 0;
		        int totalemphrs = 0;
		        int totalworkingdays = 0;
		        while(totalemphrs<=maxhourspermonth && totalworkingdays<numofworkingdays) {
		            totalworkingdays++;
		            int empcheck = (int) Math.floor(Math.random()*10)%3;
		            switch(empcheck) {
		                case IS_PART_TIME:
		                    emphrs = 4;
		                    break;
		                case IS_FULL_TIME:
		                    emphrs = 8;
		                    break;
		                default:
		                    emphrs = 0;
		            }
		            totalemphrs+=emphrs;
		            System.out.println("Day:"+totalworkingdays+"emp hr:"+emphrs);
	    }
		        int totalempwage = totalemphrs * emprateperhour;
		        System.out.println("Total emp wage:" + totalempwage);
		        return totalempwage;   
	       
	        }
	        
	    public static void main(String[] args) {
	        computeempwage("dmart",20,2,10);
	        computeempwage("reliance",10,4,20);
	    }

}
