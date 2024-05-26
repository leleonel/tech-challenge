package br.com.fiap.techchallenge.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NonNull;

@Entity
public class Cliente {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NonNull
    String cpf;
    @NonNull
    String nome;
    @NonNull
    String email;

    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Cliente() {
    }

    public @NonNull String getCpf() {
        return cpf;
    }

    public @NonNull String getNome() {
        return nome;
    }

    public @NonNull String getEmail() {
        return email;
    }

    public void setCpf(@NonNull String cpf) {
        this.cpf = cpf;
    }

    public void setNome(@NonNull String nome) {
        this.nome = nome;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
