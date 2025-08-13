package java_curso;

// public, private, protected, default
public class Carro {
    public static void main(String[] args) {
        System.out.println("Teste");
    }
    String modelo;
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    protected void acelerar() {
        System.out.println("Acelerando o carro " + this.modelo);
    }

    class Rodas {
        public Rodas() {
            Carro carro = new Carro("Celta");
            carro.acelerar();
        }
    }
}
