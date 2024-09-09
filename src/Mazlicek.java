public class Mazlicek {
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    private String jmeno;

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    private String druh;

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    private int vek;

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    private double vaha;


    public Mazlicek(String jmeno, String druh, int vek, double vaha) {
        this.druh=druh;
        this.vek=vek;
        this.jmeno=jmeno;
        this.vaha=vaha;
    }
 @Override
    public String toString(){
        return "Jméno: "+jmeno+". druh: "+druh+", Věk: "+vek+", Váha: "+vaha+" kg";
 }

}

