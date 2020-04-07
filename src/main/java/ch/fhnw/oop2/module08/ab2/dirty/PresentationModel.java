package ch.fhnw.oop2.module08.ab2.dirty;

import ch.fhnw.oop2.module08.ab2.ButtonStatus;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

    public StringProperty appTitle;
    public StringProperty buttonText;

    public PresentationModel() {
        appTitle = new SimpleStringProperty("JavaFX Application - Aufgabe 2 - dirty");
        buttonText = new SimpleStringProperty(ButtonStatus.On.toString());
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

    public void toggle() {
        if (getButtonText().equals(ButtonStatus.On.toString())){
            setButtonText(ButtonStatus.Off.toString());
        } else{
            setButtonText(ButtonStatus.On.toString());
        }
    }
}
