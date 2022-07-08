package lista;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author wildes
 */
public class Diario {
    
    private String codigo;
    private ArrayList<Aluno> colecao;
    
    //Construtor default

    public Diario() {
        colecao = new ArrayList<>();
    }
    
    //construtor com parametros

    public Diario(String codigo) {
        this.codigo = codigo;
        colecao = new ArrayList<>();
    }
    
    //
    public void adicionarAluno(Aluno a){
        colecao.add(a);
    }
    
    Comparator<Aluno> condicao = new Comparator<>(){
        @Override
        public int compare(Aluno a1, Aluno a2) {
            return a1.getNome().compareTo(a2.getNome());
                 
        }
    
    };
    
    public void gerarDiarioTurma(){
        
        colecao.sort(condicao);//Ordena a colecao de alunos
        
        System.out.println("\nDisciplina: " + codigo );
        System.out.printf("%-10s%-8s%-9s%-10s\n\n","Nomes","Notas","Faltas","Situacao");
        
        //Laco p/ percorrer colecao
        for(Aluno a : colecao){
            System.out.printf("%-10s%-8d%-9d%-10s\n",a.getNome(), a.getNota(), a.getFaltas(), a.getSituacao());
        }
    }
    
    
}
