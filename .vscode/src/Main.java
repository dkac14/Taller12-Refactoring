public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Departamento depSistemas = new DepartamentoSistemas();
        Departamento depContabilidad = new DepartamentoContabilidad();
        Departamento depMedico = new Departamento() {
            @Override
            public double getSalarioTotal(double salarioBase) {
                return salarioBase + 15;
            }

            @Override
            public double getBono() {
                return 15;
            }
        };

        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Dario Laborde", 45, 15, depSistemas, "Masculino");
        EmpleadoFijo emp2 = new EmpleadoFijo("Jorge Gaibor", 700, 45, depContabilidad, 40, "Masculino");
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas", 200, 20, depMedico, 6, "Masculino");

        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        empresa.contratarEmpleado(emp3);

        emp1.imprimirDetalles();
        emp2.imprimirDetalles();
        emp3.imprimirDetalles();
    }
}
