import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T>
{
	private Node<T> topnode;

	public LinkedStack()
	{
		topnode=null;
	}

	public void push(T newEntry)
	{
		Node newdata=new Node(newEntry , topnode);
		topnode=newdata;
	}
	public T pop()
	{
		T toreturn=null;
		if(topnode!=null)
		{
			toreturn=topnode.getData();
			topnode=topnode.getNextNode();

		}
		else
		{
			throw new EmptyStackException();
		}
		return toreturn;
	}

	public T peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return topnode.getData();

	}

	public boolean isEmpty()
	{
		return topnode == null;
	}

	public void clear()
	{
		topnode = null;
	}
} 