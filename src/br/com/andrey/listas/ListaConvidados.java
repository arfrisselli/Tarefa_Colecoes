package br.com.andrey.listas;

import java.util.*;

public class ListaConvidados {

    public static void main(String[] args) {
        listaDeConvidados();
    }

    private static void listaDeConvidados() {
        Scanner s = new Scanner(System.in);
        System.out.println("****** Lista de Convidados ******");
        System.out.println("Digite os nomes separando-os por vírgulas (ex.: Andrey,Rodrigo,etc...):");

        String nomes = s.next();
        String[] listaDeNomes = nomes.split(",");

        Map<String, Integer> convidados = new TreeMap<>();

        for (int i = 0; i < listaDeNomes.length; i++) {
            String n = listaDeNomes[i];
            convidados.put(n, i);
        }

        System.out.println("\nSua lista contém " + listaDeNomes.length + " convidados.\n");
        System.out.println("Abaixo você pode conferir sua lista de convidados em ordem alfabética:");
        convidados.keySet().stream().forEach(System.out::println);
        System.out.println("");

    }
}
