//worked w lian wong
public class myQueue<E>{

    public Node<E> start;
    public Node<E> end;

    public myQueue(){
	start = new Node<E>();
	end= new Node<E>();
	end.setNext(start);
    }

    public void enqueue(E data){
	 Node tmp = new Node(E);
	 if (start == null) {
	     start = tmp;
	     end = tmp;
	 } else {
	     end.setNext(tmp);
	     end = tmp;
	 }
    }
    /*	Node<E> tmp=new Node<E>(data);
	tmp.setNext(end);
	end=tmp;
	}*/

    public E dequeue(){
	E tmp= start.getData();
	start=start.getNext();
	return tmp;
    }

    public boolean empty(){
	return start==null;
    }

    public E head(){
	E tmp= start.getData();
	return tmp;
    }

    public String toString(){
	String s = "";
	Node<E> tmp;;
	for (tmp = start.getNext() ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s= s+ end;
	//s = s + "null";
	return s;
    }
}
