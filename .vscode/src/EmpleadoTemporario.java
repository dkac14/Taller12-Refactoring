public class EmpleadoTemporario extends Empleado {
    private String genero;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.genero = genero;
        this.mesesContrato = mesesContrato;
    }


    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Meses de contrato: " + mesesContrato);
        System.out.println("Género: " + genero);
    }

    // Más metodos
}
