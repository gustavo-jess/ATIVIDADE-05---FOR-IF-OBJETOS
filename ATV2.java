package atividade02;

public class Xuxa {
    public static void main(String[]args){
        int nmrPatinhos = 5;

        for (int i = nmrPatinhos; i >= 0; i--) {
            if (i == 0) {
                System.out.println("A mamãe patinha foi procurar, além das montanhas");
                System.out.println();
                System.out.println("Na beira do mar, a mamãe gritou: Quá, quá, quá, quá");
                System.out.println();
                System.out.println("A mamãe gritou: Quá, quá, quá, quá");
                System.out.println();
                System.out.println("E os " + nmrPatinhos + " patinhos voltaram de lá.");
                System.out.println();
            } else {
                System.out.println(i + " patinhos foram passear, além das montanhas");
                System.out.println();
                System.out.println("Para brincar, a mamãe gritou: Quá, quá, quá, quá");
                System.out.println();
                System.out.println("Mas só " + (i - 1) + " patinhos voltaram de lá.");
                System.out.println();

            }
        }
    }
}
