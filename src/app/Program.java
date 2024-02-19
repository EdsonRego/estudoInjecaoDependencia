package app;

import service.PrevidenciaPrivadaService;
import service.PrevidenciaService;
import service.SalarioService;

public class Program {
    public static void main(String[] args) {

        PrevidenciaService ps = new PrevidenciaPrivadaService();

        SalarioService salarioService = new SalarioService();
        salarioService.setPrevidenciaService(ps);

        System.out.println(salarioService.salarioLiquido(10000));
    }
}