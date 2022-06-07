

package szamalk.kincskereses;

import szamalk.kincskereses.nezet.KincsesGUI;
import szamalk.kincskereses.modell.Lada;

/**
 *
 * @author Máté
 */
public class KincsKereses {

    public static void main(String[] args) {
        KincsesGUI jatek = new KincsesGUI();
        KincsesGUI.ujJatek();
        Lada arany = new Lada("Én rejtem a kincset", false);
        Lada ezüst = new Lada("nem én rejtem ", false);
        Lada bronz = new Lada("arany hazudik", true);
        System.out.println(arany);
        System.out.println(arany.getSzoveg());
    }
}
