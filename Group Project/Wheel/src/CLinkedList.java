
public class CLinkedList {
	private Contestant_Node head;
	private Contestant_Node tail;
	
	public CLinkedList()
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
	
	public void addAtBack(Contestant data)
	{
		if(isFull()) {
			System.out.println("The maximum amount of contestants are in the list");
		}else {
			Contestant_Node newNode= new Contestant_Node(data);
			if(isEmpty()) {
				head=newNode;
				tail=newNode;
				tail.setNextNode(head);
			}else {
				newNode.setNextNode(head);
				tail.setNextNode(newNode);
				tail=newNode;
			}
		}
	}
	
	public Contestant_Node search(int playerNumber)
	{
		Contestant_Node newNode=head;
		if(!isEmpty()) {
			while(newNode!=null) {
				if(newNode.getData().getPlayer_Number()==playerNumber)
				{
					return newNode;
				}else {
					newNode=newNode.getNextNode();
				}
			}
		}else {
			System.out.println("Player number was not found");
		}
		return null;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("No Contestest is in the list");
		}
		else
		{
			head.Display();
			Contestant_Node newNode=head.getNextNode();
			while(newNode.getNextNode()!=head)
			{
				newNode.Display();
				newNode=newNode.getNextNode();
			}
		}
	}
	
	public void deleteList()
	{
		if(!isEmpty())
		{
			Contestant_Node newNode=head;
			while(newNode.getNextNode()!=null)
			{
				head=newNode.getNextNode();
				newNode=null;
				newNode=head;
			}
		}
		head=null;
	}
}

