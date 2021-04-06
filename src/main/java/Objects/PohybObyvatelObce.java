package Objects;

public class PohybObyvatelObce {

    private String idhod;
    private String hodnota;
    private String vuk;
    private String vuk_text;
    private String stapro_kod;
    private String vuzemi_cis;
    private String vuzemi_kod;
    private String rok;
    private String casref_od;
    private String casref_do;
    private String vuzemi_txt;

    public PohybObyvatelObce(String[] record) {
        this.idhod = record[0];
        this.hodnota = record[1];
        this.vuk = record[2];
        this.vuk_text = record[3];
        this.stapro_kod = record[4];
        this.vuzemi_cis = record[5];
        this.vuzemi_kod = record[6];
        this.rok = record[7];
        this.casref_od = record[8];
        this.casref_do = record[9];
        this.vuzemi_txt = record[10];
    }

    public String getIdhod() {
        return idhod;
    }

    public void setIdhod(String idhod) {
        this.idhod = idhod;
    }

    public String getHodnota() {
        return hodnota;
    }

    public void setHodnota(String hodnota) {
        this.hodnota = hodnota;
    }

    public String getVuk() {
        return vuk;
    }

    public void setVuk(String vuk) {
        this.vuk = vuk;
    }

    public String getVuk_text() {
        return vuk_text;
    }

    public void setVuk_text(String vuk_text) {
        this.vuk_text = vuk_text;
    }

    public String getStapro_kod() {
        return stapro_kod;
    }

    public void setStapro_kod(String stapro_kod) {
        this.stapro_kod = stapro_kod;
    }

    public String getVuzemi_cis() {
        return vuzemi_cis;
    }

    public void setVuzemi_cis(String vuzemi_cis) {
        this.vuzemi_cis = vuzemi_cis;
    }

    public String getVuzemi_kod() {
        return vuzemi_kod;
    }

    public void setVuzemi_kod(String vuzemi_kod) {
        this.vuzemi_kod = vuzemi_kod;
    }

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }

    public String getCasref_od() {
        return casref_od;
    }

    public void setCasref_od(String casref_od) {
        this.casref_od = casref_od;
    }

    public String getCasref_do() {
        return casref_do;
    }

    public void setCasref_do(String casref_do) {
        this.casref_do = casref_do;
    }

    public String getVuzemi_txt() {
        return vuzemi_txt;
    }

    public void setVuzemi_txt(String vuzemi_txt) {
        this.vuzemi_txt = vuzemi_txt;
    }
}
