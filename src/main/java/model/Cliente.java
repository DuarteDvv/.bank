package model;

import java.util.Set;
import java.util.HashSet;
import java.time.LocalDate;

public class Cliente implements Comparable<Cliente> {

    private final String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private Set<Conta> contas = new HashSet<>();

    public Cliente(String cpf, String nome, LocalDate nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = nascimento;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Cliente)) {
            return false;
        }

        Cliente client = (Cliente) object;
        return client.cpf.equals(this.cpf);
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int compareTo(Cliente outroCliente) {
        if (this.nome == null || outroCliente.nome == null) {
            return 0;
        }
        return this.nome.compareToIgnoreCase(outroCliente.nome);
    }

    public void apagarConta(Conta contaParaApagar) {
        contas.remove(contaParaApagar);
    }

    public void criarConta(Conta a) {
        contas.add(a);

    }

    public Set<Conta> getContas() {
        return contas;
    }

}