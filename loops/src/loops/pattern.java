package loops;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*   *****
			 	 *****
			  	 *****
			  	 *****
			  	 *****      */
			 
			for(int i=1;i<=5;i++)
			{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");	
			}
			System.out.println(); 
			}
		System.out.println("------------------------");
		
		/* 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555   */
		
			for(int m=1;m<=5;m++) 
			{
				for(int n=1;n<=5;n++)
				{
				System.out.print(m);
				}
				
				System.out.println(); 
			}  
	}
}
