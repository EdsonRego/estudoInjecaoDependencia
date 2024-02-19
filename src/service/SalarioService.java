package service;

public class SalarioService {

    private PrevidenciaService previdenciaService;

    public void setPrevidenciaService(PrevidenciaService previdenciaService) {
        this.previdenciaService = previdenciaService;
    }

    public double salarioLiquido(double salarioBruto){
        double imposto = salarioBruto * 0.2;
        double previdencia = previdenciaService.desconto(salarioBruto);
        return salarioBruto - imposto - previdencia;
    }
}
