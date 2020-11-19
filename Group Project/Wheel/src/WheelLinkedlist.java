import java.util.*;
public class WheelLinkedlist  {
	private WheelNode head;
	private WheelNode tail;
	
	public WheelLinkedlist()
	{
		head=null;
		tail=null;
	}
	public boolean isEmpty()
	{
		if (head==null)
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull()
	{
		WheelNode current= new WheelNode();
		if (current==null)
		{
			return true;
		}else {
			current=null;
			return false;
		}
	}
	
	public WheelNode search(int sectionID)
	{
		if (!isEmpty())
		{
			WheelNode current=head;
			while (current!=null)
			{
				if (current.getSectionData().getSectionID()==sectionID){
					return current;
				}else {
					current=current.getNextNode();
				}
				} 
					
				
			}
		else {
			System.out.println("Section ID is not found");
		}
		return null;
	}
	
	public void insertIntoWheel(Wheelclass New)
	{
		WheelNode current= new WheelNode(New);
		if(isEmpty()) {
			head=current;
			tail=current;
			tail.setNextNode(head);
		}else if (!isFull())
		{
			current.setNextNode(head);
			current.setNextNode(current);
			tail=current;
		}
	}
	
	public void destroyWheelclass()
	{
		if(!isEmpty())
		{
			WheelNode current=head;
			WheelNode prevNode=head;
			while(current!=null)
			{
				prevNode=current;
				current=current.getNextNode();
				prevNode=null;
			}
			head=null;
		}
		else
		{
			System.out.println("The list is empty");
		}
	}
	
	public void displayWheel()
	{
		if(!isEmpty())
		{
			WheelNode current=head;
			while(current!=tail)
			{
				current.getSectionData().Displaywheel();
				current=current.getNextNode();
			}
			current.getSectionData().Displaywheel();
		}else {
			System.out.println("The list has nothing to display");
		}
	}
	
}
