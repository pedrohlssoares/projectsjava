import java.util.Scanner; 

public class teste1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        String idade = scanner.nextLine();

        System.out.print("Você ama alguém? ");
        String amor = scanner.nextLine();

        System.out.println("Olá, " + nome +"!" + "Você tem essa idade: " + idade + ".Pedro  Hmmm, será que aceita um leite quente?");
        scanner.close();

        System.out.println("Testando outras coisas e outros textos " + nome);
        System.out.println("Esse será o segundo texto");
        System.out.println("Esse é o terceiro testo da classe pública.");
        System.out.println("O nome do seu amor é: " + amor);
    }
}

// Esse código é sobre perguntas e outputs
