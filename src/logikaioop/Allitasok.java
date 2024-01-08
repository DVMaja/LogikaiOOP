package logikaioop;

import java.util.Objects;

public class Allitasok {
    private String allitas;

    public Allitasok(String allitas) {
        this.allitas = allitas;
    }

    public String getAllitas() {
        return allitas;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    @Override
    public String toString() {
        return "Allitasok{" + "allitas=" + allitas + '}';
    }


    public boolean equals(Allitasok mondat) {
        if (this == mondat) {
            return true;
        }
        if (mondat == null) {
            return false;
        }
        if (getClass() != mondat.getClass()) {
            return false;
        }
        final Allitasok other = (Allitasok) mondat;
        return Objects.equals(this.allitas, other.allitas);
    }
    
    
}