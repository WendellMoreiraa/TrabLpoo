package model;
import dao.*;
import java.util.Date;
import java.util.List;

public class RelatorioInvestimento {
    private int id;
    private int contaId;
    private Date data;
    private String descricao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void mostrarInvestimento() {
        RelatorioInvestimentoDAO dao = new RelatorioInvestimentoDAO();
        List<RelatorioInvestimento> investimentos = dao.getAllInvestimentos();

        if (investimentos.isEmpty()) {
            System.out.println("Nenhum investimento encontrado.");
        } else {
            System.out.println("Relatório de Investimentos:");
            for (RelatorioInvestimento investimento : investimentos) {
                System.out.println("ID: " + investimento.getId());
                System.out.println("Conta ID: " + investimento.getContaId());
                System.out.println("Data: " + investimento.getData());
                System.out.println("Descrição: " + investimento.getDescricao());
                System.out.println("----------------------------");
            }
        }
    }}