public class Main {

    public static void main(String[] args) {
        // write your code here
        Pilha P1 = new Pilha();
        Pilha P2 = new Pilha();

        P1.push(3);
        P1.push(5);
        P1.push(7);
        P1.push(9);
        P1.imprime();
        P1.copia(P2);
        System.out.println("P1");
        P1.imprime();
        System.out.println("P2");
        P2.imprime();
        if (P1.iguais(P2))
            System.out.println("iguais");
        else
            System.out.println("diferentes");
    }
}

