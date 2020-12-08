package Backtracking;
import java.util.*;
public class rat_in_a_maze {
	 public static void main(String[] args) throws Exception {
	        
	        
	        Scanner sc= new Scanner(System.in);
	        int n =sc.nextInt();
	        int m =sc.nextInt();        
	        int[][] arr = new int[n][m];
	        for(int i =0;i<n;i++){
	            for(int j =0;j<m;j++){
	                arr[i][j]=sc.nextInt();                
	            }
	            
	        }
	        floodfill(arr,0,0,"",new boolean[n][m]);
	    }

	    public static void floodfill(int[][] maze, int row, int col, String asf, boolean[][] visited){
	        if(row<0||col<0||row==maze.length||col==maze[0].length||maze[row][col]==1){
	            return ;   
	        }
	        if(visited[row][col]){
	            return;
	        }
	        if(row==maze.length-1&&col==maze[0].length-1){
	            System.out.println(asf);
	            return;
	        }
	        
	        visited[row][col]=true;
	        floodfill(maze,row-1,col,asf+"t",visited);   
	        floodfill(maze,row,col-1,asf+"l",visited);   
	        floodfill(maze,row+1,col,asf+"d",visited);   
	        floodfill(maze,row,col+1,asf+"r",visited);   
	        visited[row][col]=false;
	    }
}

