import java.io.*;
import java.util.*;

public class pselection {

    public int[] partition (int[] L, int SI, int EI){
	int[] D = new int[L.length];
	
	for (int i = 0; i < SI; i++){
	    D[i] = L[i];
	}

	for (int i = EI; i < L.length; i++){
	    D[i] = L[i];
	}
	

	Random r = new Random();
	int pivot  = L[r.nextInt(L.length-1)];

	int x = SI;
	int y = EI;

	for (int i = SI; i <= EI; i++){

	    if (L[i] < pivot){
		D[x] = L[i];
		x++;
	    } else 
	     if (L[i] > pivot){
		D[y] = L[i];
		y--;
	     }
	}

	D[x] = pivot;
   
	return D;
    }

    public static void main (String[] args){
	pselection a = new pselection();

	int[] L = new int[10];	
	Random r = new Random();
	for (int i = 0; i < 10; i++){
	    L[i] = (r.nextInt(100));
	}
	
	System.out.println(Arrays.toString(L));

	System.out.println(Arrays.toString(a.partition(L, 0, L.length - 1)));
    }
}
			   
