public class Main {
    public static void main(String[] args) {
        byte b = 100;
        boolean bool = false;
        String str = "Be";

        int[] colecaoDeInteiros= {1, 2, 3, 4, 5, 6666}; //cria um vetor ja com os valores declarados
        int[] meusNumeros = new int[5]; //cria um vetor saber os valores de dentro, apenas com o tamanho


        if (str.isBlank()) {
            System.out.println("True");
        } else if (str == "Be"){
            System.out.println("Be");
        } else {
            System.out.println("False");
        }

        System.out.println(colecaoDeInteiros.length);
    }

}
