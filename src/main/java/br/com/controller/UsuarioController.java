package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.model.Usuario;
import br.com.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<?> insert(@RequestBody Usuario usuario) {
		return new ResponseEntity<Usuario>(usuarioService.insert(usuario), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> list(){
		return new ResponseEntity<List<Usuario>>(usuarioService.list(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Integer id){
		return new ResponseEntity<Usuario>(usuarioService.findById(id), HttpStatus.OK);
	}
}
