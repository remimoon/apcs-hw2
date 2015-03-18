public class LList {
   
    private Node l=null;
    private int len = 0;
    private Node dummy = new Node ("");

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext();
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

    public Node get(int i){
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

  public String remove(int n){
	if (n >= this.len || n < 0){
		return;
	node T = L;
	for (int i = 0; i < n-1; i++){
		T = T.getNext();
	}
	String s = T.getNext().getData();
	T.setNext(T.getNext().getNext());
	return s;
	}

		
}
