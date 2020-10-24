
public class Wheelclass {
	private int sectionID;
	private int sectionValue;
	private int sectionColour;
	private String sectionType;
	
	public Wheelclass()
	{
		sectionID=0;
		sectionValue=0;
		sectionColour=0;
		sectionType="";
	}

	public Wheelclass(int sectionID, int sectionValue, int sectionColour, String sectionType) {
		this.sectionID = sectionID;
		this.sectionValue = sectionValue;
		this.sectionColour = sectionColour;
		this.sectionType = sectionType;
	}

	public Wheelclass(Wheelclass obj) {
		this.sectionID = obj.sectionID;
		this.sectionValue = obj.sectionValue;
		this.sectionColour = obj.sectionColour;
		this.sectionType = obj.sectionType;
	}

	public int getSectionID() {
		return sectionID;
	}

	public void setSectionID(int sectionID) {
		this.sectionID = sectionID;
	}

	public int getSectionValue() {
		return sectionValue;
	}

	public void setSectionValue(int sectionValue) {
		this.sectionValue = sectionValue;
	}

	public int getSectionColour() {
		return sectionColour;
	}

	public void setSectionColour(int sectionColour) {
		this.sectionColour = sectionColour;
	}

	public String getSectionType() {
		return sectionType;
	}

	public void setSectionType(String sectionType) {
		this.sectionType = sectionType;
	}
	public void Displaywheel()
	{
		System.out.println("The Section ID is: " +getSectionID());
		System.out.println("The Section Value is: " +getSectionValue());
		System.out.println("The Section Type is: " +getSectionType());
	}

}
