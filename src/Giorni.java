
public enum Giorni {
    LUNEDI("Lunedì", "Lun"),
    MARTEDI("Martedì", "Mar"),
    MERCOLEDI("Mercoledì", "Mer"),
    GIOVEDI("Giovedì", "Gio"),
    VENERDI("Venerdì", "Ven"),
    SABATO("Sabato", "Sab"),
    DOMENICA("Domenica", "Dom");

    private final String nome;
    private final String abbreviazione;

    Giorni(String nome, String abbreviazione) {
        this.nome = nome;
        this.abbreviazione = abbreviazione;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAbbreviazione() {
        return this.abbreviazione;
    }

    @Override
    public String toString() {
        return abbreviazione;
    }
}

