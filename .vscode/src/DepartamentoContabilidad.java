public class DepartamentoContabilidad extends Departamento {
@Override
public double getSalarioTotal(double salarioBase) {
return salarioBase + 10;
}
@Override
    public double getBono() {
        return 10;
    }
}