package logikaioop;

import java.util.Objects;

public class Lada {

    private String allitas;
    private String anyag;
    private boolean kincs;

    public Lada(String allitas, String anyag, boolean kincs) {
        this.allitas = allitas;
        this.anyag = anyag;
        this.kincs = kincs;
    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }
    
    
    public String getAllitas() {
        return allitas;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.allitas);
        return hash;
    }

    public boolean equals(Lada mondat) {
        if (this == mondat) {
            return true;
        }
        if (mondat == null) {
            return false;
        }
        if (getClass() != mondat.getClass()) {
            return false;
        }
        final Lada other = (Lada) mondat;
        return Objects.equals(this.allitas, other.allitas);
    }

    @Override
    public String toString() {
        return "Lada{" + "allitas=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs + '}';
    }

}
