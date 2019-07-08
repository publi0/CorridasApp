package br.com.cadastrocorridas.domain;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Motorista {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Nome não pode estar em branco!")
    private String nome;
    @NotBlank(message = "Nascimento pode não estar em branco!")
    private String nascimento;
    @NotBlank(message = "CPF não pode estar em branco!")
    @CPF(message = "CPF Inválido")
    private String cpf;
    @NotBlank(message = "Sexo não pode estar em branco!")
    private String sexo;
    @NotBlank(message = "Modelo do carro não pode estar em branco!")
    private String modeloCarro;
    @NotBlank(message = "Status não pode estar em branco!")
    private String status;

    public Motorista() {
    }

    public Motorista(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
