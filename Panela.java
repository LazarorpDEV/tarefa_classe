/**
 * Representa uma panela de cozinha, com suas características
 * e ações simples de uso.
 */
public class Panela {

    String material;
    double capacidadeLitros;
    boolean tampada;

    public Panela(String material, double capacidadeLitros) {
        this.material = material;
        this.capacidadeLitros = capacidadeLitros;
        this.tampada = false;
    }

    public void tampar() {
        tampada = true;
        System.out.println("A panela foi tampada.");
    }

    public void destampar() {
        tampada = false;
        System.out.println("A panela foi destampada.");
    }

    public void mostrarInformacoes() {
        System.out.println("Material: " + material);
        System.out.println("Capacidade: " + capacidadeLitros + " litros");
        System.out.println("Tampada: " + tampada);
    }

    public static void main(String[] args) {
        Panela minhaPanela = new Panela("Inox", 5.0);

        minhaPanela.mostrarInformacoes();
        minhaPanela.tampar();
        minhaPanela.mostrarInformacoes();
        minhaPanela.destampar();
    }
}