
public class Contestant_Node {
	  private Contestant Data;
	  private Contestant_Node PrevNode;
	  private Contestant_Node NextNode;


	  public Contestant_Node ()
	  {
	    Data = new Contestant ();
	    PrevNode = null;
	    NextNode = null;
	  }


	  public Contestant_Node (Contestant contestant, Contestant_Node nextNode, Contestant_Node prevNode)
	  {
	    Data = new Contestant (contestant);
	    PrevNode = prevNode;
	    NextNode = nextNode;
	  }


	  public Contestant_Node (Contestant contestant)
	  {
	    Data = new Contestant (contestant);
	    PrevNode = null;
	    NextNode = null;
	  }


	  public Contestant_Node (int player_number, String name, int grand_total)
	  {
	    Data = new Contestant (player_number, name, grand_total);
	    PrevNode = null;
	    NextNode = null;
	  }

	  public Contestant_Node (Contestant_Node contestant_node)
	  {
	    Data = new Contestant (contestant_node.Data);
	    PrevNode = contestant_node.PrevNode;
	    NextNode = contestant_node.NextNode;
	  }

	  public Contestant GetData ()
	  {
	    return Data;
	  }

	  public Contestant_Node GetPrevNode ()
	  {
	    return PrevNode;
	  }

	  public Contestant_Node GetNextNode ()
	  {
	    return NextNode;
	  }

	  public void SetData (Contestant b)
	  {
	    Data = b;
	  }

	  public void SetPrevNode (Contestant_Node prevNode)
	  {
	    PrevNode = prevNode;
	  }

	  public void SetNextNode (Contestant_Node nextNode)
	  {
	    NextNode = nextNode;
	  }


	  public void Display ()
	  {
	    Data.Display ();
	  }


}
