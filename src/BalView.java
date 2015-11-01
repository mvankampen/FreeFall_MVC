import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by michael on 01-11-15.
 */
public class BalView extends HBox {
    private Circle circle;
    private Bal bal;
    private ValBewegingPaneel valBewegingPaneel;
    private ControlePaneelNoord noordPaneel;
    private DataView dataView;

    public BalView(Bal bal, ValBewegingPaneel valBewegingPaneel, ControlePaneelNoord noordpaneel) {
        this.bal = bal;
        this.valBewegingPaneel = valBewegingPaneel;
        this.noordPaneel = noordpaneel;
        setMaxSize(12,12);
        createCircle();
        getChildren().add(this.circle);
        //this.dataView = new DataView(bal);
        //this.valBewegingPaneel.getChildren().add(dataView);
    }

    private void createCircle() {
        this.circle = new Circle(this.bal.getX(),this.bal.getY(), 12);
        this.circle.setFill(this.bal.getKleur());
        this.circle.setStroke(Color.BLACK);
    }

    /**
     *  update commando van de view, zorgt ervoor dat het rondje wordt geupdate
     */
    public void adjustBal() {
        this.circle.setCenterX(this.bal.getX());
        this.circle.setCenterY(this.bal.getY());
    }
}
