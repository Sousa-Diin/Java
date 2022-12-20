
package semanadezfrota;

/**
 *
 * @author Wildes Sousa
 */
public class Bicicleta extends Veiculo {
    
    private int marchas;
    
    public Bicicleta(String nome, String modelo, int anoFabricacao, int marchas) {
        super(nome, modelo, anoFabricacao);
        this.marchas = marchas;
    }

    public int getMarchas() {
        return marchas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMarchas: " + getMarchas() + "\n";
    }
    
    
    
}
