package com.Delano_Conta.Banco;

public class ContaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    //Metodos personalisados onde vai a logica
    public void abrirConta(String t){
        this.setTipo(t); // Aqui esta usando o metodo
        this.setStatus(true); // Aqui esta usando o metodo
        if (t == "CC") {
            this.setSaldo(50);
        }else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem saldo");
        }else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois esta em débito");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            //this.saldo = this.saldo + v; // Aqui esta acessando diretamente o atributo
            this.setSaldo(this.getSaldo() + v);  // Aqui esta acessando os atributos usando os metodos
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) { // primeiro if informa se o status da conta é true ou flase
            if (this.getSaldo() >= v) {  // segundo if, se o saldo em conta for igual ou maior pode sacar
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else {  // esse elseacontece, se o saque for maior que o saldo em conta não executa
                System.out.println("Saldo insuficiente para saque");
            }
        }else {  // esse else é executado, se for false
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;   // variavel local do metodo pagarMensal
        if (this.getTipo() == "CC") {
            v = 12;
        }else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {  // se o status da conta for true pode sacar a mensalidade
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else {  // se o status for false não pode sacar
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }
    // Metodo construtor
    public ContaBanco() {
       this.saldo = 0; // Aqui esta acessando diretamente o atributo (porque esta dentro da mesma classe)
       this.status = false; // Aqui esta acessando diretamente o atributo (porque esta dentro da mesma classe)
    }
    // Metodos dos atributos
    public int getNumConta() { // No metodo get não recebi parametro
        return numConta;
    }

    public void setNumConta(int numConta) { // Em set o metodo recebi o parametro int numConta
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
