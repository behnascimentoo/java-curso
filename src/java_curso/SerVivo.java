package java_curso;

public class SerVivo {
    protected int idade;

    public SerVivo(int idade) {
        this.idade = idade;
    }
    //public abstract void respirar();

    public void dormir() {
        System.out.println("dormindo...");
    }

    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Inalando e exalando CO2 e Oxigenio");
    }
}
