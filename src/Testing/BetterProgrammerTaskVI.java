package Testing;

import java.util.ArrayList;
import java.util.List;

public class BetterProgrammerTaskVI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 // Please do not change this interface
    interface ListNode {
        int getItem();
        ListNode getNext();
        void setNext(ListNode next);
    }

    public static ListNode reverse(ListNode node) {
    	 /*
        Please implement this method to
        reverse a given linked list.
       */
  	
  	List<ListNode> lista = new ArrayList<ListNode>();
  	lista.add(node);
  	while(node.getNext()!=null){
  		lista.add(node.getNext());
  		node = node.getNext();
  	}
  	node = lista.get(lista.size()-1);
  	if(lista.size()>1){
	    	for(int i=lista.size()-1;i>0;i--){
	    		node.setNext(lista.get(i-1));
	    	}
  	}
  	return node;
    	
    }
}
