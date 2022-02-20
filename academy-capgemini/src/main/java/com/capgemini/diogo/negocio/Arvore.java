package com.capgemini.diogo.negocio;

public class Arvore {
    /**
     * Metodo que escreve as informacoes de saida no formato de uma escada
     * @param altura Altura da escada
     */
    public String escrever(int altura) {
        String asterisco = "*";
        StringBuilder resultado = new StringBuilder();
        int espaco = altura - 1;
        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= espaco; j++) {
                resultado.append(" ");
            }
            espaco -= 1;
            resultado.append(asterisco.repeat(i));
            resultado.append("\n");
        }
        return resultado.toString();
    }
}
