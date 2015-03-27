
public class Driver{

    public static void main(String[] args){

	myQueue<Integer> q = new myQueue<Integer>();
	q.enqueue(5);
	q.enqueue(3);
	System.out.println(q);
	q.dequeue();
	System.out.println(q);
    }
}
