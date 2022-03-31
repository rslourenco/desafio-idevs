/* 
 * Algoritmo feito para o Desafio IDevS
 * Desafio 3: Algoritmo que exibe o maior número primo abaixo de n e que seja
 * obtido pela soma consecutiva de números primos
 * ex: n = 100
 *     resultado = 41
 *     41 = 2 + 3 + 5 + 7 + 11 + 13
 */
package desafio03;
/*
 * @autor Rafael Lourenço
 */
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        //criação do objeto scanner para leitura
        Scanner entrada = new Scanner(System.in);
        //declaração de variáveis
        //contadora para o loop
        int i; 
        //número n informado pelo usuário
        int n;
        //somatório dos números primos
        int soma = 0; 
        //resultado final
        int result = 0;
        //Leitura do número informado pelo usuário
        System.out.println("Digite um número");
        n = entrada.nextInt();
        /*repetição iniciando em 2 e terminando quando o somatório for igual
         *ou for maior que o próprio n */
        for(i = 2; soma < n; i++){
            /*testando cada valor para saber se é primo ou não
             *através da chamada do método primo*/
            if(primo(i) == true){
                //caso positivo o valor é somado
                soma = soma + i;
                /*novamente uma chamada do método primo mas usando a soma como parâmetro,
                 *se a soma for também um número primo e for menor que o número informado
                 *é salvo esse valor como resultado final*/
                if(primo(soma) == true && soma < n)
                    result = soma;
            }                
        }
        //exibição do resultado final
        System.out.println("Resultado = "+result);
    }
    //método para calcular se o número é primo
    public static boolean primo(int i){
        //declaração de variáveis
        //contadora do loop
        int j;
        //contador de divisores
        int div;
        //variável booleana para retornar se o número é primo ou não
        boolean primo;
        //inicializando div com 2 pois todos números a partir de 2 tem ao menos 2 divisores
        div = 2;
        //loop de 2 até metade de n para calcular quantos divisores n possui
        for(j = 2; j<=(i/2); j++)
            if(i % j == 0)
                div++;
        //teste para retornar se o número é primo ou não
        //caso verdadeiro
        if(div == 2)
            primo = true;
        //caso falso
        else
            primo = false;        
        return primo;
    }
}
