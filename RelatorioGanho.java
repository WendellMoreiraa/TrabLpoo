package model;
import dao.*;
import java.util.Date;
import java.util.List;

public class RelatorioGanho {
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

    public void mostrarGanhos() {
        RelatorioGanhosDAO  dao = new RelatorioGanhosDAO();
        List<RelatorioGanho> ganhos = dao.getAllGanhos();

        if (ganhos.isEmpty()) {
            System.out.println("Nenhum ganho encontrado.");
        } else {
            System.out.println("Relatório de Ganhos:");
            for (RelatorioGanho ganho : ganhos) {
                System.out.println("ID: " + ganho.getId());
                System.out.println("Conta ID: " + ganho.getContaId());
                System.out.println("Data: " + ganho.getData());
                System.out.println("Valor: " + ganho.getValor());
                System.out.println("Origem: " + ganho.getOrigem());
                System.out.println("----------------------------");
            }
        }
    }}