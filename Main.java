import java.time.LocalDateTime;
import java.util.Scanner;

public class Main{

    public static void AlgoritmoZeller(int dia , int mes , int ano){

        LocalDateTime agora = LocalDateTime.now();
        /**
         * Fazendo uma verificação básica se o mês digitado é válido, 
         * Se o dia digitado é válido e se o ano digitad é válido.
         */
        if((dia <= 31 && dia !=0) && (mes <= 12 && mes != 0) && (ano >= 1900 && ano <= agora.getYear() )){

            //Iniciando o algoritmo de Zeller.

            if(mes < 3){

                mes += 12;
                ano -= 1;
            }

            int k = ano % 100; 
            int j = ano / 100; 

            //Aplicando a fórmula do algoritmo
            int diaWeek = ((dia + (((mes + 1) * 26) / 10 ) + k + (k/4) + (j/4)) + (5*j)) % 7;

            /**
             * Verificando o resultado do algoritmo de Zeller e 
             * Imprimindo o dia da semana certo utilizando
             * Switch Case.
             */
            switch (diaWeek){
                case 0 : 
                System.out.println("Voce nasceu no SABADO  \n"); 
                break;
                case 1 : 
                System.out.println("Voce nasceu no DOMINGO \n"); 
                break;
                case 2 : 
                System.out.println("Voce nasceu na SEGUNDA \n"); 
                break;
                case 3 : 
                System.out.println("Voce nasceu na TERCA  \n"); 
                break;
                case 4 : 
                System.out.println("Voce nasceu na QUARTA \n"); 
                break;
                case 5 : 
                System.out.println("Voce nasceu na QUINTA \n"); 
                break;
                case 6 : 
                System.out.println("Voce nasceu na SEXTA  \n"); 
                break;
            }
        }
    }

    

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        try {
            System.out.println("Digite sua data de nascimento no formato (dia/mes/ano)");

            String data = leia.nextLine();

            String[] dataSeparada = data.split("/");

            int dia = Integer.parseInt(dataSeparada[0]);
            int mes = Integer.parseInt(dataSeparada[1]);
            int ano = Integer.parseInt(dataSeparada[2]);

            
            AlgoritmoZeller(dia, mes, ano);


        } catch (Exception e) {
        }

        leia.close();
    }
}