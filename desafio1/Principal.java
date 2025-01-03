package desafio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço do aluno:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone do aluno:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email do aluno:");
        String email = scanner.nextLine();

        System.out.println("Digite a matrícula do aluno:");
        int matricula = scanner.nextInt();

        // Criando o objeto Aluno com os dados fornecidos pelo usuário
        Aluno aluno = new Aluno(nome, endereco, telefone, email, matricula);

        // Exibindo os dados do aluno
        System.out.println("\nDados do aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Matrícula: " + aluno.getMatricula());

        scanner.close();
    }
}

