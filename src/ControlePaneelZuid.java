import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * Created by michael on 01-11-15.
 */
public class ControlePaneelZuid extends HBox {
    @FXML
    private Button animation;
    @FXML
    private Button stopAnimation;

    private Bal bal;
    private BalView balView;
    private BalController balController;

    public ControlePaneelZuid(Bal bal, BalView balView, BalController balController) {
        this.bal = bal;
        this.balView = balView;
        this.balController = balController;

        this.animation = new Button("Animation");
        this.animation.setOnAction(event -> this.balController.pleaseStart());
        this.stopAnimation = new Button("Stop");
        this.stopAnimation.setOnAction(event -> this.balController.pleaseStop());

        setAlignment(Pos.CENTER);
        getChildren().addAll(this.animation, this.stopAnimation);
    }
}
