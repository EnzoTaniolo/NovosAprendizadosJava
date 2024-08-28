package br.com.fiap.restaurante.model;

public class Bebida extends Produto {
    private Integer tamanho;

    public Bebida() {
    }

    @Override
    public String getResumo() {
        return "dados bebida";
    }

    public Bebida(String nome, String ingredientes, Double preco, Integer tamanho) {
        super(nome, ingredientes, preco);
        this.tamanho = tamanho;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

}
