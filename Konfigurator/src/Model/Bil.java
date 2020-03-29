package Model;

import java.util.Objects;

public class Bil {
    private String Merke;
    private String Model;
    private String drivstoff;
    private int hk;
    private String girkasse;
    private String farge;
    private Utstyr minUtstyr;

    public Bil(String merke, String model, String drivstoff, int hk, String girkasse, String farge, Utstyr minUtstyr) {
        Merke = merke;
        Model = model;
        this.drivstoff = drivstoff;
        this.hk = hk;
        this.girkasse = girkasse;
        this.farge = farge;
        this.minUtstyr = minUtstyr;
    }

    public String getMerke() {
        return Merke;
    }

    public void setMerke(String merke) {
        Merke = merke;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getDrivstoff() {
        return drivstoff;
    }

    public void setDrivstoff(String drivstoff) {
        this.drivstoff = drivstoff;
    }

    public int getHk() {
        return hk;
    }

    public void setHk(int hk) {
        this.hk = hk;
    }

    public String getGirkasse() {
        return girkasse;
    }

    public void setGirkasse(String girkasse) {
        this.girkasse = girkasse;
    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public Utstyr getMinUtstyr() {
        return minUtstyr;
    }

    public void setMinUtstyr(Utstyr minUtstyr) {
        this.minUtstyr = minUtstyr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return hk == bil.hk &&
                Objects.equals(Merke, bil.Merke) &&
                Objects.equals(Model, bil.Model) &&
                Objects.equals(drivstoff, bil.drivstoff) &&
                Objects.equals(girkasse, bil.girkasse) &&
                Objects.equals(farge, bil.farge) &&
                Objects.equals(minUtstyr, bil.minUtstyr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Merke, Model, drivstoff, hk, girkasse, farge, minUtstyr);
    }

    @Override
    public String toString() {
        return "Bil{" +
                "Merke='" + Merke + '\'' +
                ", Model='" + Model + '\'' +
                ", drivstoff='" + drivstoff + '\'' +
                ", hk=" + hk +
                ", girkasse='" + girkasse + '\'' +
                ", farge='" + farge + '\'' +
                ", minUtstyr=" + minUtstyr +
                '}';
    }
}
