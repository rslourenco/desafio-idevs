/* 
 * Algoritmo feito para o Desafio IDevS
 * Desafio 2: Algoritmo que exibe todos os números menores que 10000 onde n e n+1
 * possuem o mesmo número de divisores
 */
package desafio02;
/*
 * @autor Rafael Lourenço
 */
public class Desafio02 {
    
    public static void main(String[] args) {
        //declaração de variáveis
        //contadoras para os loops
        int i, j;
        //contadores para comparar o número de divisores
        int nDiv1, nDiv2;
        //repetição 2 a 9999, considerando que 1 é o único número natural com 1 único divisor
        for(i = 2; i < 10000; i++){
            //inicializando o contador de divisores em 2 pois todos números naturais, além do 1, possuem pelo menos 2 divisores
            nDiv1 = 2;
            nDiv2 = 2;
            //repetição iniciando em 2 e terminando na metade de n, considerando que nenhum número acima da metade de n é divisor de n
            for(j = 2; j <= (i/2); j++){
                if(i % j == 0)
                    nDiv1++;                    
            }
            //repetição iniciando em 2 e terminando na metade de n+1, considerando que nenhum número acima da metade de n é divisor de n+1
            for(j = 2; j <= ((i+1)/2); j++){
                if((i+1) % j == 0)
                    nDiv2++;
            }
            //comparando número de divisores de n e n+1, se posivito, exibe n
            if(nDiv1 == nDiv2)
                System.out.println(i);
        }
    }
}
