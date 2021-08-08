package loops;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 	12345
		  	12345
		  	12345
		  	12345
		  	12345  */
		 
			for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
		
				System.out.print(j);	
			}
			
			System.out.println(); 
		}  
		System.out.println("--------------------------");
		/*
		   		54321
		   		54321
		   		54321
		   		54321
		   		54321   */
		 
		 for(int m=1;m<=5;m++)  
		 {
			 for(int n=5;n>=1;n--)
			 {
				 System.out.print(n);
			 }
			 System.out.println();
		 }  
		
	}

}
