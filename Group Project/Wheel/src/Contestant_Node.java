
public class Contestant_Node {
	  private Contestant data;
	  private Contestant_Node nextNode;


	  public Contestant_Node ()
	  {
	    nextNode = null;
	  }


	  public Contestant_Node (Contestant data)
	  {
	    this.data=data;
	  }


	  public Contestant_Node (Contestant data, Contestant_Node nextNode)
	  {
	    this.data=data;
	    this.nextNode=nextNode;
	  }

	  public Contestant getData ()
	  {
	    return data;
	  }

	  public Contestant_Node getNextNode ()
	  {
	    return nextNode;
	  }

	  public void setData (Contestant data)
	  {
	    this.data=data;
	  }

	  public void setNextNode (Contestant_Node nextNode)
	  {
	    this.nextNode = nextNode;
	  }
	  public void setDataGT(int GT)
	  {
		  //sets the grand total directly.
		  this.getData().setGrand_Total(GT);
	  }


	  public void Display ()
	  {
	    data.Display ();
	  }


}
