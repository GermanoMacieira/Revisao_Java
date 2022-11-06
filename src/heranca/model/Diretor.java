package heranca.model;

public class Diretor extends Funcionario{
    // ATRIBUTOS: Todos os atributos serão herdados da classe mãe!
    // CONSTRUTORES: ATENÇÃO: Construtores NÃO são herdados, temos que reescrevê-lo baseado na classe mãe!
    public Diretor(String cpfDoFunc, String nomeDoFunc, String enderecoDoFunc, String telefoneDoFunc, String cargoDoFunc, String departamentoDoFunc, double salarioDoFunc) {
        super(cpfDoFunc, nomeDoFunc, enderecoDoFunc, telefoneDoFunc, cargoDoFunc, departamentoDoFunc, salarioDoFunc);
    }

    public Diretor() {
    }

    // MÉTODOS:
    @Override
    public void imprime() {
        super.imprime();
    }

    // GETTERS-SETTERS:

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}
