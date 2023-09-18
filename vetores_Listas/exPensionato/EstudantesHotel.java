package vetores_Listas.exPensionato;

public class EstudantesHotel {
    private String nome;
    private String email;

    public EstudantesHotel(String nome,String email){
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nome
                +", "
                +this.email;
    }
}
