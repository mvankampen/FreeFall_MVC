import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Created by michael on 01-11-15.
 */
public class ControlePaneelNoord extends HBox {
    @FXML private TextField bereikXveld;
    @FXML private TextField bereikYveld;
    @FXML private TextField dtVeld;
    @FXML private Label labelBereikX;
    @FXML private Label labelBereikY;
    @FXML private Label labelDeltaTijd;

    /**
     * Creates an HBox layout with spacing = 0.
     */
    public ControlePaneelNoord() {
        this.labelBereikX = new Label("Bereik X:");
        this.bereikXveld = new TextField("100");
        this.labelBereikY = new Label("Bereik Y:");
        this.bereikYveld = new TextField("100");
        this.labelDeltaTijd = new Label("Delta Tijd:");
        this.dtVeld = new TextField("20");
        setAlignment(Pos.CENTER);
        setSpacing(10);
        this.getChildren()
            .addAll(this.labelBereikX, this.bereikXveld, this.labelBereikY, this.bereikYveld,
                this.labelDeltaTijd, this.dtVeld);
    }

    /**
     * @return X waarden van TextField
     */
    public double getBereikXveld() {
        try {
            return Double.parseDouble(bereikXveld.getText());
        } catch (Exception e) {
            this.bereikXveld.setText("100");
            return Double.parseDouble(this.bereikXveld.getText());
        }
    }

    /**
     * @return Y waarden van TextField
     */
    public double getBereikYveld() {
        try {
            return Double.parseDouble(bereikYveld.getText());
        } catch (Exception e) {
            this.bereikYveld.setText("100");
            return Double.parseDouble(this.bereikYveld.getText());
        }
    }

    /**
     * @return Delta tijd waarden van TextField
     */
    public double getDtVeld() {
        try {
            return Double.parseDouble(dtVeld.getText());
        } catch (Exception e) {
            this.dtVeld.setText("20");
            return Double.parseDouble(this.dtVeld.getText());
        }
    }
}
