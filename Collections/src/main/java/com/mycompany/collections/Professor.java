
package com.mycompany.collections;

public class Professor extends Pessoa{
    String materia;
    String matProf;
    
    public Professor(String materia, String matProf, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.materia = materia;
        this.matProf = matProf;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMatProf() {
        return matProf;
    }

    public void setMatProf(String matProf) {
        this.matProf = matProf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
   
}
