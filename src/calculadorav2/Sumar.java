package calculadorav2;

import java.util.Scanner;

public class Sumar {
     public void Suma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int numero1=Integer.parseInt(sc.next());
        System.out.println("Escriba un número: ");
        int numero2=Integer.parseInt(sc.next());
        int resultado;
        resultado = numero1 + numero2;
        System.out.println("El resultado es: "+resultado);
    }
}
