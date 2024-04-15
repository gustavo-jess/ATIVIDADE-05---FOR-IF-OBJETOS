package atividade04;

import java.util.Scanner;

public class NumerosAteVinte {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int entre0e100 = 0;

        int entre101e200 = 0;

        int maior200 = 0;

        System.out.println("Digite 20 números: ");

        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            } else if (numero >= 101 && numero <= 200){
                entre101e200++;
            }else{
                maior200++;
            }
        }
        System.out.println("Os números entre 0 e 100 são: " + entre0e100);
        System.out.println("");
        System.out.println("Os números entre 101 e 200 são: " + entre101e200);
        System.out.println("");
        System.out.println("Os nímeros maiores que 200 são: " + maior200);
        System.out.println("");
        System.out.println("Obrigado por utilizar este algoritmo!!!");

        
    }
}
