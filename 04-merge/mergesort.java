import java.io.*;
import java.util.*;

public class mergesort{
    
    public ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> merged = new ArrayList<Integer>();
	int A = 0;
	int B = 0;
	while(A < a.size() && B < b.size()){
	    if (a.get(A) < b.get(B)){
		merged.add(a.get(A));
		A++;
	    }
	    else{
		merged.add(b.get(B));
		B++;
	    }
	}

	while (A < a.size()){
		merged.add(a.get(A));
		A++;
	}

	while (B < b.size()){
		merged.add(b.get(B));
		B++;
	}
    

	return merged;
    }

    public ArrayList<Integer> sort (ArrayList<Integer> x){

	//	ArrayList<Integer> sorted = new ArrayList<Integer>();

	ArrayList<Integer> first = new ArrayList<Integer>();
	ArrayList<Integer> second = new ArrayList<Integer>();

    if ( x.size() <= 1){
	return x;
    } else {
	for (int i = 0; i < x.size()/2; i++){
	    first.add(x.get(i));
	}
	for (int i = x.size()/2 ; i < x.size(); i++){
	    second.add(x.get(i));
	}
    }

    return merge(sort(first), sort(second));

    }

    public static void main(String[] args){
	mergesort a = new mergesort();

	ArrayList<Integer> x = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0;i<8;i++){
	    x.add(r.nextInt(100));
	}
	System.out.println(x);

	System.out.println(a.sort(x));
    }

}






	    
	    
	    

    
