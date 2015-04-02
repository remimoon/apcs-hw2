import java.io.*;
import java.util.*;
public class Maze2
{

    private queue q = new queue();
    private char[][] board;
    private int maxX;
    private int maxY;
    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;


    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public Maze2()
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

    public Node newNode(int x, int y){
	Node n = new Node(x,y);
	return n;
    }

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
	q.enqueue(newNode(x+1,y));
	q.enqueue(newNode(x-1,y));
	q.enqueue(newNode(x,y+1));
	q.enqueue(newNode(x,y-1));
	while (! q.empty()){
	    if (q.getData() == exit){
		return;
	    }
	    q.dequeue();
	}		
	if (!solved){
	    board[x][y]=visited;
	}
    }

    public static void main(String[] args){
	Maze2 m = new Maze2();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}
