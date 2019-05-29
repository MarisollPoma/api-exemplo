package br.com.etechoracio.apiexemplo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.apiexemplo.enums.EspecieEnum;
import br.com.etechoracio.apiexemplo.enums.SexoEnum;
import br.com.etechoracio.apiexemplo.enums.StatusEnum;

@Entity
@Table(name = "TBL_PERSONAGEM")
public class Personagem {

	@Id
	@GeneratedValue
	@Column(name = "ID_PERSONAGEM")
    private Long id;
	
	@Column(name = "TX_NOME")
    private String nome;
	
	@Column(name = "TX_APELIDO")
    private String apelido;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TP_ESPECIE")
    private EspecieEnum especie;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TP_SEXO")
    private SexoEnum sexo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ST_PERSONAGEM")
    private StatusEnum status;

    public Personagem() {}

    public Personagem(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public EspecieEnum getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieEnum especie) {
        this.especie = especie;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
