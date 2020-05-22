package doublyLinkedList;

public class DoublyLinkedList {
private Nodedoubly head;
	
	public void add(int value) 
	{
        Nodedoubly tmp = new Nodedoubly(value);

        if (head == null) 
        {
            head = tmp;
            return;
        }
        
        Nodedoubly it;
        it = head;
        
        while (it.hasNext()) 
        {
            it = it.next();
        }

        it.setNext(tmp);
        tmp.setPrev(it);
    }
	
	public void delete(int pos)
	{
        Nodedoubly tmp = head;
        
        if(!tmp.hasNext())    
		{
	        return;
	    }
        
        if(pos == 0)    {
            head = tmp.next();
            return;
        }
        
        if(pos < 0)    {
             throw new IllegalArgumentException("pos must be bigger than zero");
        }
            
        for (int i = 0; i < pos - 1; i++) {
        	if(tmp.hasNext())
        	{
        		tmp = tmp.next();
        	} else 
        	{
				throw new IllegalArgumentException("pos greater than listSize(" + i+")");
				}
        }
        
        if(!tmp.hasNext())    {
            throw new IllegalArgumentException("pos greater than listSize");
        }
        
        Nodedoubly newNextNodedoubly = tmp.next().next();
        tmp.setNext(newNextNodedoubly);
        newNextNodedoubly.setPrev(tmp);
    }
	
	public String toString() {
        String ret = "";
        Nodedoubly it = head;
        
        while (it.hasNext()) 
        {
            ret += "" + it.getValue() + " ";
            it = it.next();
        }
        
        ret += "" + it.getValue() + " ";
        return ret;
    }
	
	public static void main(String[] args) 
	{
		DoublyLinkedList ll = new DoublyLinkedList();
        ll.add(4);
        ll.add(6);
        ll.add(8);
        ll.delete(4);
        System.out.println(ll);
	}
	
}
