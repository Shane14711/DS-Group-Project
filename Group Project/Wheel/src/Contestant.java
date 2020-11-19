
public class Contestant {
	private int player_Number ;
    private String name;
    private int grand_Total;
    private int round_Balance;
	public Contestant() {
		 player_Number =0;
		 name="";
		 grand_Total=0;
		 round_Balance=0;
	}

	public Contestant(int player_number, String name,int grand_total,int round_Balance) {
		this.player_Number= player_number;
	    this.name = name;
	    this.grand_Total = grand_total;
	    this.round_Balance=round_Balance;
	}

	public Contestant(Contestant contestant) {
		player_Number = contestant.player_Number;
	    this.name = contestant.name;
		this.grand_Total = contestant.grand_Total;
		this.round_Balance= contestant.grand_Total;
	}

	public int getPlayer_Number(){
	return player_Number;
	}

    public String GetName(){
	return name;
	}
	
	public int getGrand_Total(){
	return grand_Total;
	}
	

	public void setPlayer_number(int player_number){
		this.player_Number= player_number;
	}

    public void setName(String name ){
		this.name = name;
	}

    public void setGrand_Total(int grand_total){
	    this.grand_Total = grand_total;
	}
	
	public int getRound_Balance() {
		return round_Balance;
	}

	public void setRound_Balance(int round_Balance) {
		this.round_Balance = round_Balance;
	}

	public void Display(){
        System.out.println("Player Number is"+player_Number);
        System.out.println("Player Name is"+name);
        System.out.println("Your current Grand Total is"+grand_Total);
        System.out.println("Your round balance is "+round_Balance);
    }

	
}
