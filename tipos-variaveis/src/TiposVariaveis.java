
import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        double slarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting.

            int numero = 5;
             numero = 10;

            System.out.println(numero);

            final double VALOR_DE_PI = 3.14; //final, garante que o valor nao sera mudado, e por convenção, é em caixa alta.

            // classes Operadores.java
            String nome= "CARLOS";
            int  idade= 22;
            double peso = 68.5;
            char sexo = 'M';
            boolean doadorOrgao = false;
            Date dataNascimento = new Date();

            double soma = 10.5 + 15.7;
            int subtração = 113 - 25;
            int multplicação = 15 * 7;
            int divisão = 15/3;
            int modulo = 18 % 3; // resto da divisão
            double resultado = (10 *7) + (20/4);


            String nomeCompleto = "LINGUAGEM" + "JAVA";;

            System.out.println(nomeCompleto);

            int numero1 = 5; 
            numero1 = - numero1; // tornar valor negativo

            System.out.println(numero1);

            numero1 =  numero1 * -1;  // tornar valor positivo

            System.out.println(numero1);

        // incremento de valor
        //repetição

        int numero2 = 5;
      //numero2 = numero2 + 2;
      //numero2 ++; valor + atribui a soma +1, imprime e depois soma.
      //++numero2, atribui a soma +1 + valor, soma e depois imprime.
        System.out.println(numero2++);
        // incremento ++ , decremento --
        System.out.println(numero2--);
        
        //operador booleano
         boolean variavel = true;
         System.out.println(!variavel);// guadado na memoria

        variavel = !variavel;
        System.out.println(variavel);

        // Operador Ternário

        int a, b;

        a = 5;
        b = 6;

        // String resultado2 = "";
        // if(a==b)
        //     resultado2 = "verdadeiro";
        //     else
        //     resultado2 = "false";
        //     System.out.println(resultado2);

        String resultado2 = a==b? "verdadeiro" : "falso"; // não se limita a true ou false.
        System.out.println(resultado2);

            //operadores relacionais

            int numero3= 1;
            int numero4 = 2;

            boolean simNao = numero3 != numero4; // pode ser >, ==, !=, <, =>, <=.
            if(numero3 == numero4){
                System.out.println("o numero é igual ?");
            }

        System.out.println(" NumeroTres é igual a numeroQuatro? " +simNao);
            String nomeUm = "Carlos";
            String nomeDois = new String ("Antonio");
            System.out.println(nomeUm.equals(nomeDois));

            //Operadores lógicos

           // && operador "E", || operador "OU"

           boolean condicao1=true;
           boolean condicao2=false;

           if(condicao1 && condicao2){
            System.out.println("As duas codições são verdadeiras");
           }
           
           System.out.println("fim");



            


    }
}
