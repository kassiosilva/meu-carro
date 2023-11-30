public class Carro {
    private final String marca;
    private final String modelo;
    private final int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirCarroInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    public void rodar(int quilometragem) {
        if (quilometragem < 0) {
            return;
        }

        this.quilometragem += quilometragem;
    }

    public int getQuilometragem() {
        return quilometragem;
    }
}
