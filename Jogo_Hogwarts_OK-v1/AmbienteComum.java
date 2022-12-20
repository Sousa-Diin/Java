
//package edicaodojogozuul.model;

import java.util.Random;


/**
 *
 * @author devsousa
 */
public class AmbienteComum extends Ambiente {
    private int inimigos;
    private boolean varinha;
    /*private Item item;*/
    Random sorteia = new Random();

    public AmbienteComum(String descricao, String id,boolean sorteio) {
        super(descricao, id);
        criarInimigos();
        varinha = sorteio;
        /*item = new Item(sortearItem());*/
        
    }
    
    private void criarInimigos(){
        
        inimigos = sorteia.nextInt(4);
    }

    public  int getInimigos() {
        return inimigos;
    }

    public boolean getVarinha() {
        return varinha;
    }  
    
    private void setVarinha(){
        varinha = false;
    }
    
    public boolean deixarVarinha(){
        setVarinha();
        return getVarinha();
    }
    
   
    @Override
    public String toString() {
        String resp =  (getVarinha()) ? "sim" : "não";
        return String.format("******STATUS DO AMBIENTE******\n\n%-6s | %d\n%-21s | %s\n","Quatidade de inimigos", getInimigos(), "Contém varinha", resp);
    }

    
}
