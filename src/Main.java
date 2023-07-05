import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();


        banco.abrirConta(banco.getNumConta(), banco.getNome(), banco.getDepositoInicial());
        banco.alterarNome();
        banco.Sacar();
        banco.Depositar();
        banco.status();



    }
}