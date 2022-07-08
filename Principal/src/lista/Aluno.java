package lista;

/**
 *
 * @author wildes
 */
public class Aluno {
    
    private String nome;
    private int nota;
    private int faltas;
    private String situacao;
    
    //Construtor default

    public Aluno() {}
    
    //Contrutor com parametro

    public Aluno(String nome, int nota, int faltas) {
        this.nome = nome;
        this.nota = nota;
        this.faltas = faltas;
        situacao = verificaSituacao();
       
    }
    
    //métodos acessores

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public int getFaltas() {
        return faltas;
    }

    public String getSituacao() {
        return situacao;
    }
    
    private String verificaSituacao() {
         if(nota > 60 && faltas <= 19) return "Aprovado";return "Reprovado";
    }
    
    
    
}
