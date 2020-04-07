package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

    public StringProperty appTitle;
    public StringProperty buttonText;

    public PresentationModel() {
        appTitle = new SimpleStringProperty("JavaFX Application");
        buttonText = new SimpleStringProperty("Hello World");
    }

    public String getAppTitle() {
        return appTitle.get();
    }

    public StringProperty appTitleProperty() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle.set(appTitle);
    }

    public String getButtonText() {
        return buttonText.get();
    }

    public StringProperty buttonTextProperty() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText.set(buttonText);
    }

}
