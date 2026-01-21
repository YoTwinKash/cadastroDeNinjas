package dev.treino.cadastroDeNinjas.Missoes;

import dev.treino.cadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;

    private NinjaModel ninja;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
