package ExerciciosPropostos02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostos02 {
    public static void main(String[] args) {
    List<String> respostas = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("perguntas: ");
    System.out.println("Responda com s para sim, n para não: ")
    System.out.print("\nTelefonou para a vitima? ");
    String resposta = scanner.next();
    respostas.add(resposta.toLowerCase());
    System.out.print("\nEsteve no local do crime? ");
    resposta = scanner.next();
    respostas.add(resposta.toLowerCase());
    System.out.print("\nMora perto da vitima? ");
    resposta = scanner.next();
    respostas.add(resposta.toLowerCase());
    System.out.print("\nDevia para a vitima? ");
    resposta = scanner.next();
    respostas.add(resposta.toLowerCase());
    System.out.print("\nJá trabalhou para a vitima? ");
    resposta = scanner.next();
    respostas.add(resposta.toLowerCase());

    System.out.println(respostas);

    int count = 0;
    Iterator<String> contador = respostas.iterator();
    while(contador.hasNext())

    {
        String resp = contador.next();
        if (resp.contains("s")) {
            count++;
        }
    }

    switch(count) {
        case 2:
            System.out.println(">> SUSPEITA <<");
            break;
        case 3:
        case 4:
            System.out.println(">> CÚMPLICE <<");
            break;
        case 5:
            System.out.println(">> ASSASSINA <<");
            break;
        default:
            System.out.println(">> INOCENTE <<");
            break;
    }
  }

}
