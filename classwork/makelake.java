public class makelake{

    int R,C,E,N;

    int input[][]  = {{4, 6, 22, 2}, {28, 25, 20, 32, 34, 36}, {27, 25, 20, 20, 30, 34}, {24, 20, 20, 20, 20, 30}, {20, 20, 14, 14, 20, 20}, {1, 4, 4} , {1, 1, 10}};

    R = input[0][0];
    C = input[0][1];
    E = input[0][2];
    N = input[0][3];

    public void stomp(R_s, C_s, D_s){
	int count = D_s;
	while (count > 0){
	    for (int x = R_s + 1; x < R_s + 4; x++){
		for (int y = C_s; y < C_s + 3; y++){
		    if (input[x][y] > input [x+1][y+1]){
			int max =  input[x][y];
		    }
		    if (input[x][y] = max)}
		input[x][y] --;
	    }
	    count --;
	}
    }

    public void main(){
	stomp(input[5][0], input[5][1], input[5][2]
		 
		
	

    
