package java_curso;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tipos primitivos e variaveis
        byte b = 100;
        boolean bool = false;
        String str = "Be";

        //Condicionais
        if (str.isBlank()) {
            System.out.println("True");
        } else if (str == "Be"){
            System.out.println("Be");
        } else {
            System.out.println("False");
        }

        // Vetores
        int[] colecaoDeInteiros= {1, 2, 3, 4, 5, 6666}; //cria um vetor ja com os valores declarados
        int[] meusNumeros = new int[5]; //cria um vetor saber os valores de dentro, apenas com o tamanho
        System.out.println(colecaoDeInteiros.length);

        //Arrays List
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("be"); //pode ir add coisas na lista, não tem limite nem minimo
        nomes.add("leo");
        nomes.add("lua");
        nomes.add("madu");

        System.out.println(nomes.get(0)); //nomes.get(indice) o .get pega o valor da list pelo indice
        System.out.println(nomes.size());
        nomes.remove(0);
        nomes.remove("leo");
        System.out.println(nomes.get(0));

        //Loops (for and while)
        for(int meuInterador = 0; meuInterador < nomes.size(); meuInterador++){
            System.out.println(nomes.get(meuInterador));
        }

        for (String nome : nomes){
            System.out.println(nome);
        }

        int contador = 0;
        while (contador < 10) {
            System.out.println("Estou no while");
            contador++;
        }

        // Castings (mudança de tipos)
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String minhaString = "10";
        int meuInt2 = Integer.parseInt(minhaString);

        String meuString = String.valueOf(meuInt2);

        // Classes, Objetos, Metodos Construtores
        Carro meuCarro = new Carro("Sandero");
        Carro meuCarro2 = new Carro("BMW");

        meuCarro.acelerar();
        meuCarro2.acelerar();
    }
}
