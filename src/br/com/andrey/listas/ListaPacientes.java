package br.com.andrey.listas;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ListaPacientes {

    public static void main(String[] args) {
        listaDePacientes();
    }

    private static void listaDePacientes() {
        Scanner s = new Scanner(System.in);
        System.out.println("****** Lista de Pacientes ******");
        System.out.println("Digite os nomes e o sexo dos pacientes de acordo com o exemplo (ex.: Andrey-M,Ana-F,...)" +
                ".\n" +
                "Onde M = masculino e F = feminino:");

        String nomes = s.next();
        String[] listaDeNomes = nomes.split(",");

        Map<String, Integer> pacientesM = new TreeMap<>();
        Map<String, Integer> pacientesF = new TreeMap<>();

        for (int i = 0; i < listaDeNomes.length; i++) {
            String n = listaDeNomes[i];

            if (n.contains("-M")){
                pacientesM.put(n, i);
            }else{
                pacientesF.put(n, i);
            }
        }

        System.out.println("Abaixo os homens pacientes do Dr. Mario:");
        pacientesM.keySet().stream().forEach(System.out::println);
        System.out.println("");
        System.out.println("Abaixo as mulheres pacientes do Dr. Mario:");
        pacientesF.keySet().stream().forEach(System.out::println);

    }
}
