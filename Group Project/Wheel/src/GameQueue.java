
public class GameQueue {
	private char queue[];
	private int size;
	private int front;
	private int back;
	
	
	
	public GameQueue() {
		this.size = 51;
		this.back = -1;
		this.front = -1;
		for(int i=0; i<=(size-1);i++) {
			this.queue[i]='-';
		}
	}

	public boolean isEmpty() 
	{
		if(front==-1&& back==-1) {
			return true;
		}else {
			return false;
		}	 
	}
	
	public boolean isRepeat(char g)
	{
		int i=0;
		
		for(i=0; i<size; i++) {
			if(g== this.queue[i]) 
				return true;
		}
		return false;
	}
	public void enqueue(char g)
	{
		if(back==size-1)
		{
			System.out.println("Queue is full");
		}else {
			if(!isRepeat(g)) {
				if(front==-1) {
					front=0;
				}
				back++;
				queue[back]=g;
			}
		}
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			if(front==back) {
				front=back=-1;
			}else {
				for(int i=back; i>0; i--) {
					this.queue[i]='-';
				}
				front=back;
			}
		}
	}
	public void display()
	{
		if(!isEmpty()) {
			for(int i=0; i<(back+1);i++) {
				System.out.println("|"+this.queue[i]+"|");
			}
			System.out.println("");
		}
	}
	public void destroy()
	{
		while(back!=front)
		{
			dequeue();
		}
		this.back=-1;
		this.front=-1;
	}
}
