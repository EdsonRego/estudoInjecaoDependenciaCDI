package com.edsonrego.estudoInjecaoDependenciaCDI;

import com.edsonrego.estudoInjecaoDependenciaCDI.services.PrevidenciaService;
import com.edsonrego.estudoInjecaoDependenciaCDI.services.SalarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudoInjecaoDependenciaCdiApplication implements CommandLineRunner	 {

	public static void main(String[] args) {
		SpringApplication.run(EstudoInjecaoDependenciaCdiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PrevidenciaService ps = new PrevidenciaService();
		SalarioService salarioService = new SalarioService(ps);

		System.out.println(salarioService.salarioLiquido(10000));
	}
}
