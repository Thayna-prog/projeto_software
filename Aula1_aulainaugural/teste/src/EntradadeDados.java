import java.util.Scanner;

public class EntradadeDados {
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Nome: " + nome);

        System.out.print("Digite sua idade: ");
        int idade = sc.nexLine();
        System.out.println("Idade: " + idade);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("peso: " + peso);



    }
}
