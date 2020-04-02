package Model;

public class Utstyr {
    private boolean hengerfeste;

    public void setRadioDab(boolean radioDab) {
        this.radioDab = radioDab;
    }

    public void setNavigasjonPakke(boolean navigasjonPakke) {
        this.navigasjonPakke = navigasjonPakke;
    }

    public void setKlimmaPakke(boolean klimmaPakke) {
        this.klimmaPakke = klimmaPakke;
    }

    private boolean radioDab;
    private boolean navigasjonPakke;
    private boolean klimmaPakke;

    public boolean isHengerfeste() {
        return hengerfeste;
    }

    public void setHengerfeste(boolean hengerfeste) {
        this.hengerfeste = hengerfeste;
    }

    public boolean isRadioDab() {
        return radioDab;
    }

    public boolean isNavigasjonPakke() {
        return navigasjonPakke;
    }

    public boolean isKlimmaPakke() {
        return klimmaPakke;
    }
}
