
package semanadezfrota;

/**
 *
 * @author Wildes Sousa
 */
public class Caminhao extends Veiculo implements Tributavel{
    private int numEixos;
    
    public Caminhao(String nome, String modelo, int anoFabricacao, int numEixos) {
        super(nome, modelo, anoFabricacao);
        this.numEixos = numEixos;
    }

    public int getNumEixos() {
        return numEixos;
    }

    @Override
    public double calcularIPVA() {
        return (200.0 * numEixos/(2023 - getAnoFabricacao()));  
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Eixos: " + getNumEixos() + "\nIPVA: " + String.format("%.2f", calcularIPVA())  +"\n";
    }
    
    
    
}
