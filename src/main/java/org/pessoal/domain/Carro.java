package org.pessoal.domain;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity //Declarando que essa classe será uma tabela no banco
public class Carro implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NomeDoCarro") // É possivel adicionar um nome especifico para a coluna no banco de dados. No caso de não especificar,
    //O nome da coluna será o mesmo do atributo
    private String nome;
    private String cor;
    private double preco;

    public Carro(String nome, String cor, double preco) {
        this.id = null;
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
    }
    public Carro() {

    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                '}';
    }
}
