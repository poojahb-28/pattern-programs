package loops;

public class Pattern8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
				
			for(int j=1;j<=6;j++)
			{
				if((j==1 || j==3 || j==5))
				System.out.printf("%3d",j);
				
				else
				{
					System.out.printf("%3d",i);
					
				}
			}
			System.out.println();
		}
		
	} 
		
}

