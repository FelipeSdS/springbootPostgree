package br.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Usuario;
import br.com.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario insert(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public List<Usuario> list(){
		return usuarioRepository.findAll();
	}
	
	public Usuario findById(Integer cdCodigo) {
		Optional<Usuario> usuarioBD = usuarioRepository.findById(cdCodigo);
		Usuario usuario = usuarioBD.orElseThrow(RuntimeException :: new);
		return usuario;
	}
}
