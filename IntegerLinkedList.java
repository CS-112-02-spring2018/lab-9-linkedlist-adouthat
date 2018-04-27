import java.util.LinkedList;
public class IntegerLinkedList{
	private IntegerNode head;
	private IntegerNode current;                 //Creating head and current IntegerNodes
	private int numberOfObjects;


	public IntegerLinkedList(){
		head = null;
		numberOfObjects = 0;
	}

	private int peek(){                   //Returning the value of the head
		return head.getData();
	}

	 public void insert(int data){
  		IntegerNode temp = new IntegerNode(data);
  		IntegerNode current = head;
  		temp.setNext(head);                             //Using a temp node to swap values and insert a new one
  		head = temp;
  		numberOfObjects++;
 	}
 	
 	public int getNumberOfItems(){
 		return numberOfObjects;
 	}

 	public boolean delete(int value){
 		 current = head;
        if(numberOfObjects == 0){
            System.out.println("Linked list is empty");
            return false;
        }
        else if(numberOfObjects == 1){
            if(current.getData() == value){
                head = null;
                current = null;                               //Checking if the linked list is valid or not, if the linked list has no values
                numberOfObjects--;							 // Then it will return false, otherwise it will use the current and head IntegerNodes to delete the value, shift other values
                return true;								// And decrement the number of objects
            }
            else
                System.out.println("Value not found");
        }
        else{
            if(current.getNext().getData() == value){
                current.setNext(current.getNext().getNext());
                numberOfObjects--;
                return true;
            }
        }
        current = current.getNext();
        return false;
    }
    public String toString()
    {
        current = head;
        String output = "";
        while(current != null)
        {
            output = output + "[" + current.getData() + "]";
            current = current.getNext();
        }

        return output;
    }

}