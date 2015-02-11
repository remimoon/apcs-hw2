import java.io.*;
import java.util.*;

public class Maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#'; //path that you can walk along in maze
    private char wall=' '; //the wall, u cant walk into the wall
    private char me='z'; //you physically, your path along the maze will be shown in z's
    private char exit='$'; //end of maze
    private char visited = '.'; //shows the paths you've already visited
    private boolean solved = false; 
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Maze() 
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
				
    }
		
    public String toString()
    {
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

		/*
			solved - instance variable to indicate we're done
			
		 */
    public void solve(int x, int y){
	   if (board[x][y]==wall ||
	       board[x][y]==me ||
	       board[x][y]==visited ||
	       solved){
	       return;
	   }

	   if (board[x][y]==exit){
	       System.out.println(this);
	       solved = true;
	   }
	   delay(100);
	   System.out.println(this);
	   board[x][y]=me;
	   solve(x+1,y);
	   solve(x-1,y);
	   solve(x,y+1);
	   solve(x,y-1);
	   board[x][y]=visited;
		}
		
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
    }
}

