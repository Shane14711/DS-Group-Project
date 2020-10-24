
public class WheelNode {
	
	private Wheelclass sectionData;
	private WheelNode nextNode;
	
	public WheelNode()
	{
		nextNode=null;
	}
	public WheelNode(Wheelclass sectionData)
	{
		this.sectionData=sectionData;
	}
	public WheelNode(Wheelclass sectionData, WheelNode nextNode)
	{
		this.sectionData=sectionData;
		this.nextNode=nextNode;
	}
	public Wheelclass getSectionData() {
		return sectionData;
	}
	public void setSectionData(Wheelclass sectionData) {
		this.sectionData = sectionData;
	}
	public WheelNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(WheelNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public void Display()
	{
		getSectionData().Displaywheel();
	}
}
