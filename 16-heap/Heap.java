import java.io. *;
import java.util. *;

public class Heap {

    private int[] Harray;

    public Heap(){
	this(20);
    }

    public Heap(int n){
	Harray = new int[n];
	for (int i = 0; i < n; i++){
	    Random r = new Random();
	    Harray[n] = r.nextInt(n);
	}
    }



}

