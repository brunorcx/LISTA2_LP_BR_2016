//import java.util.Scanner;

class C
{
static int aux,tamanho,i,j;
public static void main(String args[]){
	int A[] = new int[100];
	//Scanner in = new Scanner(System.in);
	//tamanho = 4;
	//for(i=0;i<tamanho;i++)
		//A[i]= in.nextInt();

	for(i=1;i<tamanho-1;j=i)
		while(j>0 && A[j-1]>A[j]){
			aux = A[j];
			A[j]=A[j-1];
			A[j-1]=aux;
			j=j-1;
														 }
	//for(i=0;i<tamanho;i++)
		//System.out.println(A[i]);
																			}

}
