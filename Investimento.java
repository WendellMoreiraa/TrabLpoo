package model;

import dao.InvestimentoDAO;

import java.util.Random;

public class Investimento {
    private Conta conta;
    private InvestimentoDAO investimentoDAO;

    public Investimento(Conta conta) {
        this.conta = conta;
        this.investimentoDAO = new InvestimentoDAO();
    }

    public boolean verificarSaldo(double valor) {
        return conta.verSaldo() >= valor;
    }

    public void investir(double valor, String tipo) {


        if (verificarSaldo(valor)) {
            conta.retirarSaldo(valor);
            investimentoDAO.registrarInvestimento(11, valor, tipo);
            System.out.println("Investimento de R$" + valor + " no tipo " + tipo + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para investir.");
        }
    }

    public void mostrarOpcoesDeInvestimento() {
        System.out.println("Escolha uma opção de investimento:");
        System.out.println("1. Poupança");
        System.out.println("2. CDB");
        System.out.println("3. Ações");
        System.out.println("4. Fundos Imobiliários");
    }
}