public class queue<E> {
    //back means back of the queue
    private Node<E> back;
    private Node<E> front;
    private int len;
    public queue() {
	front = new Node<E>();
	back = front;
	len = 0;
    }
    public void enqueue(E data) {
	Node<E> tmp = new Node<E>(data);
	back.setNext(tmp);
	back = tmp;
	len++;
    }
    public E dequeue() {
	E data = front.getData();
	front = front.getNext();
	len--;
	return data;
    }
    public boolean empty() {
	return (front == back);
    }
    public E front() {
	return front.getNext().getData();
    }
    public static void main(String[] args) {
	queue<Integer> q = new queue<Integer>();
	q.enqueue(10);
	q.enqueue(11);
	//q.dequeue();
	System.out.println(q.front());
    }
}
