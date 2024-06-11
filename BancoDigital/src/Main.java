public class Main {

    public static void main(String[] args) {

        Cliente julio = new Cliente();
        julio.setNome("Julio ");

        Cliente lizandra = new Cliente();
        lizandra.setNome("Lizandra ");

        Cliente jasmim = new Cliente();
        jasmim.setNome("Jasmim");

        Conta cc = new ContaCorrente(julio);
        Conta poupanca = new ContaPoupanca(julio);

        Conta ccLizandra = new ContaCorrente(lizandra);
        Conta poupancaLizandra = new ContaPoupanca(lizandra);

        Conta ccJasmim = new ContaCorrente(jasmim);
        Conta poupancaJasmim = new ContaPoupanca(jasmim);

        cc.depositar(50);
        poupanca.depositar(60);

        ccLizandra.depositar(70);
        poupancaLizandra.depositar(80);

        ccJasmim.depositar(90);
        poupancaJasmim.depositar(100);

        Banco banco = new Banco();
        banco.getContas().add(cc);
        banco.getContas().add(poupanca);
        banco.getContas().add(ccLizandra);
        banco.getContas().add(poupancaLizandra);
        banco.getContas().add(ccJasmim);
        banco.getContas().add(poupancaJasmim);

        banco.exibirContas();
    }
}