package com.edsonrego.estudoInjecaoDependenciaCDI.services;

import org.springframework.stereotype.Service;

@Service //ou @Component
public class SalarioService {

    private PrevidenciaService previdenciaService;

    public SalarioService(PrevidenciaService previdenciaService) {
        this.previdenciaService = previdenciaService;
    }

    public double salarioLiquido(double salarioBruto){
        double imposto = salarioBruto * 0.2;
        double previdencia = previdenciaService.desconto(salarioBruto);
        return salarioBruto - imposto - previdencia;
    }
}
