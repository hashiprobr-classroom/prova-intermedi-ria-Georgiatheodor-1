package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private double hora;
    private double minuto;
    private Data data;

    public DataHorario(double hora, double minuto, Data data){
        this.hora = 0;
        this.minuto = 0;
        this.data = data;
    }

    public double getHora() {
        return hora;
    }

    public double getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public int minutos() {
        return 0;
    }

    // public Integer atualiza (){

   // }


}
