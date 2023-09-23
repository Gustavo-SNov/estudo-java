package livroJava.metodos.ensino;

public class Aluno {
    private String nome;
    private Integer nq_add;
    private Integer nq_sub;
    private Integer nq_mul;
    private Integer nq_div;
    private Integer acer_add;
    private Integer acer_sub;
    private Integer acer_mul;
    private Integer acer_div;
    private double des_add;
    private double des_sub;
    private double des_mul;
    private double des_div;

    public Aluno(String nome){
        this.nome = nome;
        this.nq_add = 0;
        this.nq_sub = 0;
        this.nq_mul = 0;
        this.nq_div = 0;
        this.acer_add = 0;
        this.acer_sub = 0;
        this.acer_mul = 0;
        this.acer_div = 0;
        this.des_add = (double)this.acer_add / (double)this.nq_add;
        this.des_sub = (double)this.acer_sub / (double)this.nq_sub;
        this.des_mul = (double)this.acer_mul / (double)this.nq_mul;
        this.des_div = (double)this.acer_div/ (double)this.nq_div;
    }

    public Integer getAcer_add() {
        return acer_add;
    }

    public Integer getAcer_div() {
        return acer_div;
    }

    public Integer getAcer_mul() {
        return acer_mul;
    }

    public Integer getAcer_sub() {
        return acer_sub;
    }

    public Integer getNq_add() {
        return nq_add;
    }

    public Integer getNq_div() {
        return nq_div;
    }

    public Integer getNq_mul() {
        return nq_mul;
    }

    public Integer getNq_sub() {
        return nq_sub;
    }

    public String getNome() {
        return nome;
    }

    public void setDes_add(double des_add) {
        this.des_add = des_add;
    }

    public void setDes_div(double des_div) {
        this.des_div = des_div;
    }

    public void setDes_mul(double des_mul) {
        this.des_mul = des_mul;
    }

    public void setDes_sub(double des_sub) {
        this.des_sub = des_sub;
    }

    public double getDes_add() {
        return des_add;
    }

    public double getDes_div() {
        return des_div;
    }

    public double getDes_mul() {
        return des_mul;
    }

    public double getDes_sub() {
        return des_sub;
    }

    public void setAcer_add(Integer acer_add) {
        this.acer_add = acer_add;
    }

    public void setAcer_div(Integer acer_div) {
        this.acer_div = acer_div;
    }

    public void setAcer_mul(Integer acer_mul) {
        this.acer_mul = acer_mul;
    }

    public void setAcer_sub(Integer acer_sub) {
        this.acer_sub = acer_sub;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNq_add(Integer nq_add) {
        this.nq_add = nq_add;
    }

    public void setNq_div(Integer nq_div) {
        this.nq_div = nq_div;
    }

    public void setNq_mul(Integer nq_mul) {
        this.nq_mul = nq_mul;
    }

    public void setNq_sub(Integer nq_sub) {
        this.nq_sub = nq_sub;
    }
}
