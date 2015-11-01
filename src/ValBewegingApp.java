import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by michael on 01-11-15.
 */
public class ValBewegingApp extends Application {
    public BorderPane pane = new BorderPane();
    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     * <p>
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set. The primary stage will be embedded in
     *                     the browser if the application was launched as an applet.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages and will not be embedded in the browser.
     */
    @Override public void start(Stage primaryStage) throws Exception {
        ControlePaneelNoord noordpaneel = new ControlePaneelNoord();
        ValBewegingPaneel valBewegingPaneel = new ValBewegingPaneel(this, noordpaneel);
        this.pane.setTop(noordpaneel);
        this.pane.setCenter(valBewegingPaneel);
        Scene scene = new Scene(this.pane, 800, 600);
        primaryStage.setTitle("FreeFall");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
