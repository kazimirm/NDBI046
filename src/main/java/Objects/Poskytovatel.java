package Objects;

public class Poskytovatel {

    private String mistoPoskytovaniId;
    private String zdravotnickeZarizeniId;
    private String kod;
    private String nazevZarizeni;
    private String druhZarizeni;
    private String obec;
    private String psc;
    private String ulice;
    private String cisloDomovniOrientacni;
    private String kraj;
    private String krajCode;
    private String okres;
    private String okresCode;
    private String spravniObvod;
    private String poskytovatelTelefon;
    private String poskytovatelFax;
    private String poskytovatelEmail;
    private String poskytovatelWeb;
    private String ico;
    private String typOsoby;
    private String pravniFormaKod;
    private String krajCodeSidlo;
    private String okresCodeSidlo;
    private String obecSidlo;
    private String pscSidlo;
    private String uliceSidlo;
    private String cisloDomovniOrientacniSidlo;
    private String oborPece;
    private String formaPece;
    private String druhPece;
    private String odbornyZastupce;
    private String lat;
    private String lng;

    public Poskytovatel (String[] record){
        this.mistoPoskytovaniId = record[0];
        this.zdravotnickeZarizeniId = record[1];
        this.kod = record[2];
        this.nazevZarizeni = record[3];
        this.druhZarizeni = record[4];
        this.obec = record[5];
        this.psc = record[6];
        this.ulice = record[7];
        this.cisloDomovniOrientacni = record[8];
        this.kraj = record[9];
        this.krajCode = record[10];
        this.okres = record[11];
        this.okresCode = record[12];
        this.spravniObvod = record[13];
        this.poskytovatelTelefon = record[14];
        this.poskytovatelFax = record[15];
        this.poskytovatelEmail = record[16];
        this.poskytovatelWeb = record[17];
        this.ico = record[18];
        this.typOsoby = record[19];
        this.pravniFormaKod = record[20];
        this.krajCodeSidlo = record[21];
        this.okresCodeSidlo = record[22];
        this.obecSidlo = record[23];
        this.pscSidlo = record[24];
        this.uliceSidlo = record[25];
        this.cisloDomovniOrientacniSidlo = record[26];
        this.oborPece = record[27];
        this.formaPece = record[28];
        this.druhPece = record[29];
        this.odbornyZastupce = record[30];
        this.lat = record[31];
        this.lng = record[32];
    }

    public Poskytovatel() {
    }

    public String getMistoPoskytovaniId() {
        return mistoPoskytovaniId;
    }

    public void setMistoPoskytovaniId(String mistoPoskytovaniId) {
        this.mistoPoskytovaniId = mistoPoskytovaniId;
    }

    public String getZdravotnickeZarizeniId() {
        return zdravotnickeZarizeniId;
    }

    public void setZdravotnickeZarizeniId(String zdravotnickeZarizeniId) {
        this.zdravotnickeZarizeniId = zdravotnickeZarizeniId;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNazevZarizeni() {
        return nazevZarizeni;
    }

    public void setNazevZarizeni(String nazevZarizeni) {
        this.nazevZarizeni = nazevZarizeni;
    }

    public String getDruhZarizeni() {
        return druhZarizeni;
    }

    public void setDruhZarizeni(String druhZarizeni) {
        this.druhZarizeni = druhZarizeni;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getCisloDomovniOrientacni() {
        return cisloDomovniOrientacni;
    }

    public void setCisloDomovniOrientacni(String cisloDomovniOrientacni) {
        this.cisloDomovniOrientacni = cisloDomovniOrientacni;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getKrajCode() {
        return krajCode;
    }

    public void setKrajCode(String krajCode) {
        this.krajCode = krajCode;
    }

    public String getOkres() {
        return okres;
    }

    public void setOkres(String okres) {
        this.okres = okres;
    }

    public String getOkresCode() {
        return okresCode;
    }

    public void setOkresCode(String okresCode) {
        this.okresCode = okresCode;
    }

    public String getSpravniObvod() {
        return spravniObvod;
    }

    public void setSpravniObvod(String spravniObvod) {
        this.spravniObvod = spravniObvod;
    }

    public String getPoskytovatelTelefon() {
        return poskytovatelTelefon;
    }

    public void setPoskytovatelTelefon(String poskytovatelTelefon) {
        this.poskytovatelTelefon = poskytovatelTelefon;
    }

    public String getPoskytovatelFax() {
        return poskytovatelFax;
    }

    public void setPoskytovatelFax(String poskytovatelFax) {
        this.poskytovatelFax = poskytovatelFax;
    }

    public String getPoskytovatelEmail() {
        return poskytovatelEmail;
    }

    public void setPoskytovatelEmail(String poskytovatelEmail) {
        this.poskytovatelEmail = poskytovatelEmail;
    }

    public String getPoskytovatelWeb() {
        return poskytovatelWeb;
    }

    public void setPoskytovatelWeb(String poskytovatelWeb) {
        this.poskytovatelWeb = poskytovatelWeb;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getTypOsoby() {
        return typOsoby;
    }

    public void setTypOsoby(String typOsoby) {
        this.typOsoby = typOsoby;
    }

    public String getPravniFormaKod() {
        return pravniFormaKod;
    }

    public void setPravniFormaKod(String pravniFormaKod) {
        this.pravniFormaKod = pravniFormaKod;
    }

    public String getKrajCodeSidlo() {
        return krajCodeSidlo;
    }

    public void setKrajCodeSidlo(String krajCodeSidlo) {
        this.krajCodeSidlo = krajCodeSidlo;
    }

    public String getOkresCodeSidlo() {
        return okresCodeSidlo;
    }

    public void setOkresCodeSidlo(String okresCodeSidlo) {
        this.okresCodeSidlo = okresCodeSidlo;
    }

    public String getObecSidlo() {
        return obecSidlo;
    }

    public void setObecSidlo(String obecSidlo) {
        this.obecSidlo = obecSidlo;
    }

    public String getPscSidlo() {
        return pscSidlo;
    }

    public void setPscSidlo(String pscSidlo) {
        this.pscSidlo = pscSidlo;
    }

    public String getUliceSidlo() {
        return uliceSidlo;
    }

    public void setUliceSidlo(String uliceSidlo) {
        this.uliceSidlo = uliceSidlo;
    }

    public String getCisloDomovniOrientacniSidlo() {
        return cisloDomovniOrientacniSidlo;
    }

    public void setCisloDomovniOrientacniSidlo(String cisloDomovniOrientacniSidlo) {
        this.cisloDomovniOrientacniSidlo = cisloDomovniOrientacniSidlo;
    }

    public String getOborPece() {
        return oborPece;
    }

    public void setOborPece(String oborPece) {
        this.oborPece = oborPece;
    }

    public String getFormaPece() {
        return formaPece;
    }

    public void setFormaPece(String formaPece) {
        this.formaPece = formaPece;
    }

    public String getDruhPece() {
        return druhPece;
    }

    public void setDruhPece(String druhPece) {
        this.druhPece = druhPece;
    }

    public String getOdbornyZastupce() {
        return odbornyZastupce;
    }

    public void setOdbornyZastupce(String odbornyZastupce) {
        this.odbornyZastupce = odbornyZastupce;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
