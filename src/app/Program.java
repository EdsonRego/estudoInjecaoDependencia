package app;

import service.SalarioService;

public class Program {
    public static void main(String[] args) {

        SalarioService salarioService = new SalarioService();

        System.out.println(salarioService.salarioLiquido(10000));

    }
}