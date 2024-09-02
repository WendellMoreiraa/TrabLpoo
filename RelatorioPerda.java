package model;
import dao.*;
import java.util.Date;
import java.util.List;

public class RelatorioPerda {
    private int id;
    private int contaId;
    private Date data;
    private String valor;
    private String origem;
    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContaId() {
        return contaId;
    }

    public void setContaId(int contaId) {
        this.contaId = contaId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public  String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void mostrarPerdas() {
        RelatorioPerdasDAO  dao = new RelatorioPerdasDAO();
        List<RelatorioPerda> perdas = dao.getAllPerdas();

        if (perdas.isEmpty()) {
            System.out.println("Nenhuma perda registrada.");
        } else {
            System.out.println("Relatório de Perdas:");
            for (RelatorioPerda perda : perdas) {
                System.out.println("ID: " + perda.getId());
                System.out.println("Conta ID: " + perda.getContaId());
                System.out.println("Data: " + perda.getData());
                System.out.println("Valor: " + perda.getValor());
                System.out.println("Origem: " + perda.getOrigem());
                System.out.println("----------------------------");
            }
        }
    }}