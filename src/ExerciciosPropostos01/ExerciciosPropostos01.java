package ExerciciosPropostos01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostos01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas =  new ArrayList<Double>();


        //armazenando objetos na lista
        int count = 0;
        while(true) {
            if (count==6) break;

            System.out.println("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("---------------");

        //exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        //calculando e exbindo a média das temperaturas:
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);


        //exibindo as temperaturas acima da média
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%1f ", t));



        //exibindo o mês das temperaturas acima da média por extenso
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator =temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                   case (0):
                       System.out.printf("1- Janeiro: %.1f\n ", temp);
                       break;
                   case (1):
                       System.out.printf("2- Fevereiro: %.1f\n ", temp);
                       break;
                   case (2):
                       System.out.printf("3- Março: %.1f\n ", temp);
                       break;
                   case (3):
                       System.out.printf("4- Abril: %.1f\n ", temp);
                       break;
                   case (4):
                       System.out.printf("5- maio: %.1f\n ", temp);
                       break;
                   case (5):
                       System.out.printf("6- Junho: %.1f\n ", temp);
                       break;
                   default:
                       System.out.printf("Não houve tempraturaacima da média");
            }
        }
        count++;
    }
  }

}
