package ExamenFinal;

import java.util.Scanner;

public class menu {
	public static int op=0;
	public static void main(String[] args) {
		char back='y';
		Scanner entrada=new Scanner(System.in);
		do {
		
			do {
			System.out.println("---------------Menu---------------");
			System.out.println("| 1. Ejercicio 1                 |");
			System.out.println("| 2. Ejercicio 2                 |");
			System.out.println("| 3. Ejercicio 3                 |");
			System.out.println("| 4. Salir                       |");
			System.out.println("----------------------------------");
			System.out.print("->");
			op=entrada.nextInt();
			
			}while(op<1 || op>4);
		
		switch(op) {
		
		//-----------------Ejercicio#1
		case 1:
			float num1=0,num2=0;
			System.out.println("Ingrese un numero");
			num1=entrada.nextFloat();
			System.out.println("Ingrese un numero");
			num2=entrada.nextFloat();
			ejercicio1 op1=new ejercicio1(num1, num2);
			System.out.println(" ");
			System.out.println("Respuesta: "+op1.comparar());
			System.out.println("\nDesea regresar al menu? y/n");
			System.out.print("->");
			back=entrada.next().charAt(0);
			break;
			
		//------------------Ejercicio#2
		case 2:
			  System.out.println("Ingrese un numero: "); 
			  int n=entrada.nextInt();
			  
			  	for(int i=0;i<=n;i++) {
			  		
			  		for(int j=n-i;j>0;j--) {
			  			System.out.print(" ");
			  		}
			  		
			  		for(int j=0;j<i;j++) {
			  			if(i%2==0) {
			  				i++;
			  			}
			  			System.out.print(" *");
			  		}
			  		System.out.println("");
			  	}
			  
		       
		        System.out.println("\nDesea regresar al menu? y/n");
		        System.out.print("->");
				back=entrada.next().charAt(0);
				break;
		case 3:
			System.out.println("No me salio :(");
			System.out.println("\nDesea regresar al menu? y/n");
		    System.out.print("->");
			back=entrada.next().charAt(0);
			break;
		case 4:
			break;
			
		}
		
	}while((back=='y' || back=='y') && op!=4);
		System.out.println("Gracias por utilizar mi aplicacion");
	}
	
	


}
