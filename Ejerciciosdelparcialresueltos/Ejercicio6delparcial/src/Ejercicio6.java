import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int [] A,B,C;
		C= new int[4];
	
		int dimens;
		System.out.println("ingrese la dimension de la cadena de numeros");
		dimens=reader.nextInt();
		A= new int[dimens];
		B= new int[dimens];
		System.out.println("Ingrese los valores de la cadena");
		for (int i=0;i<dimens;i++ ) {
			A[i]=reader.nextInt();
			
		}
		
		for (int i=0;i<=(dimens-5);i++) {
			int c=(A[i]*A[i+1]*A[i+2]*A[i+3]);
			int d=(A[i+1]*A[i+2]*A[i+3]*A[i+4]);
			if(c>d) {
			C[0]=A[i];
			C[1]=A[i+1];
			C[2]=A[i+2];
			C[3]=A[i+3];
			}else {
				C[0]=A[i+1];
				C[1]=A[i+2];
				C[2]=A[i+3];
				C[3]=A[i+4];												
			}
		}
		
		System.out.println("la mayor serie es ");
		for(int a=0; a<4; a++) {
				System.out.print(C[a]+" ");				
			} System.out.println();
		

	}

}
