public class Operadores {
    
    public static void main (String [] args ){
        
        double soma = 100 + 50;
        System.out.println("soma = " + soma);
        int subtração = 100 - 50;
        System.out.println("subtração = " + subtração);
        int multiplicação = 100 * 50;
        System.out.println("multiplicação = " + multiplicação);
        double divisão = 100.0 / 50.0;
        System.out.println("divisão = "+ divisão);
        int modulo = 100 % 50;
        System.out.println("modulo = " + modulo);


        int numero = 5;
        
        numero = -5;
        System.out.println(numero);

        numero = numero * -1; //assim eu torno o número positivo novamente
        System.out.println(numero);



        int number = 6;
        
        number--; //-- para decrementar o valor, diminuir em 1 o valor.
        number++; // ++ para incrementar o valor, aumentar em 1 o valor.

        System.out.println(++number); //nesse caso utiliza o valor de incrimento antes de usar o número para a operação,
        // lembrando de tirar o number ++ para que a ação não aumente mais.

        System.out.println(number); //aqui eu estou pegando a operação lá em cima  o number ++ para fazer essa operção sem utilizar o ++ nos paramentos do println.

        boolean variavel = true;

        variavel = !variavel; // o ! é o simbolo de negação, ele torna a variavel um false.
        
        System.out.println(variavel);

        int a, b;
        a = 5;
        b = 6;

        String resposta = a==b ? "true" : "false" ; // operador ? e : serve igual um if e else,
        // se a condição for verdadeira ele retorna o primeiro valor, se for falsa ele retorna o segundo valor,
        // o ? se a for igual a b, true ou 1, o : senão false ou 2.
        // posso usar tanto string quanto um inteiro.

        System.out.println(resposta);

        int respostaDois = a==b ? 1 : 2 ;

        System.out.println(respostaDois);

       System.out.println("");

        int numeroUm = 1;
        int numeroDois = 2;

        boolean  simNao = numeroUm == numeroDois;

        System.out.println(simNao);

        if ( numeroUm > numeroDois) {
        
        System.out.println(" numero é verdadeiro"); // sinal de < menor e > maior.
        }
        else {
            System.out.println("é false");
        } 

        simNao = numeroUm != numeroDois;
        System.out.println("diferente");
        
        
        System.out.println("");

        //operadores logicos

        boolean condicaoUm = true;
        boolean condicaoDois = false;

        if(condicaoUm && condicaoDois){ // o operador && ele faz uma comparação entre as variaveis, se as duas forem verdadeiras,
            // ele da true, se uma for diferente ele retorna false, pois para da certo as duas deve ser iguais 
            System.out.println("É igual as duas");

        }
        else{
            System.out.println("Falsa");
        }

        if (condicaoUm || condicaoDois){ // o operador logico || ele verifica se uma das condições são verdadeiras, se uma delas for verdadeira,
            //ele já considera true, quando as duas for false, ele considera falso, se tem uma verdeira e outra falsa, ainda continua verdadeira.
            System.out.println("Está correto");
        }
        else{
            System.out.println("não está certo");
        }

    }
}
