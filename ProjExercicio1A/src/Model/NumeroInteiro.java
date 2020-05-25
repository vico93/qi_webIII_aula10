package Model;

public class NumeroInteiro {
    // Atributos
    private int numero;
    // Acessores
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Métodos
    public boolean checarNumero(){
        if (this.numero > 100) {
            return true;
        }
        else {
            return false;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Número informado: " + numero;
    }
}
