import java.util.*;
public class Maze{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("迷路の大きさを入力してください");
		System.out.print("縦>>");
		final int ROW=sc.nextInt();
		System.out.print("横>>");
		final int COL=sc.nextInt();
		CreateStage(ROW,COL);
		

	}
	static void CreateStage(int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("[]");
			}
			System.out.println();
		}
	}
	static void CreateMaze(int row,int col){
		int[][] mazeNum=new int[row][col];
		//初期値を0とし、壁=0,道=1,Start=2,Goal=3とする。
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mazeNum[i][j]=0;
			}
		}
		//左から2,下から1のマスをStartに設定する。	
		mazeNum[row-2][1]=2;

	}
	static boolean isEdge(int row,int col,int ROW,int COL){
		boolean isEdge;
		if(row==0 || row==(ROW-1) || col==0 || col==(COL-1)){
			isEdge=true;
		}else{
			isEdge=false;
		}
		return isEdge;
	}
}
