package filmnow;

public class Filme {

    private String nome;
    private int anoDelancamento;
    private String localOndeAssistir;
    private boolean ehHot;

    public Filme(String nome, int anoDeLancamento, String localOndeAssistir){
        this.nome = nome;
        this.anoDelancamento = anoDeLancamento;
        this.localOndeAssistir = localOndeAssistir;
        this.ehHot = false;
    }

    public void setHot() {
        if (this.ehHot) {
            this.ehHot = false;
        } else {
            this.ehHot = true;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getAnoDelancamento() {
        return this.anoDelancamento;
    }

    public String getLocalOndeAssistir() {
        return this.localOndeAssistir;
    }

    public boolean isHot() {
        return this.ehHot;
    }

    @Override
    public String toString() {
        if (this.ehHot) {
            return "\uD83D\uDD25 "+this.nome+", "+this.anoDelancamento+this.localOndeAssistir;
        } else {
            return this.nome+", "+this.anoDelancamento+this.localOndeAssistir;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Filme outra = (Filme) o;

        return this.nome == outra.nome;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(nome);
    }
}

