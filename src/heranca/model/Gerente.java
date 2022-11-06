package heranca.model;

public class Gerente extends Funcionario{
    // ATRIBUTOS: Todos os atributos serão herdados da classe mãe!
    // CONSTRUTORES: ATENÇÃO: Construtores NÃO são herdados, temos que reescrevê-lo baseado na classe mãe!
    public Gerente(String cpfDoFunc, String nomeDoFunc, String enderecoDoFunc, String telefoneDoFunc, String cargoDoFunc, String departamentoDoFunc, double salarioDoFunc) {
        super(cpfDoFunc, nomeDoFunc, enderecoDoFunc, telefoneDoFunc, cargoDoFunc, departamentoDoFunc, salarioDoFunc);
    }

    public Gerente() {
    }

    // MÉTODOS:
    @Override
    public void imprime() {     // Sobrescrendo o método imprime() da superclasse.
        super.imprime();        // Chamando o método imprime() da classe "Mãe".
    }

    // GETTERS-SETTERS:
}
