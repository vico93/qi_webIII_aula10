package Model;

public class ParImpar {
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
    public boolean testeParImpar(){
        return ((this.numero % 2) == 0); // Testando a condição no retorno do método (e depois apenas chama o método detnro do IF
    }

    // toString

    @Override
    public String toString() {
        return "Número informado: " + numero;
    }
}
