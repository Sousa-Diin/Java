package lista;

/**
 *
 * @author wildes
 */
public class Principal {
    public static void main (String[] args){
        
       Diario diario = new Diario("GAC111");
       Aluno a;
       
       diario.adicionarAluno(new Aluno("Wildes",96,10));
       diario.adicionarAluno(new Aluno("Ana",78,20));
       diario.adicionarAluno(new Aluno("Jonatha", 89,19 ));
       
       diario.gerarDiarioTurma();
        
       Aluno b;
       diario.adicionarAluno(new Aluno("Fulano",45, 5));
       
       diario.gerarDiarioTurma();
    }
}
