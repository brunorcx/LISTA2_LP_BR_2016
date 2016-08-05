import java.util.Scanner;

class Par
{
static int n,resto;
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	resto= n -2 * (n/2);
	if(resto==0)
		System.out.println("O valor " + n + " É PAR.");
	else
		System.out.println("O valor " + n + " É IMPAR.");
																				}

}
