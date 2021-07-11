package twoDimensionArray;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] x=new int [2][3];
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		
		x[1][0]=4;
		x[1][1]=5;
		x[1][2]=6;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++)
			{
				 System.out.print(x[i][j] + "\t");
			}
			System.out.println("\t");
		}
		
		System.out.println("two Diminsion array");
		int y[][]= {{1,2,3,4},{2,3,4,5}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++)
			{
				 System.out.print(y[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}

}
