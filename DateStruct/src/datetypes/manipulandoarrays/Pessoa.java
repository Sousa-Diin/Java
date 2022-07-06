package datetypes.manipulandoarrays;
/** @author wildes */
class Pessoa {
    private String nome;
    private String profissao;
    private int idade;
    private double salario;

    
      
   // public Pessoa(){}
    
    public Pessoa(String nome, String profissao, int idade, double salario) {
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
        this.salario = salario;
    }
  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public String imprimir() {
        return "Pessoa{" + "nome=" + nome + "\n, profissao=" + profissao +
                "\n, idade=" + idade + "\n, salario=" + salario + '}';
    }
    
    
}
