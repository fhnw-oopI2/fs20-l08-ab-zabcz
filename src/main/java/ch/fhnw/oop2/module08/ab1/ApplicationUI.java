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
        //binding
//        appTitle.().bind(model.appTitleProperty());
//        buttonText.bind(model.buttonTextProperty());
        initializeControls();
        layoutControls();
    }

    /*
    * init all control elements
    * */
    private void initializeControls() {
        // init all controls
        buttonHello = new Button();
        buttonHello.textProperty().bind(model.appTitleProperty());

    }

    /*
     * layouting of controls
     * */
    private void layoutControls() {
        this.getChildren().add(buttonHello);
    }

}
