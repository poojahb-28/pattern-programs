package loops;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated me
		for(int i=1;i<=5;i++)
		{
			int x=i;
			for(int j=1;j<=5;j++)
			{
			System.out.printf("%3d",x);
			x+=5;
			}
			System.out.println();
		}
	}
}