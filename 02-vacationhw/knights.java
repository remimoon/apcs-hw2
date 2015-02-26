import java.io.*;
import java.util.*;

public class knights
{
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char knight= 'K';
    private char visited = '.';
    private boolean solved = false;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
		}
		
    public knights() 
    {
	maxX= 40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("untitled.txt"));
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

    public boolean check(){
	boolean check = true;
	for (int x = 0; x < board.length; x++){
	    for (int y = 0; y < board[0].length; y++){
		if (board[x][y] == '#'){
		    check = false;
		    break;
		}
	    }
	}
	return check;
    }


    public void solve(int x, int y){
	     if (board[x][y]==wall ||
		   board[x][y]==knight ||
		   board[x][y]==visited ||
		   solved){
		 return;
	     }

	     if (check() == true){
		 System.out.println(this);
		 solved = true;
	     }
				delay(100);
				System.out.println(this);
				board[x][y]=knight;
				solve(x+1,y+2);
				solve(x-1,y+2);
				solve(x+1,y-2);
				solve(x-1,y-2);
				if (!solved){
						board[x][y]=visited;
				}
		}
		
		public static void main(String[] args){
				knights m = new knights();
				System.out.println(m);
				m.solve(1,1);
				System.out.println(m);
		}
}
