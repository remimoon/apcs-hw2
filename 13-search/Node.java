import java.util.*;

public class Node {

    private int x,y;
    private Node prev;
    private int priority;
    //private double priority;
    private int steps = 0;

    public Node(int x, int y,int steps){
	this.x = x;
	this.y = y;
	priority = 26 -x + 18- y;
	this.steps = steps;
	//priority = Math.sqrt((26-x) *(26-x) + (18-y) * (18-y));
    }

    public Node getPrev() {
	return prev;
    }

    public int getPri(){
	return priority;
    }

    public int getPriority(){
	return priority + steps;
    }

    public int getSteps(){
	return steps;
    }

    public void setPrev(Node n){
	prev = n;
    }

    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }
}
