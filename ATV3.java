package atividade03;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anos = 0;

        int meses = 0;

        int dias = 0;

        int idadeEmDias = 0;

        System.out.println("Digite sua idade em anos: ");
        anos = scanner.nextInt();

        System.out.println("Digite sua idade em meses: ");
        meses = scanner.nextInt();

        System.out.println("Digite sua idade em dias: ");
        dias = scanner.nextInt();

        idadeEmDias = (anos * 365) + (meses * 30) + (dias);

        System.out.println("Sua idade em dias é: " + idadeEmDias + " dias");
        
        
    }
}
