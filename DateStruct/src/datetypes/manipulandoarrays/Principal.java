package datetypes.manipulandoarrays;

/**
 *
 * @author wildes
 */
public class Principal {
    public static void main(String [] args){
        
        Dados dadosPessoa = new Dados();
        Pessoa pessoa = new Pessoa("Wildes", "FullStack",27,7908);
        Pessoa pessoa1,pessoa2,pessoa3;
        pessoa1 = new Pessoa("Joao", "Front-end",21,3507.65);
        pessoa2 = new Pessoa("Pedro", "Back-end",24,4507.95);
        pessoa3 = new Pessoa("Julia", "Desenvolvimento - Web",19,2707.35);
         
        //System.out.println(pessoa.imprimir());
                
        dadosPessoa.inseriDados(pessoa);
        dadosPessoa.inseriDados(pessoa1);
        dadosPessoa.inseriDados(pessoa2);
        dadosPessoa.inseriDados(pessoa3);
        dadosPessoa.exibeDados();
    }
}
