public class Main {
    public static void main(String[] args) {


        ClientePF davi = new ClientePF();
        davi.setNome("Davi");
        davi.setCpf("06536248325");

        Conta cc = new ContaCorrente(davi);
        Conta poupanca = new ContaPoupanca(davi);
        cc.depositar(100);
        cc.transferir(100, poupanca);



        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
