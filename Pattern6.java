package pr5;

public class Pattern6 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
			
			