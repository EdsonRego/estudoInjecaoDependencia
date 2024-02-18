package service;

public class SalarioService {
    //Solucao RUIM Acoplada
    private PrevidenciaService previdenciaService = new PrevidenciaService();

    public double salarioLiquido(double salarioBruto){
        double imposto = salarioBruto * 0.2;
        double previdencia = previdenciaService.desconto(salarioBruto);
        return salarioBruto - imposto - previdencia;
    }
}
