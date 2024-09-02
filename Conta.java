package model;

import dao.ContaDAO;

public class Conta {
    private int id;
    private ContaDAO contaDAO;

    public Conta(int id) {
        this.id = id;
        this.contaDAO = new ContaDAO();
    }

    public double verSaldo() {
        return contaDAO.getSaldo(id);
    }

    public void adicionarSaldo(double valor) {
        contaDAO.adicionarSaldo(id, valor);
    }

    public void retirarSaldo(double valor) {
        contaDAO.retirarSaldo(id, valor);
    }

}