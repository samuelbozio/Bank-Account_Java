import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Banco {
    Scanner sc = new Scanner(System.in);
    private int numConta;
    private String nome;
    private double depositoInicial;
    private char resposta;
    private double saldo;
    private double deposito;
    private double saque;



    public void abrirConta(int numConta, String nome, double DepositoInicial) {
        System.out.println("Enter account number: ");
        setNumConta(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter account holder: ");
        setNome(sc.nextLine());
        System.out.println("Is there initial deposit? (y/n) ");
        resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.println("Enter initial deposit value: ");
            setDepositoInicial(sc.nextDouble());
            setSaldo(getDepositoInicial());
            status();
        } else {
            status();
        }
    }


    public void alterarNome() {
        sc.nextLine();
        System.out.println("Nome atual: " + getNome());
        System.out.println("Para qual nome deseja alterar? ");
        setNome(sc.nextLine());
        status();
    }

    public void Depositar() {
        System.out.println(" " +"Quanto deseja depositar? ");
        setDeposito(sc.nextDouble());
        setSaldo(saldo + deposito);
        System.out.printf("Saldo atual: " + getSaldo());
    }

    public void Sacar() {
        System.out.println("Quanto deseja retirar? ");
        setSaque(sc.nextDouble());
        setSaldo(getSaldo() - getSaque());
        System.out.printf("Saque de %.2f realizado com sucesso. Saldo atual: %.2f", getSaque(), getSaldo());
    }

    public void status() {
        System.out.println("Account Data ");
        System.out.println("Name: " + getNome());
        System.out.println("Account Number: " + getNumConta());
        System.out.printf("Balance: %.2f ", getSaldo());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }
}
