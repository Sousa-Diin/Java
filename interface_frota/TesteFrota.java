
package semanadezfrota;

/**
 *
 * @author Wildes Sousa
 */
public class TesteFrota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frota frota = new Frota();
        Carro carro1 = new Carro("Ford","Focus",2015,"passeio");
        frota.inserirVeiculo(carro1);
        Carro carro2 = new Carro("VW","Gol",2014,"utilitario");
        frota.inserirVeiculo(carro2);
        Caminhao cam1 = new Caminhao("Iveco","Daily",2014,2);
        frota.inserirVeiculo(cam1);
        Bicicleta bic1 = new Bicicleta("Sense","Impulse",2017,8);
        frota.inserirVeiculo(bic1);
        frota.gerarRelatorio();
    }
    
}
