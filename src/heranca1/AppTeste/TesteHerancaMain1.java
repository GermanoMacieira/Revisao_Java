package heranca1.AppTeste;

import heranca1.dominio.Funcionario;
import heranca1.dominio.Diretor;
import heranca1.dominio.Gerente;

public class TesteHerancaMain1 {
    public static void main(String[] args) {

        // USANDO O CONSTRUTOR GERAL:
        Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente();
        Diretor d1 = new Diretor();

        f1.setCpfDoFunc("777.888.999-49");
        f1.setNomeDoFunc("Germano");
        f1.setEnderecoDoFunc("Rua A, 10");
        f1.setTelefoneDoFunc("8888.9999");
        f1.setCargoDoFunc("Desenvolvedor");
        f1.setDepartamentoDoFunc("DTec");
        f1.setSalarioDoFunc(3000);

        g1.setCpfDoFunc("555.888.999-49");
        g1.setNomeDoFunc("Jefferson");
        g1.setEnderecoDoFunc("Rua B, 20");
        g1.setTelefoneDoFunc("8888.6666");
        g1.setCargoDoFunc("Gerente Financeiro");
        g1.setDepartamentoDoFunc("Financeiro");
        g1.setSalarioDoFunc(8000);

        d1.setCpfDoFunc("333.888.999-49");
        d1.setNomeDoFunc("Giovana");
        d1.setEnderecoDoFunc("Rua C, 30");
        d1.setTelefoneDoFunc("8888.5555");
        d1.setCargoDoFunc("Diretora");
        d1.setDepartamentoDoFunc("Gestão de Pessoas");
        d1.setSalarioDoFunc(10000);

        f1.imprime();
        g1.imprime();
        d1.imprime();
    }
}
