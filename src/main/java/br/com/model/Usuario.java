package br.com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tab_usuario")
@Getter
@Setter
public class Usuario {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name="increment", strategy = "increment")
	@Column(name="cd_codigo")
	private Integer codigo;
	
	@Column(name="tx_login")
	private String login;
	
	@Column(name="tx_senha")
	private String senha;
	
	@Column(name="dt_criacao")
	private Date dataCriacao;
}
