package com.edsonrego.estudoInjecaoDependenciaCDI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //ou @Component
public class SalarioService {

    @Autowired
    private PrevidenciaService previdenciaService;

    public double salarioLiquido(double salarioBruto){
        double imposto = salarioBruto * 0.2;
        double previdencia = previdenciaService.desconto(salarioBruto);
        return salarioBruto - imposto - previdencia;
    }
}
