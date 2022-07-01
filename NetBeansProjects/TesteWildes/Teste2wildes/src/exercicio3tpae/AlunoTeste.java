package exercicio3tpae;

import infoaluno.Aluno;//my package
import static infoaluno.Aluno.getTotAlunos;


import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        Aluno aluno, aluno1;
        String nome, cat;
        int qtdDisciplina, notas, totAlunos= 0;
        
        System.out.print("\nDigite o nome do aluno: ");
        nome = scanner.nextLine();
        System.out.print("\nInsira a categoria do aluno (bolsista/ não bolsista): ");
        cat = scanner.nextLine();
        
        aluno = new Aluno(nome, cat);
        
        System.out.print("\nEntre com a quantidade de disciplinas cursadas:");
        qtdDisciplina = scanner.nextInt();
        scanner.nextLine();
        for(int n= 0 ;n < qtdDisciplina;n++){
            
            System.out.print("\nInsira a nota na disciplina " + (n+1) +": ");
            notas = scanner.nextInt();
            aluno.inserirNota(notas);
        }
        aluno1 = aluno; aluno1.setCat("nãobolsista");
        
        System.out.println("\n############# RELATÓRIO FINAL #############");
        System.out.printf("Coeficiente de Rendimento: %.2f \n", aluno.rendimento());
        System.out.println("Situação final: " + aluno.studentSituation());
        
        System.out.println("\n");
        
        totAlunos = getTotAlunos();
        System.out.println("\n############# RELATÓRIO FINAL #############");
        System.out.printf("Coeficiente de Rendimento: %.2f \n", aluno1.rendimento());
        System.out.println("Situação final: " + aluno1.studentSituation());
        System.out.println("\nTotal de alunos " + totAlunos);
    }
    
}
