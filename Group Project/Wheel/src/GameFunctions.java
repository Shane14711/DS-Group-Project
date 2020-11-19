import java.util.*;
public class GameFunctions {
	private Wheelclass wheel;
	private WheelLinkedlist link;
	
	Scanner input=new Scanner(System.in);
	
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
	public void playerBaseCreator()
	{
		int i=0;
		
		String player_Name="";
		for (i=1; i<3; i++)
		{
			System.out.println("Enter name player number "+i+ "name "+player_Name);
			player_Name=input.next();
			
			Contestant player=new Contestant();
			player.setName(player_Name);
			player.setGrand_Total(0);
			player.setPlayer_number(i);
			
			CLinkedList playerBase=new CLinkedList();
			playerBase.addAtBack(player);
			
		}
		System.out.println("Player was added");
		
	}
	public int playMenu()
	{
		int pOption=0, flag=0;
		while(flag!=1) {
			System.out.println("\n1. Spin The Wheel");
			System.out.println("2. Buy A vowel($150)");
			System.out.println("3. Guess the entire word");
			System.out.println("4. Guess another letter");
			pOption=input.nextInt();
			if (pOption == 1 || pOption == 2 || pOption == 3 || pOption == 4) {
	            flag = 1;
			}
		}
		return pOption;
	}
	
	public int continueGame() {
		int pOption=0,flag=0;
		while(flag !=1) {
		System.out.println("Would you like to play again");
		System.out.println("1. Yes");
		System.out.println("2. No");
		pOption=input.nextInt();
		
		if (pOption == 1 || pOption == 2) {
            flag = 1;
		}
	}
		return pOption;
	}
}
