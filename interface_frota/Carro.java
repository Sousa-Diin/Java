
package semanadezfrota;

/**
 *
 * @author Wildes Sousa
 */
public class Carro extends Veiculo implements Tributavel {
    
    private String categoria;


    Carro(String nome, String modelo, int anoFabricacao, String categoria) {
       super (nome, modelo, anoFabricacao); 
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double calcularIPVA() {
        if (getCategoria().equals("passeio"))
            return (1500.0/(2023- getAnoFabricacao())); 
        return (1000.0/(2023 - getAnoFabricacao()));
    }

    @Override
    public String toString() {
        return super.toString() + "Categoria: " + getCategoria() + "\nIPVA: " + String.format("%.2f", calcularIPVA())  +"\n";
    }
    
    
    
    
    
}
