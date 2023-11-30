public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando novo Carro ---");
        Carro meuCarro = new Carro("Toyota", "Corolla", 2023);

        meuCarro.ligar();

        meuCarro.rodar(100);
        meuCarro.rodar(-100);
        meuCarro.rodar(50);
        meuCarro.rodar(73);
        meuCarro.rodar(122);
        meuCarro.rodar(-3);

        System.out.println("Quilometragem: " + meuCarro.getQuilometragem());

    }
}
