public class Node<T>
{
	private T data;
	private Node nextNode;

      public Node(T data)
      {
        this.data=data;
      } 
      
      public Node(T data, Node nextNode)
      {
        this.data=data;
        this.nextNode=nextNode;
      }   
      
      public T getData()
      {
        return data;
      }   
      
      public void setData(T newData)
      {
        data = newData;
      } 
      
      public Node getNextNode()
      {
        return nextNode;
      } 
      
      public void setNextNode(Node nextNode)
      {
        nextNode = nextNode;
      } 
} 
