package leitordepensamentos;

import java.util.Random;
import java.util.Scanner;

public class LeitorGenio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true)
        {
            //Pedindo valor ao usuário
            System.out.println("Estou pensando em um número de 1 a 5. Tente adivinhar que valor é este ?! (ou X para sair)");
            System.out.print("Valor: ");
            String valor = scanner.nextLine();

            //Verificando se o usuário quer sair.
            if(valor.equalsIgnoreCase("X"))//Se valor for x, independente de CamelCase, faça:
            {
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("O gênio voltou para a lâmpada. Até mais !!");
                System.out.println("---------------------------------------------------------------------------------------------");
                break; //Para parar o while.
            }

            try {
                //Convertendo o valor para int
                int palpite = Integer.parseInt(valor);

                if (palpite < 1 || palpite > 5){
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.println("Número inválido! Digite entre 1 e 5.");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    continue; //Faz o programa continuar
                }

                //Número "pensado" pelo gênio
                int numeroGenio = random.nextInt(5) + 1;//Gerando um número aleatório de 1 a 5, por isso o + 1, sem isso, seria de 0 a 4.

               /* if (palpite == numeroGenio)//se o número digitado for igual ao gerado aleatoriamente, faça:
                {
                    System.out.println("Parabéns! Você acertou! \uD83C\uDF89");
                }else{
                    System.out.println("Errou! Pensei no valor " + numeroGenio + ". Tente novamente.");
                }*/

                //Forma ternária de fazer o código comentado acima
                String res = (palpite == numeroGenio) ? "Parabéns! Você acertou! \uD83C\uDF89 \uD83C\uDF89 \uD83C\uDF89 \uD83C\uDF89 \uD83C\uDF89": "Errou! Pensei no valor " + numeroGenio + ". Tente novamente.";
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println(res);
                System.out.println("---------------------------------------------------------------------------------------------");

            }catch (NumberFormatException e){//Tratamento para entradas erradas.
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Entrada inválida. Digite um número ou o X para sair.");
                System.out.println("---------------------------------------------------------------------------------------------");
            }
        }
        scanner.close();
    }
}
