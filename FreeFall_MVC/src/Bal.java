import javafx.scene.paint.Color;

/**
 * Created by michael on 01-11-15.
 */
public class Bal {
    private double x;
    private double y;

    private double vy;
    private int t;

    private Color kleur; // Kleur van de bal
    private final double VALVERSNELLING = 9.81; // Natuurkundige constante

    public Bal() {
        this.kleur = Color.RED;
        reset();
    }

    /**
     * Zet de startwaarden
     */
    private void reset() {
        this.t = 0;
        this.x = 10;
        this.y = 0;
        this.vy = 0; // snelheid op tijdstip t == 0.
    }

    /**
     * @param dt in msec
     */
    public void adjust(int dt) {
        this.t = this.t + dt;
        // Valbeweging formule over de afgelegde weg .. zie een basis natuurkunde boek.
        this.y = (VALVERSNELLING / 2) * this.t * this.t / 1000000;
        this.vy = (VALVERSNELLING * t) / 1000;
    }


    /**
     *
     * @return x positie bal
     */
    public double getX() {
        return x;
    }

    /**
     *
     * @return y positie bal
     */
    public double getY() {
        return y;
    }

    /**
     *
     * @return vy snelheid van de bal in meter/sec
     */
    public double getVy() {
        return vy;
    }

    /**
     *
     * @return t versterken tijd in msec
     */
    public int getT() {
        return t;
    }

    /**
     *
     * @return kleur van de bal
     */
    public Color getKleur() {
        return kleur;
    }

    /**
     *
     * @param x nieuwe bal locatie
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     *
     * @param y nieuwe bal locatie
     */
    public void setY(double y) {
        this.y = y;
    }
}
