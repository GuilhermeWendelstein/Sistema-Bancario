public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("001", "Ana", "CC");

        c1.abrirConta();
        c1.depositar(100);
        c1.sacar(30);
        c1.pagarMensal();

        System.out.println("Dono: " + c1.getDono());
        System.out.println("Saldo: R$" + c1.getSaldo());
        System.out.println("Status: " + (c1.isStatus() ? "Aberta" : "Fechada"));

        c1.fecharConta();
    }
}
