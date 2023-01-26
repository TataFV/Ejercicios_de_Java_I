import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in); //Instanciamos los objetos con new y la clase

//        //EJEMPLO
//        String frase;
//        int numero;
//        System.out.println("Introduce una frase:");
//        frase = escaner.nextLine(); //Indicamos que recogerá exclusivamente caracteres ASCII
//        System.out.println("Introduce un valor");
//        numero = escaner.nextInt(); //Indicamos que recogeráexclusivamente valores numéricos enteros.
//        System.out.println("Tu frase es " + frase + "\nTu número es " + numero);

        //Ejercicio 1
        System.out.println(" -- EJERCICIO 1 -- ");

        int num1;
        int num2;

        System.out.println("Escribe un número:");
        num1 = escaner.nextInt();
        System.out.println("Escribe otro número:");
        num2 = escaner.nextInt();

        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " + (num1 - num2));
        System.out.println("La multiplicación es: " + (num1 * num2));
        System.out.println("La división es: " + (num1 / num2));
        System.out.println("El módulo es: " + (num1 % num2));

        //Ejercicio 2
        System.out.println(" -- EJERCICIO 2 -- ");

        if(num1 > num2) {
            System.out.println("El primer número ("+num1+") es mayor");
        }else if(num2 > num1){
            System.out.println("El segundo número ("+num2+") es mayor");
        }else{
            System.out.println("Ambos números ("+num1+") son iguales");
        }

        //Ejercicio 3
        System.out.println(" -- EJERCICIO 3 -- ");

        System.out.println("Escribe otro número más:");
        int num3 = escaner.nextInt();
        int primero,segundo,tercero;

        if (num1 > num2) {
            if (num1 > num3) {
                primero = num1;
                if (num2 > num3) {
                    segundo = num2;
                    tercero = num3;
                } else {
                    segundo = num3;
                    tercero = num2;
                }
            } else {
                primero = num3;
                segundo = num1;
                tercero = num2;
            }
        } else {
            if (num2 > num3) {
                primero = num2;
                if (num1 > num3) {
                    segundo = num1;
                    tercero = num3;
                } else {
                    segundo = num3;
                    tercero = num1;
                }
            } else {
                primero = num3;
                segundo = num2;
                tercero = num1;
            }
        }

        System.out.println("El primero es: " + primero);
        System.out.println("El segundo es: " + segundo);
        System.out.println("El tercero es: " + tercero);


        //Ejercicio 4
        System.out.println(" -- EJERCICIO 4 -- ");

        for (int i = 0; i < num3; i++) {
            num1 += num2;
            //System.out.println("num1: " + num1);
        }
        System.out.println("El resultado es: " + num1);


        //Ejercicio 5
        System.out.println(" -- EJERCICIO 5 -- ");

        String frase;
        System.out.println("Introduce una frase: ");
        frase = escaner.nextLine();
        frase = frase.toLowerCase();

        if (frase.contains("m") || frase.contains("b") || frase.contains("y")) {

            int m = frase.contains("m") ? frase.indexOf("m") : 9999;
            int b = frase.contains("b") ? frase.indexOf("b") : 9999;
            int y = frase.contains("y") ? frase.indexOf("y") : 9999;

            if ( (m < b) && (m < y) ){
                System.out.println("La primera letra que se encontro es : 'm'.");
            }

            if ( (b < m) && (b < y) ) {
                System.out.println("La primera letra que se encontro es : 'b'.");
            }

            if ( (y < m) && (y < b) ) {
                System.out.println("La primera letra que se encontro es : 'y'.");
            }
        }else{
            System.out.println("La frase no contiene ni 'm', ni 'b', ni 'y'.");
        }
    }

}