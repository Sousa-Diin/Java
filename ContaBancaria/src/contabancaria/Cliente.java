
package contabancaria;

public class Cliente {
    private String banco;//nome do Banco
    private String titular;//nome do correntista 
    private String tipoConta;//Corrente ou Poupança
    private int agencia;/*número da agencia*/
    private int conta;/*número da comnta */
    private char dvConta;//digito de verificação da conta
    
    //construtor Padrão
    public Cliente(){
        
    }
    
    //Contrutor c/ parametros full
    public Cliente(String banco, String titular,String tipoConta, int agencia, int conta, char dvConta){
        this.banco = banco;
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.conta = conta;
        this.dvConta = dvConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTilular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public char getDvConta() {
        return dvConta;
    }

    public void setDvConta(char dvConta) {
        this.dvConta = dvConta;
    }  
    
}
