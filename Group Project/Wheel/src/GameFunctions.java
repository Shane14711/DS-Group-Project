import java.util.Random;
public class GameFunctions {
	private Wheelclass wheel;
	private WheelLinkedlist link;

	
	public int sectionIdentifier(int x, int y)
	{
		Random rand=null;
		
		return x+rand.nextInt()%y;
	}
	
	public int spinTheWheel()
	{
		
		int i=0, sectionID=1;
		for(i=0; i<=sectionIdentifier(10,20); i++)
		{
			sectionID=sectionIdentifier(1,12);
			wheel.getSectionColour();
			System.out.println(link.search(sectionID).getSectionData().getSectionType());
			
		}
		return sectionID;
	}
	public void theWheelCreator()
	{
		int bankrupt=3,lostATurn=2,fiveHundred=4,fiveFifty=1,sixHundred=4,
				sixFifty=3,sevenHundred=3,eightHundred=1, eightFifty=1, twoThousandFiveHundred=1;
		
		for(int n =1; n<=23; n++)
		{
			if(bankrupt!=0)
			{
			Wheelclass wheel=new Wheelclass (n,0,n,"Bankrupt");
			link.insertIntoWheel(wheel);
			bankrupt--;
			}else if(lostATurn!=0) {
				Wheelclass wheel= new Wheelclass(n,0,n,"Lost a turn");
				link.insertIntoWheel(wheel);
				lostATurn--;		
			}else if (fiveHundred!=0) {
				Wheelclass wheel=new Wheelclass(n,500,n,"$500");
				link.insertIntoWheel(wheel);
				fiveHundred--; 
			}else if (fiveFifty!=0) {
				Wheelclass wheel=new Wheelclass(n,550,n,"$550");
				link.insertIntoWheel(wheel);
				fiveFifty--; 
			}else if (sixHundred!=0) {
				Wheelclass wheel=new Wheelclass(n,600,n,"$600");
				link.insertIntoWheel(wheel);
				sixHundred--; 
			}else if (sixFifty!=0) {
				Wheelclass wheel=new Wheelclass(n,650,n,"$650");
				link.insertIntoWheel(wheel);
				sixFifty--; 
			}else if (sevenHundred!=0) {
				Wheelclass wheel=new Wheelclass(n,700,n,"$700");
				link.insertIntoWheel(wheel);
				sevenHundred--; 
			}else if (eightHundred!=0) {
				Wheelclass wheel=new Wheelclass(n,800,n,"$800");
				link.insertIntoWheel(wheel);
				eightHundred--; 
			}else if (eightFifty!=0) {
				Wheelclass wheel=new Wheelclass(n,850,n,"$850");
				link.insertIntoWheel(wheel);
				eightFifty--; 
			}else if (twoThousandFiveHundred!=0) {
				Wheelclass wheel=new Wheelclass(n,2500,n,"$2500");
				link.insertIntoWheel(wheel);
				twoThousandFiveHundred--; 
			}
			
		}
	}
}
