package arrays;

public class EmpresaFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Silva");
        Funcionario funcionario2 = new Funcionario("Gianinni");
        Empresa empresa = new Empresa("Casas bahia");

        funcionario.setEmpresa(empresa);
        funcionario2.setEmpresa(empresa);

        Funcionario[] funcionarios = {funcionario,funcionario2};
        empresa.setFuncionarios(funcionarios);

        System.out.println();
        System.out.println("--------------Funcionario-----------");
        funcionario.imprime();
        System.out.println("--------------Empresa-----------");
        empresa.imprime();

    }
}
