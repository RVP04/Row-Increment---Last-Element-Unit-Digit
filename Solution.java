import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] matrix = new int[row][col];
		for(int i=0;i<row;i++)
	    for(int j=0;j<col;j++)
	        matrix[i][j] = sc.nextInt();
	        
	    for(int i=0;i<row;i++)
	    {
	        int sum = matrix[i][col-1]%10;
	        for(int j=0;j<col;j++)
	        {
	            System.out.print(matrix[i][j]+sum+" ");
	        }
	        System.out.println();
	    }

	}
}
