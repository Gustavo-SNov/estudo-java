package cap8;

public class Time1 {
    private int h;
    private int min;
    private int seg;
    public void setTime(int horas,int minutos, int segundos){
        if (h<0 || h>=24 || min<0 || min>=60 || seg<0 || seg>=60){
            throw new IllegalArgumentException("hora,minutos e/ou segundos inválidos");
        }
        this.h = horas;
        this.min = minutos;
        this.seg = segundos;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",this.h,this.min,this.seg);
        //return "Hora" + h +",minutos" + min +",segundos"+seg;
    }
}
