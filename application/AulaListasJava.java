package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AulaListasJava
{
    public static void main (String[] args)
    {
        List<String> lista = new ArrayList<>();

        lista.add("Sergio");
        lista.add("Adriana");
        lista.add("Nicolas");
        lista.add("Rebeca");
        lista.add("Ravioli");
        lista.add("Nuvem");
        lista.add("Sabado");
        lista.add(3, "Amor");  // inserir na lista no local determinado

        System.out.println("Tamanho da lista : " + lista.size() + " elementos"); // para saber o tamanho da lista

        //lista.remove("Sergio"); // para remover item da lista
       // lista.remove(1); // para remover item da lista

        for (String objeto : lista)
        {
            System.out.println(objeto);
        }
        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();

        lista.removeIf(objeto -> objeto.charAt(0) == 'A');

        System.out.println("Tamanho da lista : " + lista.size() + " elementos"); // para saber o tamanho da lista

        for (String objeto : lista)
        {
            System.out.println(objeto);
        }
        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();

        System.out.println("Index of Rebeca " + lista.indexOf("Rebeca"));
        System.out.println("Index of Filho " + lista.indexOf("Filho"));

        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();

        //Filtra a lista com respectivo caracter
        List<String> filtro = lista.stream().filter(objeto -> objeto.charAt(0) == 'S').collect(Collectors.toList());

        for (String objeto : filtro)
        {
            System.out.println(objeto);
        }

        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();

        //Encontra na lista com respectivo caracter (primeiro na lista)
        String name = lista.stream().filter(objeto -> objeto.charAt(0) == 'S').findFirst().orElse(null);
        System.out.println(name);

    }
}
