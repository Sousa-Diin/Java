
//package edicaodojogozuul.model;


/**
 *
 * @author Wildes Sousa
 */
public class Item {
    private int durabilidade;
    private String artefato;
   

    public Item(String artefato) {
        durabilidade = definirDurabilidadeArtefato(artefato);
        this.artefato = artefato;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public String getArtefato() {
        return artefato;
    }

    private void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
    
    public void decrementaVarinha(){
        if(getDurabilidade()> 0){
            setDurabilidade(getDurabilidade()-1);
        }
    }
    
    public void decrementaItem(){
        if(getDurabilidade()> 0){
            setDurabilidade(getDurabilidade()- getDurabilidade());
        }
    }
    
    /**
     * 
     * @param umArtefado
     * @return int - define qual será a durabilidade do artefato em questao
     */
    private int definirDurabilidadeArtefato(String umArtefato){
        
         switch (umArtefato) {
            
            case "mapa":
                setDurabilidade(1);
                break;
            case "pedra":
                setDurabilidade(1);
                break;
            case "capa":
                setDurabilidade(2);
                break;
            case "vassoura":
                setDurabilidade(1);
                break;
            case "vira-tempo":
                setDurabilidade(3);
                break;
            default:
                setDurabilidade(20);/* */
                break;
        }
        return getDurabilidade();
    }  

    @Override
    public String toString() {
        return String.format("\n|%-12s | %-12d|\n", getArtefato(), getDurabilidade() );
    }    
}
