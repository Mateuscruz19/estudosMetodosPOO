import java.security.spec.KeySpec;

public class Animal {
    String nome;
    int tamanho;
    String nomeCientifico;
    String especie;
    String habitatNatural;
    String expectativaDeVida;
    Boolean carnivoro;

    public String getNome(){
        return nome;
    }

    public int getTamanho(){
        return tamanho;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public String getEspecie() {
        return especie;
    }

    public String getHabitatNatural() {
        return habitatNatural;
    }

    public String getExpectativaDeVida(){
        return expectativaDeVida;
    }

    public Boolean getCarnivoro(){
        return carnivoro;
    }

    public void setAndar() {
        System.out.println(nome + "esta andando.");
    }

    public void setFazBarulho(){
        System.out.println((nome+ "esta fazendo barulho."));
    }

    public void setCome(){
        System.out.println(nome+"esta comendo.");
    }
}
