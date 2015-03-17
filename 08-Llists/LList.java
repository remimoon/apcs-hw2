public class LList {
   
    private Node l=null;
    private int len = 0;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public Node find(int i){
	Node f = l;
	int a = 0;
	while (a < i){
	    f =  f.getNext();
	    a++;
	}
	return f;
    }

    public void add(int i, String s){
	Node x = new Node(s);
	Node f = find(i);
	if (i > 0){
	    Node a = find(i-1);
	    a.setNext(x);
	}
	x.setNext(f);
	if (i == 0)
	    l = x;
    }

    public void add(String s){

		
}
