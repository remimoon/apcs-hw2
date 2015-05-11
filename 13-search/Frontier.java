import java.util.*;

public class Frontier {

    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	l.add(n);
    }

    public Node getHigh(){
	Node temp = l.get(0);
	Node output = temp;
	int index = 0;
	while(index < l.size()){
	    temp = l.get(index);
	    index ++;
	    if(temp.getPriority() <= output.getPriority()){
		output = temp;
	    }
	}
	return output;
    }

    public Node remove() {
	int index = 0;
	Node temp = l.get(0);
	while(index<l.size()){
	    if(temp == getHigh()){
		break;
	    }
	    index ++;
	    temp = l.get(index);
	}
	return l.remove(index);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}
