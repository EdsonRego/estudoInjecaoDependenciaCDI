package com.edsonrego.estudoInjecaoDependenciaCDI;

import com.edsonrego.estudoInjecaoDependenciaCDI.services.PrevidenciaService;
import com.edsonrego.estudoInjecaoDependenciaCDI.services.SalarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudoInjecaoDependenciaCdiApplication implements CommandLineRunner	 {

	private SalarioService salarioService;

	public EstudoInjecaoDependenciaCdiApplication(SalarioService salarioService) {
		this.salarioService = salarioService;
	}

	public static void main(String[] args) {
		SpringApplication.run(EstudoInjecaoDependenciaCdiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(salarioService.salarioLiquido(10000));
	}
}
