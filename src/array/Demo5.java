package array;
public class Demo5 {
public static void main(String[] args) {
		Object Obj [][] = new Object[5][5]; //Matrix Type Array
		Obj[0][0]= 'Z'; //[0 row, 0 column (1st row,1st column)]
		Obj[0][1]= 'Y';
		Obj[0][2]= 'X';
		Obj[0][3]= 'W';
		Obj[0][4]= 'V';
		
		Obj[1][0]= 'U';
		Obj[1][1]= 'T';
		Obj[1][2]= 'S';
		Obj[1][3]= 'R';
		Obj[1][4]= 'Q';
		
		Obj[2][0]= 'P';
		Obj[2][1]= 'O';
		Obj[2][2]= 'M';
		Obj[2][3]= 'L';
		Obj[2][4]= 'K';
		
		Obj[3][0]= 'J';
		Obj[3][1]= 'I';
		Obj[3][2]= 'H';
		Obj[3][3]= 'G';
		Obj[3][4]= 'F';
		
		Obj[4][0]= 'E';
		Obj[4][1]= 'D';
		Obj[4][2]= 'C';
		Obj[4][3]= 'B';
		Obj[4][4]= 'A';
		
		for(int row=0;row<Obj.length;row++) { 
			for(int col=0;col<Obj[2].length;col++)
			{
				System.out.println(Obj[row][col]+" ");
			}
			System.out.println();
		}
	}

}
