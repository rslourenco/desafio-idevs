/* 
 * Algoritmo feito para o Desafio IDevS
 * Desafio 1: Dado uma palavra p, calcular a pontuação de acordo com cada letra
 * 
 * A - E - I - O - U - L - N - R - S - T = 1 ponto
 * D - G = 2 pontos
 * B - C - M - P = 3 pontos
 * F - H - V - W - Y = 4 pontos
 * K = 5 pontos
 * J - X = 8 pontos
 * Q - Z = 10 pontos
 */
package desafio01;
/*
 * @autor Rafael Lourenço
 */
import java.util.Scanner;
public class Desafio01 {

    public static void main(String[] args) {
        //criação do objeto scanner para leitura
        Scanner entrada = new Scanner(System.in);
        //declaração das variáveis
        //vetor de caracteres para separar a palavra
        char[] letras = null;
        //contadora para o loop
        int i;
        //variável para somatório da pontuação
        int pontuacao = 0;
        //Leitura da string informada pelo usuário
        System.out.println("Digite uma palavra");        
        String p = entrada.next();
        //converter todas as letras em maiúsculas para ficar mais fácil testar as letras
        p = p.toUpperCase();
        //divisão da string em um vetor de caracteres
        letras = p.toCharArray();
        //repetição que compara cada posição do vetor com uma letra para definir os pontos
        for (i = 0; i < letras.length; i++){
            if(letras[i] == 'A' || letras[i] == 'E' || letras[i] == 'I' || letras[i] == 'O' || letras[i] == 'U' ||
               letras[i] == 'L' || letras[i] == 'N' || letras[i] == 'R' || letras[i] == 'S' || letras[i] == 'T'){
                pontuacao++;
            }
            if(letras[i] == 'D' || letras[i] == 'G'){
                pontuacao = pontuacao + 2;
            }
            if(letras[i] == 'B' || letras[i] == 'C' || letras[i] == 'M' || letras[i] == 'P'){
                pontuacao = pontuacao + 3;
            }            
            if(letras[i] == 'F' || letras[i] == 'H' || letras[i] == 'V' || letras[i] == 'W'|| letras[i] == 'Y'){
                pontuacao = pontuacao + 4;
            }
            if(letras[i] == 'K'){
                pontuacao = pontuacao + 5;
            }
            if(letras[i] == 'J' || letras[i] == 'X'){
                pontuacao = pontuacao + 8;
            }
            if(letras[i] == 'Q' || letras[i] == 'Z'){
                pontuacao = pontuacao + 10;
            }
        }
        //exibição da pontuação final
        System.out.println("Pontuação: " + pontuacao);
    }
    
}
