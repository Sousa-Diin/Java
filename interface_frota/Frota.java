
package semanadezfrota;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wildes Sousa
 */
public class Frota {
    
    private List<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }
    
    public void inserirVeiculo(Veiculo v){
        veiculos.add(v);
    }
    
    public void gerarRelatorio(){
        for(Veiculo v: veiculos){
            System.out.println(v);
            System.out.println("-----------------");
        }
    }
    
    
    
}
