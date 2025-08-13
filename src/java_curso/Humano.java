package java_curso;

public class Humano extends SerVivo {
    public String nome;
    public Humano() {
        super(42);
        this.nome = "be";
    }

    public void respirar() {
        System.out.println("Inalando e exalando CO2 e Oxigenio");
    }
}
