package dev.treino.cadastroDeNinjas.Ninjas;

import dev.treino.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

@Entity //transforma uma classe em entidade no BD
@Table(name = "tb_cadastro")

public class NinjaModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    //ManyToOne um ninja tem uma unica missao

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
