
public class Contestant {
	private int Player_Number ;
    private String Name;
    private int Grand_Total;

	public Contestant() {
		 Player_Number =0;
		 Name="";
		 Grand_Total=0;
	}

	public Contestant(int player_number, String name,int grand_total) {
		Player_Number= player_number;
	    Name = name;
	    Grand_Total = grand_total;
	}

	public Contestant(Contestant contestant) {
		Player_Number = contestant.Player_Number;
	    Name = contestant.Name;
		Grand_Total = contestant.Grand_Total;
	}

	public int GetPlayer_Number(){
	return Player_Number;
	}

    public String GetName(){
	return Name;
	}
	
	public int GetGrand_Total(){
	return Grand_Total;
	}
	

	public void SetPlayer_number(int player_number){
		Player_Number= player_number;
	}

    public void SetName(String name ){
		Name = name;
	}

    public void SetGrand_Total(int grand_total){
	    Grand_Total = grand_total;
	}
	
	public void Display(){
        System.out.println("Player Number is"+Player_Number);
        System.out.println("Player Name is"+Name);
        System.out.println("Your current Grand Total is"+Grand_Total);
    }
}
