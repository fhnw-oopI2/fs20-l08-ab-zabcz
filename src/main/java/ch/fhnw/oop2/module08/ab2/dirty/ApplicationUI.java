package ch.fhnw.oop2.module08.ab2.dirty;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

// set basic layout to stackpane
public class ApplicationUI extends StackPane {
    private PresentationModel model;
    private Button buttonToggle;

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
        buttonToggle = new Button();
        buttonToggle.textProperty().bind(model.buttonTextProperty());
        buttonToggle.setOnAction(event -> model.toggle());
    }

    /*
     * layouting of controls
     * */
    private void layoutControls() {
        this.getChildren().add(buttonToggle);
    }

}
