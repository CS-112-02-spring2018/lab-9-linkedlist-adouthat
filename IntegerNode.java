import java.util.LinkedList;
public class IntegerNode{
	private int data;
	private IntegerNode next;

	public IntegerNode(){
		data = 0;
		next = null;
	}

	public IntegerNode(int input){
		data = input;
		next = null;
	}

	public int getData(){
		return this.data;
	}

	public void setData(int inputD){
		this.data = inputD;
	}

	public IntegerNode getNext(){
		return next;
	}

	public void setNext(IntegerNode thisNode){
		this.next = thisNode;
	}

	public String toString(){
		String result = "";
		result+= data;
		return result;
	}

}