package ch.fhnw.oop2.module08.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

// set basic layout to stackpane
public class ApplicationUI extends StackPane {
    private PresentationModel model;
    private Button buttonHello;

    // bring in stage
    public ApplicationUI(PresentationModel pm) {
        this.model = pm;
        initializeControls();
        layoutControls();
    }

    /*
    * init all control elements
    * */
    private void initializeControls() {
        // init all controls
        buttonHello = new Button();
        buttonHello.textProperty().bind(model.buttonTextProperty());

    }

    /*
     * layouting of controls
     * */
    private void layoutControls() {
        this.getChildren().add(buttonHello);
    }

}
