package app;

import service.PrevidenciaService;
import service.SalarioService;

public class Program {
    public static void main(String[] args) {

        PrevidenciaService ps = new PrevidenciaService();

        SalarioService salarioService = new SalarioService(ps);

        System.out.println(salarioService.salarioLiquido(10000));

    }
}