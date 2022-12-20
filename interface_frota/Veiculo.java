
package semanadezfrota;

/**
 *
 * @author Wildes Sousa
 */
public abstract class Veiculo {
    
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Veiculo(String nome, String modelo, int anoFabricacao) {
        this.marca = nome;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno de Fabricação: " + getAnoFabricacao() + "\n";
    }
    
    
    
}



