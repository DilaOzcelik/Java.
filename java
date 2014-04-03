import java.util.*;
public class Test {
	public static void main(String[] args) {
		int i=0;
		int dizi[]=new int[100];
		Scanner input=new Scanner(System.in);
		do{
			System.out.println((i+1)+" sayi=");
			int n=input.nextInt();
			if(elemanVarmı(dizi, n)==false)
			{
				dizi[i]=n;
				i++;
			}
			else if(elemanVarmı(dizi,n)==true)
			{
				System.out.println("Girilen sayilar ayni");
			}
		}while(i<5);
	}
	private static boolean elemanVarmı(int dizi[], int n)
	{
		for (int i = 0; i < dizi.length; i++) 
		{
			if(dizi[i]==n)
			{
				return true;
			}	
		}
		return false;
	}
}
