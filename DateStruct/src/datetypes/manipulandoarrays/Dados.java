package datetypes.manipulandoarrays;

import java.util.ArrayList;

/** @author wildes */
public class Dados {
    
    ArrayList<Pessoa> dados = new ArrayList();
    
    public void inseriDados(Pessoa pessoa){
        dados.add(pessoa);
    }
    
    public void exibeDados(){
        for(int i = 0;i < dados.size();i++){
            System.out.println("Nome: " + dados.get(i).getNome());
            System.out.println("Profissão: " + dados.get(i).getProfissao());
            System.out.println("Idade: " + dados.get(i).getIdade());
            System.out.printf("Salario: R$%.2f\n\n" , dados.get(i).getSalario());
            
        }
    }
}
