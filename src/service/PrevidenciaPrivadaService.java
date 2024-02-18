package service;

public class PrevidenciaPrivadaService extends PrevidenciaService {
    public double desconto(double salarioBruto) {
        return salarioBruto * 0.01;
    }
}
