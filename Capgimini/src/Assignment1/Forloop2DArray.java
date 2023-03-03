package Assignment1;

public class Forloop2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[2][2];
		arr[0][0]=12;
		arr[0][1]=23;
		arr[1][0]=78;
		arr[1][1]=34;
		//arr[4][4]=10;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
		
	
		System.out.print(arr[i][j]+"");
			}
			System.out.println();
			
	}
	}

}
