package br.com.fiap.cienceFinderStartUp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cienceFinderStartUp.model.Estudante;
import br.com.fiap.cienceFinderStartUp.model.Login;
import br.com.fiap.cienceFinderStartUp.repository.EstudanteRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("cienceFinder/startUp/v1")
public class LoginController {
	
	@Autowired
	private EstudanteRepository estudanteRepository;
	//private LoginService loginService;
	
//	@PostMapping("login")
//	public List<Login> login (@RequestBody Login login) {
//		
//		return loginService.validaLogin(login);
//	}
	
	@PostMapping("login")
	public List<Estudante> login (@RequestBody Login login) {
		return estudanteRepository.findByLogin(login.getLogin(), login.getSenha());
	}	
	
}
