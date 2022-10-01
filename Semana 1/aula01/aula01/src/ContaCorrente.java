import java.util.Date;
import java.util.List;

public class ContaCorrente {

    Integer numeroConta;
    Integer numeroAgencia;
    String nomeCliente;
    Date data;
    Double saldo;

    void sacar(Double valor) {
    }

    void transferir(Double valor, ContaCorrente destino) {
    }

    boolean cancelar(ContaCorrente conta, String justificativa) {
        return true;
    }

    Double consultarSaldo() {
        return saldo;
    }

    List consultarExtrato(Date dataInicio, Date dataFinal) {
        return null;
    }

}
