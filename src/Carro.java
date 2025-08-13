public class Carro {
    public static void main(String[] args) {
        System.out.println("Teste");
    }
    String modelo;
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro " + this.modelo);
    }
}
