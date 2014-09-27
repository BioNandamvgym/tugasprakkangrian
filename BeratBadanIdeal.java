import java.util.Scanner;
class BeratBadanIdeal
{	public static void main (String[]args)
	{	double berat,ideal,tinggi,selisih;
		Scanner scn = new Scanner (System.in);
		System.out.print ("Masukkan berat badan : ");
		berat = scn.nextDouble();
		System.out.print ("Masukkan tinggi badan : ");
		tinggi = scn.nextDouble();
		ideal = (tinggi-100)-((tinggi-100)*0.1);
		selisih = ideal - berat;
		if (selisih == 2 || selisih == -2)
			System.out.print ("Berat Badan Ideal");
		else
			System.out.print ("Berat Badan Tidak Ideal");
	}
}