
package szamalk.kincskereses.modell;

/**
 *
 * @author Máté
 */
public class Lada {
    private String szoveg;
    private String fajta;
    public final static String ARANY = "arany";
    public final static String EZUST = "ezüst";
    public final static String BRONZ = "bronz";

    public Lada(String szoveg, String fajta) {
        this.szoveg = szoveg;
        this.fajta = fajta;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public String getFajta() {
        return fajta;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    
    
}
