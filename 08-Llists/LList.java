public class LList {
   
    private Node l=null;
    private int len = 0;
    private Node dummy = new Node ("");

    public void add(int i){
	Node tmp = new Node(i);
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

    public void add(int i, int n){
	Node x = new Node(n);
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
	int s = T.getNext().getData();
	T.setNext(T.getNext().getNext());
	return s;
	}

	public boolean remove(int n) {
	    T = L.getNext();
	    T2 = L;
	    while (T != null){
		if (T.getData() == n){
		    T2.setNext(T.getnext());
		    return true;
			}
		return false;
		T2 = T;
		T = T.getNext();
	    }
	}

		
}
