package package1;

<<<<<<< HEAD
import java.util.Scanner;

public class class1 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	boolean boolean1=false;
	boolean boolean2=false;
	
	String patata="hola soy una patata";
	String tomate="hola soy un tomate";
	System.out.println(patata+tomate);
	System.out.println("inserta una fruta");
	String fruta= sc.next();
	
	if(fruta.equals(patata))
		boolean1=true;
	
	if(fruta.equals(tomate))
		boolean2=true;
	System.out.println("la fruta es una patata? "+boolean1+" la fruta es un tomate? "+boolean2);
=======
public class class1 {
public static void main(String[] args) {
	System.out.println("hola");
>>>>>>> refs/heads/rama_nueva
}
}
