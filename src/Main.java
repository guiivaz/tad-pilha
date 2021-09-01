import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // FEITO POR GUILHERME VAZ, MARCIO MOREIRA E MATHEUS COMAR
        Scanner input = new Scanner(System.in);
        Pilha P1 = new Pilha();
        int opcao = 0;
        P1.push(3);
        P1.push(5);
        P1.push(7);
        P1.push(9);
        while(opcao!=5){
            System.out.printf("Escolha uma opcao\n1-Imprimir pilha\n2-Mostrar tamanho\n3-Mostrar elemento de topo\n4-Procurar elemento\n5-Sair\n\n");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    P1.imprime();
                    break;
                case 2:
                    System.out.println("O tamanho da pilha é: "+ P1.tamanho());
                    break;
                case 3:
                    System.out.println("O elemento do topo da pilha é"+ P1.top());
                    break;
                case 4:
                    System.out.println("Qual elemento deseja procurar?");
                    int elemento = input.nextInt();

                    if(P1.procurar(elemento))
                        System.out.println("O elemento está na pilha");
                    else
                        System.out.println("O elemento não está na pilha");
                    break;

            }
        }


    }
}

