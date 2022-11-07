package heranca.model;

public class Funcionario {

    // ATRIBUTOS:
    private String cpfDoFunc;
    private String nomeDoFunc;
    private String enderecoDoFunc;
    private String telefoneDoFunc;
    private String cargoDoFunc;
    private String departamentoDoFunc;
    private double salarioDoFunc;

    // CONSTRUTORES:
    public Funcionario(String cpfDoFunc, String nomeDoFunc, String enderecoDoFunc, String telefoneDoFunc, String cargoDoFunc, String departamentoDoFunc, double salarioDoFunc) {
        this.cpfDoFunc = cpfDoFunc;
        this.nomeDoFunc = nomeDoFunc;
        this.enderecoDoFunc = enderecoDoFunc;
        this.telefoneDoFunc = telefoneDoFunc;
        this.cargoDoFunc = cargoDoFunc;
        this.departamentoDoFunc = departamentoDoFunc;
        this.salarioDoFunc = salarioDoFunc;
    }

    public Funcionario() {
    }

    // MÉTODOS:
    public void imprime() {
        System.out.println("-------------------------------------------");
        System.out.println("CPF: " + this.cpfDoFunc);
        System.out.println("Nome: " + this.nomeDoFunc);
        System.out.println("Endereço: " + this.enderecoDoFunc);
        System.out.println("Telefone: " + this.telefoneDoFunc);
        System.out.println("Cargo: " + this.cargoDoFunc);
        System.out.println("Departamento: " + this.departamentoDoFunc);
        System.out.println("Salário: " + this.salarioDoFunc);
    }

    // SETTERS-GETTERS:

    public String getCpfDoFunc() {
        return cpfDoFunc;
    }

    public void setCpfDoFunc(String cpfDoFunc) {
        this.cpfDoFunc = cpfDoFunc;
    }

    public String getNomeDoFunc() {
        return nomeDoFunc;
    }

    public void setNomeDoFunc(String nomeDoFunc) {
        this.nomeDoFunc = nomeDoFunc;
    }

    public String getEnderecoDoFunc() {
        return enderecoDoFunc;
    }

    public void setEnderecoDoFunc(String enderecoDoFunc) {
        this.enderecoDoFunc = enderecoDoFunc;
    }

    public String getTelefoneDoFunc() {
        return telefoneDoFunc;
    }

    public void setTelefoneDoFunc(String telefoneDoFunc) {
        this.telefoneDoFunc = telefoneDoFunc;
    }

    public String getCargoDoFunc() {
        return cargoDoFunc;
    }

    public void setCargoDoFunc(String cargoDoFunc) {
        this.cargoDoFunc = cargoDoFunc;
    }

    public String getDepartamentoDoFunc() {
        return departamentoDoFunc;
    }

    public void setDepartamentoDoFunc(String departamentoDoFunc) {
        this.departamentoDoFunc = departamentoDoFunc;
    }

    public double getSalarioDoFunc() {
        return salarioDoFunc;
    }

    public void setSalarioDoFunc(double salarioDoFunc) {
        this.salarioDoFunc = salarioDoFunc;
    }
}
