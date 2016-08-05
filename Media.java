import java.util.Scanner;

class Media
{
static double n1,n2,n3,n4,md,nova_md,ex;
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	n1 = in.nextDouble();
	n2 = in.nextDouble();
	n3 = in.nextDouble();
	n4 = in.nextDouble();
	md = (n1+n2+n3+n4)/4;
	if(md>=7)
		System.out.println("Aluno Aprovado" +","+ md);
	else{
		ex = in.nextDouble();
		nova_md=(md+ex)/2;
		if(nova_md>=5)
			System.out.println("Aluno Aprovado em exame"+","+nova_md);
		else
			System.out.println("Aluno Reprovado"+","+nova_md);
			}
																			}
}
