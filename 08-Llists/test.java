import java.io.*;
import java.util.*;
import java.lang.System;

public class test{
    public static void main (String[] args){
	long t = System.currentTimeMillis();
	System.out.println(t);

	long start, elapsed;

	Random r = new Random;
	ArrayList<Integer> x = new ArrayList<Integer>();
	for (int i = 0; i < 20; i ++){
	    x.add(r.nextInt(10));
	}

	LList y = new Llist();


	start = System.currentTimeMillis();
	
	elapsed = System.currentTimeMillis() - start;
    }
}
