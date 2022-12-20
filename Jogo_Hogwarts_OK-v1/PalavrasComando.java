
//package edicaodojogozuul.model;

/**
 * Esta classe eh parte da aplicacao "World of Zuul".
 * "World of Zuul" eh um jogo de aventura muito simples, baseado em texto.  
 * 
 * Essa classe guarda uma enumeracao de todos os comandos conhecidos do
 * jogo. Ela eh usada no reconhecimento de comandos como eles sao digitados.
 *
 * @version 2011.07.31 (2016.02.01)
 *
 * @author  Wildes Sousa
 * @version 2022.08.01 - versão modificada
 */

public class PalavrasComando
{
    // um vetor constante que guarda todas as palavras de comandos validas
    private static final String[] comandosValidos = {
        "ir", "sair", "ajuda", "observar", "pegar", "usar", "mochila"
    };

    /**
     * Construtor - inicializa as palavras de comando.
     */
    protected String PalavrasComando()
    {
        String comandos = "";
        for(String cmd : comandosValidos){
            comandos += cmd + " ";
        }
        return comandos;
    }

    /**
     * Verifica se uma dada String eh uma palavra de comando valida. 
     * @return true se a string dada eh um comando valido,
     * false se nao eh.
     */
    protected boolean ehComando(String umaString)
    {
        for(int i = 0; i < comandosValidos.length; i++) {
            if(comandosValidos[i].equals(umaString))
                return true;
        }
        // se chegamos aqui, a string nao foi encontrada nos comandos.
        return false;
    }
}
