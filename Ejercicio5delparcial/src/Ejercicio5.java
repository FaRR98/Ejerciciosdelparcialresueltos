import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("ingrese una oración o palabra");
		String palabra=reader.nextLine();
		String palabra1=palabra.toUpperCase();
		String c=palabra1.replace(" ","");
		System.out.println(c);
		for(int i=0; i<(c.length())/2; i++) {
			String a=c.substring(i,i+1);
			String b=c.substring(c.length()-i-1,c.length()-i);
			if(a.compareTo(b)!=0) {
				y=y+1;
			}else {
				x=x+1;
			}
			
		}
		if(y>0 && x==0 || y>0 && x>0) {
			System.out.println("La oración o palabra no es un palíndromo");
		}
		if(x>0 && y==0) {
			System.out.println("La oración o palabra es un palíndromo");
		}
	}

}
