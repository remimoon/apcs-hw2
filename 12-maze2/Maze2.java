import java.io.*;
import java.util.*;
public class Maze2
{

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
    /*
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
    */

    public void bfs(int x, int y){
	Frontier f = new Frontier();

	//add intial node to frontier
	f.add(new Node(x,y));

	board[x][y] = 'x';
	Node current = null;
	int tx=0, ty=0; //tempx and tempy

	while(!f.isEmpty()){
	    current = f.remove();
	    int cx = current.getx();
	    int cy = current.gety();

	    board[cx][cy] = 'z';
	    Node tmp;

	    tx = cx+1;
	    ty = cy;
	    if(board[tx][ty] == '#' || board[tx][ty] == '$'){
		tmp = new Node(tx,ty);
		tmp.setPrev(current);
		f.add(tmp);
	    }

	    tx = cx-1;
	    ty = cy;
	    if(board[tx][ty] == '#' || board[tx][ty] == '$'){
		tmp = new Node(tx,ty);
		tmp.setPrev(current);
		f.add(tmp);
	    }

	    tx = cx;
	    ty = cy+1;
	    if(board[tx][ty] == '#' || board[tx][ty] == '$'){
		tmp = new Node(tx,ty);
		tmp.setPrev(current);
		f.add(tmp);
	    }

	    tx = cx;
	    ty = cy-1;
	    if(board[tx][ty] == '#' || board[tx][ty] == '$'){
		tmp = new Node(tx,ty);
		tmp.setPrev(current);
		f.add(tmp);
	    }

	delay(100);
	System.out.println(this);
	}

	//recover path
	for (Node p = current.getPrev(); p != null; p = p.getPrev()){
	    board[p.getx()][p.gety()] = 'P';
	    delay(100);
	    System.out.println(this);
	}
    }

    public static void main(String[] args){
	Maze2 m = new Maze2();
	System.out.println(m);
	m.bfs(1,1);
	System.out.println(m);
    }
}
