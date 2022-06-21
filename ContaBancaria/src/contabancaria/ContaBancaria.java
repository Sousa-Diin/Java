
package contabancaria;

import java.util.ArrayList;
public class ContaBancaria {

    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList();
        
        Cliente cliente = new Cliente("Itau","wildes","poupanca",1473, 0743,'3');
        Cliente cliente1 = new Cliente("Caixa","Dinho","corrente",129, 0743,'0');
        
        clientes.add(cliente);
        clientes.add(cliente1);
        
        int qtd = 0;
        
        for(Cliente c: clientes){
            System.out.println(c.getBanco() + "-" + c.getTilular());
            qtd = clientes.size();
        }
        
        System.out.println(qtd);
    }

    
}
