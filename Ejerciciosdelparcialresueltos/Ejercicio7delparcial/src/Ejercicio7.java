public class Ejercicioparcial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, x=4, w=9, q;
		
		for(i=-1; i<20; i=i-3) {
			x++;
			for(q=4; q<11; q++) {
				do {
					i=i+3;
					w=4;  //Asigné el valor 4 a "w" puesto que la funcion Sizeof() no está presenta en java.
					i=x+w; 
					x=w+i;
				} while(x<15);
			}
		}
		System.out.println("x:"+x+" i:"+i);
	}

}


public class Ejercicio7 {

}
