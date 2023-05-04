import java.util.Scanner;

public class CalculadoraSimples{
     public static void main(String[] args) {
        //Declaração de variáveis 
        int n1, n2, total , op;
        //Criação e instancia do objeto de entrada
        Scanner input = new Scanner(System.in);

        do {
        System.out.println("\n\t\t\t -- Calculadora Simples -- \n");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Sair");
            
            System.out.println("Opção:");
            op = input.nextInt();

            if (op == 1) {
                 //Beatriz Mayumi
            //Entrada
            System.out.println("informe n1:");
            n1 = input.nextInt(); 
            System.out.println("Informe n2:");
            n2 = input.nextInt();
            //Processamento
            total = n1 + n2;
            //Saída 
            System.out.printf("%d + %d = %d", n1, n2 , total);
                 
                System.out.println("\n\t\t\t -- Soma -- \n");
            } else if(op == 2){
                System.out.println("\n\t\t\t -- Subtração--\n");
            } else if(op == 3){
                System.out.println("Forte Abraço!");
            } else {
                System.out.println("Opção"  + op + "Incorreta!");
            }
        } while (op!=3);
     }

}
