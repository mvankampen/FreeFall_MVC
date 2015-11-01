import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 * Created by michael on 01-11-15.
 */
public class ValBewegingPaneel extends HBox {
    private int startX, startY;
    private int eindX, eindY;
    private ValBewegingApp valBewegingApp;
    private ControlePaneelNoord noordpaneel;
    private Bal bal;
    private BalView balView;
    private BalController balController;

    private final int PARTS = 12;

    public ValBewegingPaneel(ValBewegingApp valBewegingApp, ControlePaneelNoord noordpaneel) {
        this.valBewegingApp = valBewegingApp;
        this.noordpaneel = noordpaneel;
        this.bal = new Bal();
        this.balView = new BalView(bal,this,noordpaneel);
        this.balController = new BalController(this.bal, this.balView, this, noordpaneel);
        Canvas canvas = new Canvas(500,500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        ControlePaneelZuid zuidpaneel = new ControlePaneelZuid(this.bal, this.balView, this.balController);
        this.valBewegingApp.pane.setBottom(zuidpaneel);
        getChildren().addAll(this.balView, canvas);
    }

    private void drawShapes(GraphicsContext gc) {
        //teken het grid
        this.startX = 500 / PARTS;   // Om te zien hoeveel ruimte elk "deel" nodig heeft
        this.startY = 500 / PARTS;
        this.eindX = (PARTS - 1) * this.startX;  //
        this.eindY = (PARTS - 1) * this.startY;  //
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.strokeLine(this.startX, this.startY, this.eindX, this.startY);
        gc.setLineDashes(5);
        for (int te = 2; te <= (PARTS - 2); te++) {
            gc.strokeLine(this.startX, te * this.startY, this.eindX, te * this.startY);
            gc.strokeLine(te * this.startX, this.startY, te * this.startX, this.eindY);
        }
        gc.setLineDashes(30);
        gc.strokeLine(this.startX, this.startY, this.eindX, this.startY);
    }

    /**
     *
     * @return X startwaarden
     */
    public int getStartX() {
        return this.startX;
    }

    /**
     *
     * @return Y startwaarden
     */
    public int getStartY() {
        return this.startY;
    }

    /**
     *
     * @return X eindwaarden
     */
    public int getEindX() {
        return this.eindX;
    }

    /**
     *
     * @return Y eindwaarden
     */
    public int getEindY() {
        return this.eindY;
    }

    /**
     *
     * @return
     */
    public int getPARTS() {
        return PARTS;
    }
}
