public class DepartamentoSistemas extends Departamento {
@Override
public double getSalarioTotal(double salarioBase) {
return salarioBase + 20;
}

@Override
    public double getBono() {
        return 20;
    }
}