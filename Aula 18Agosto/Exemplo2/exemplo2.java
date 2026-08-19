/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    float base;
	    float altura;
	    
	    Scanner calculo = new Scanner(System.in);
	    
	    System.out.println("Digite o valor da base do triangulo: " );
	    base=calculo.nextFloat();
	    
	    System.out.println("Digie o valor da altura do triangulo: ");
	    altura=calculo.nextFloat();
	    
		System.out.println("A área do Triângulo é :  "+ (base*altura)/2);
	}
}