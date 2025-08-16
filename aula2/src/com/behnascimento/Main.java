package com.behnascimento;

import com.behnascimento.carro.Carro2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //list - permite duplicadas
        List<String>  list = new ArrayList<>();
        list.add("be guedes");
        list.add("fe");
        list.add("hi");
        list.add("be nascimento");
        list.add("be");

        System.out.println("List: " + list);

        //set - não permite duplicadas
        Set<String> setStrings = new HashSet<>();
        setStrings.add("hello");
        setStrings.add("be");
        setStrings.add("fe");
        setStrings.add("beh");


        System.out.println("Set: " + setStrings.contains("be"));
        //contains() verifica se tem o valor

        System.out.println("setStrings: " + setStrings);

        //map
        //precisa tipar a chave e o valor
        Map<String, String> map = new HashMap<>();
        map.put("name", "be");
        map.put("surname", "guedes");

        System.out.println(map.get("name"));

        // queue - fila
        Queue<String> queue = new LinkedList<>();
        queue.add("be");
        queue.add("fe");

        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.peek());
        System.out.println("Queue: " + queue);
        // queue.poll() - pega o PRIMEIRO valor e remove ele da fila
        // queue.peek() - pega o PRIMEIRO valor e NÃO remove ele da fila
        // queue - mostra todos os valores da fila

        // LinkdList - tem mais metodos detalhados de como acessar algo na lista
        LinkedList<String> linked = new LinkedList<>();

        // vendo records
        Carro2 sandero = new Carro2("sandero", "preto", 2020, "ABC-1234");
        System.out.println(sandero.ano());

        // STREAM API
        // realizar operações funcionais nas nossa colletions (estruturas de dados)
        // filter, map, reduce, agreçações
        // filter - filtra os elementos de uma coleção
        // map - transforma os elementos de um coleção
        //reduce - reduz os elementos de uma coleção a um único elemento
        // agregações - soma, média, contagem, etc

        //filtra a list e pega todas as be e coloca dentro de outra lista chamada bes
        Set<String> bes = list.stream().filter(nome -> nome.startsWith("be"))
                .map(String::toUpperCase)
                .map(nome -> nome.replaceAll(" ", "")).collect(Collectors.toSet());
        System.out.println("bes: " + bes);
    }
}
