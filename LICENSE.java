public class ContaBancaria{
    public String numConta;
    private String tipo;
    public String dono;
    protected float saldo;
    protected boolean status;

    public ContaBancaria(String numConta, String dono, String tipo) {
        this.numConta = numConta;
        this.dono = dono;
        this.setTipo(tipo);
        this.status = false;
        this.saldo = 0;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("CC") || tipo.equals("CP")) {
            this.tipo = tipo;
        }
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta() {
        this.setStatus(true);
        if (this.getTipo().equals("CC")) {
            this.setSaldo(50);
        } else if (this.getTipo().equals("CP")) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setStatus(false);
        } else {
            System.out.println("Conta não pode ser fechada: saldo diferente de zero");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    public void sacar(float valor) {
        if (this.isStatus() && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    public void pagarMensal() {
        int valorMensal = 0;
        if (this.getTipo().equals("CC")) {
            valorMensal = 12;
        } else if (this.getTipo().equals("CP")) {
            valorMensal = 20;
        }

        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - valorMensal);
        }
    }
}
