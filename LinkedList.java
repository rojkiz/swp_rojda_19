package Linked_list;
import java.util.ArrayList;

public class LinkedList {
	private Node head;
	
	public void add(int value) {
		Node tmp = new Node(value);
		
		if (head == null) {
			head = tmp;
			return;
		} 
		
		Node it;
		it = head;
		
		while (it.hasNext()) {
			it = it.next();
		}
		
		it.setNext(tmp);	
	}
	
	
	
	public void delete(int pos) {
		Node tmp = head;
		
		if(!tmp.hasNext())    
		{
	        return;
	    }
        if(pos == 0)    {
            head = tmp.next();
            return;
        }
        if(pos < 0)
        {
        	throw new IllegalArgumentException("pos muss gr��er als 0 sein");
        }
        for (int i = 0; i < pos - 1; i++) {
        	if(!tmp.hasNext()) {
        		return;
        	}
        	tmp = tmp.next();
        }
        
        if(!tmp.hasNext())    {
        	return;
        }
       
        
        Node newNode = tmp.next().next();
        tmp.setNext(newNode);
	}

	@Override
	public String toString() {
		String ret = "";
		
		Node it = head;
		while (it.hasNext()) {
			ret += "" + it.getValue() + " ";
			it = it.next();
		}
		ret += "" + it.getValue() + " ";
		return ret;
	}
	
	
	
	
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(4);
		ll.add(6);
		ll.add(8);
		System.out.println(ll);
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(4);
//		ArrayList<Integer> pointer = al;
//		for (int i = 0; i < pointer.size(); i++) {
//			System.out.println(pointer.get(i));
//		}
	}
}
