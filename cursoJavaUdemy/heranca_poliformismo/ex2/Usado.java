package cursoJavaUdemy.heranca_poliformismo.ex2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Usado extends Produto{
    private LocalDate data;
    public Usado(String nome,Double preco,LocalDate data){
        super(nome,preco);
        this.data = data;
    }

    public LocalDate  getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String priceTag(){
        return getNome() +String.format(" (usado) R$ %.2f (Data de fabricação: ", getPreco()) + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }
}
