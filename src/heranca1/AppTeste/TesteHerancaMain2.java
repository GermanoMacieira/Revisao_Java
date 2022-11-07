package heranca1.AppTeste;

import heranca1.dominio.Diretor;
import heranca1.dominio.Funcionario;
import heranca1.dominio.Gerente;

public class TesteHerancaMain2 {
    public static void main(String[] args) {

        // USANDO O CONSTRUTOR:
        Funcionario f1 = new Funcionario("777.888.999-49", "Germano", "Rua A, 10", "8888.9999", "Desenvolvedor", "DTec", 3000);
        Gerente g1 = new Gerente("555.888.999-49", "Jefferson", "Rua B, 20", "8888.6666", "Gerente Financeiro", "Financeiro", 8000);
        Diretor d1 = new Diretor("333.888.999-49", "Giovana", "Rua C, 30", "8888.5555", "Diretora", "Gestão de Pessoas", 10000);

        f1.imprime();
        g1.imprime();
        d1.imprime();
    }
}
