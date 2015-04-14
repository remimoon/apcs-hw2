public class Node{
    
    //not the same as linkedlist node

    private int x,y;
    private Node prev;

    public Node(int x, int y){
        this.x = x;
	this.y = y;
    }

    public int getx(){
	return x;
    }

    public int gety(){
	return y;
    }

    public Node getPrev(){
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
}
