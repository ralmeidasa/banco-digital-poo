import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente("Venilton");
        Gerente gerente1RJ = new Gerente("João Victor");
        List<Conta> contas = new ArrayList<>();

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("");
        System.out.println("Gerente: " + gerente1RJ.getNome() + "\n");

        gerente1RJ.setContas(contas);
        contas.add(cc);
        contas.add(poupanca);
        System.out.println("=== Número das Contas ===");
        System.out.println("-Corrente: " + contas.get(0).numero);
        System.out.println("-Poupança: " + contas.get(1).numero);
    }

}