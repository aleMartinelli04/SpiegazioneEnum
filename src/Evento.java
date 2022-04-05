public class Evento {
    private final String nome;
    private final Giorni giorno;

    public Evento(String nome, Giorni giorno) {
        this.nome = nome;
        this.giorno = giorno;
    }

    public String getNome() {
        return nome;
    }

    public Giorni getGiorno() {
        return giorno;
    }

    @Override
    public String toString() {
        return "Evento di " + giorno.getNome() + ": " + nome;
    }
}

