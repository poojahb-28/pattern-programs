package loops;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int x=i;
			int y=n-i+1;
			for(int j=1;j<=n;j++)
			{
				if(j%2==1)
				{
					System.out.printf("%3d",x);
				}
				else
				{
					System.out.printf("%3d",y);
				}
				x=x+n;
				y=y+n;
			}
			System.out.println();
		
	}

}
}
