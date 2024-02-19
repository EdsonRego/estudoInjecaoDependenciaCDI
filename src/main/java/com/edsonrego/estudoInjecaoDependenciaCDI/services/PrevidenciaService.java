package com.edsonrego.estudoInjecaoDependenciaCDI.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //ou @Component
public class PrevidenciaService {
    public double desconto(double salarioBruto) {
        return salarioBruto * 0.1;
    }
}
