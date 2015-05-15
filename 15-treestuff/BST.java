import java.io.*;
import java.util.*;

public class Tree{

    Node r;

    public Node search(Node t, int i){
	if (t==null || t.getData()==i){
	    return t;
	}
	else if (i<t.getData()){
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }

    public String search(int i){
	Node n = search(r,i);
	if (n==null){
	    return "NOT FOUND";
	}else{
	    return n.toString();
	}
    }

    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = r;
	if (r==null){
	    r=n;
	    return;
	}
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }

    public String traverse(Node t){
	if (t == null){
	    return "";
	} else {
	    return traverse(t.getLeft()) + t.getData() + "," + traverse(t.getRight());
	}
    }

    public void remove(int data){
	Node t = r;
	Node t2 = null;
	if (r==null){
	    r=n;
	    return;
	}
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}
	if (t.getRight() == null && t.getLeft() == null){
	    if (t.getData() 
		}
	}
    }

    public int nodeCount (Node t){
	if (t == null){
	    return 0;
	} else {
	    return 1 + nodeCount(t.getLeft()) + nodeCount(t.getRight());
	}
    }

    public int maxValue(Node t) {
	if (t.getNext() == null) {
	    return t.getData();
	} else {
	    return Math.max(maxValue(t.getLeft()), maxValue(t.getRight());
			    }
	}

	public int height(Node t) {
	    if (t != null) {
		return 0;
	    } else {
		return 1 + Math.max(height(t.getLeft()) + height(t.getRight()));
	    }
	}


	public int longest(Node t) {
	    if (t == null) {
		return 0;
	    }
	    else {
		int r = 1 + height(t.getLeft()) + height(t.getRight());
		int left = longest(t.getLeft());
		int right = longest(t.getRight());
		return Math.max(r, left, right);
	    }

	    public void splitDupes(Node t) {
		if (t != null) {
		    if (t.getData() == t.getLeft().getData()) {
			Node after = t.getLeft();
			t.setLeft(new Node(t.getData() - 1));
			t.getLeft().setLeft(after);
		    } else if (t.getData() == t.getRight().getData()) {
			Node after = t.getRight();
			t.setRight(new Node(t.getData() - 1));
			t.getLeft().setLeft(after);
		    }
		    splitDupes(t.getLeft());
		    splitDupes(t.getRight());
		}
	    }

    public static void main(String[] args){
	Tree t = new Tree();
	Random r = new Random();
	for (int i = 0; i < 20; i ++){
	    int z = r.nextInt(100);
	    //System.out.println(z);
	    t.insert(z);
	}
	t.insert(30);
	System.out.println(t);
	System.out.println(t.search(30));
    }
}
