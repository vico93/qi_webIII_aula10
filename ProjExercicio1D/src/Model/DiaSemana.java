package Model;

public class DiaSemana {
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
    public String acharDiaDaSemana(){
        switch(this.numero) {
            case 1:
                return ("DOMINGO");
            case 2:
                return ("SEGUNDA");
            case 3:
                return ("TERÇA");
            case 4:
                return ("QUARTA");
            case 5:
                return ("QUINTA");
            case 6:
                return ("SEXTA");
            case 7:
                return ("SÁBADO");
            default:
                return ("INVÁLIDO");
        }
    }

    // toString
    @Override
    public String toString() {
        return "Dia informado: " + numero;
    }
}
