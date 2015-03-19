public class LLit {

    private Node l;

    public LLit(Node n){
	l = n.getNext();
    }

    public boolean hasNext(){
	return l != null;
    }

    public int next (){
 //moves to the next node,returns the value in the node before the move
	int s = l.getData();
	l = l.getNext();
	return s;
}
