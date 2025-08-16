package com.behnascimento;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //list - permite duplicadas
        List<String>  list = new ArrayList<>();
        list.add("be");
        list.add("fe");
        list.add("hi");
        list.add("be");

        System.out.println("List: " + list);

        //set - não permite duplicadas
        Set<String> setStrings = new HashSet<>();
        setStrings.add("hello");
        setStrings.add("be");
        setStrings.add("fe");
        setStrings.add("be");

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
    }
}
