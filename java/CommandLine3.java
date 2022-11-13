package Asssigment.java;

public class CommandLine3 {
	public static void main(String[] arges) {
		int sum = 0;
	for(int i=0;i<arges.length;i++)
	{
			System.out.println(arges[i]);
			sum = sum + Integer.valueOf(arges[i]);
		}
		System.out.println("Sum ");
	}
}
