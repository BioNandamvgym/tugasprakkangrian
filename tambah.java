import java.util.Scanner;
public class tambah
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int x,y,z;
		System.out.print("masukan nilai ke-1 : ");
		x=scan.nextInt();
		System.out.print("masukan nilai ke-2 : ");
		y=scan.nextInt();
		z=x+y;
		System.out.print("hasilnya adalah = "+z);
	}
}