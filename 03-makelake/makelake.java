public class makelake{


    private static int input[][]  = {
	{4, 6, 22, 2}, 
	{28, 25, 20, 32, 34, 36}, 
	{27, 25, 20, 20, 30, 34}, 
	{24, 20, 20, 20, 20, 30}, 
	{20, 20, 14, 14, 20, 20}, 
	{1, 4, 4} , 
	{1, 1, 10}
    };


     static int R = input[0][0];
     static int C = input[0][1];
     static int E = input[0][2];
     static int N = input[0][3];
    static int max;

    public void findmax(int R_s, int C_s, int D_s){
	    for (int x = R_s + 1; x < R_s + 4; x++){
		for (int y = C_s; y < C_s + 3; y++){
		    if (input[x][y] > input [x+1][y+1]){
			 max =  input[x][y];			 
		    }
		}
	    }
    }
    

    public void stomp(int R_s, int C_s, int D_s){
	int count = D_s;

	while (count > 0){
	    for (int x = R_s + 1; x < R_s + 4; x++){
		for (int y = C_s; y < C_s + 3; y++){
			if (input[x][y] == max){
			    input[x][y] --;
			}
		}
	    }
	    count --;
	}
    }


    public int volume(int R_s, int C_s){
	int total = 0;
	for (int x = R_s + 1; x < R_s + 4; x++){
	    for (int y = C_s; y < C_s + 3; y++){
		total += input[x][y];
	    }
	}
	return total * 72 * 72;
    }

    public static void main(String[] args){
	makelake test = new makelake();
	test.stomp(input[5][0], input[5][1], input[5][2]);
	test.volume(input[5][0], input[5][1]);
    }
}

		 
		
	

    
