package ch.fhnw.oop2.module08.ab2.StatusProperty;

import ch.fhnw.oop2.module08.ab2.ButtonStatus;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

    public StringProperty appTitle;
    public ObjectProperty<ButtonStatus> buttonText;

    public PresentationModel() {
        appTitle = new SimpleStringProperty("JavaFX Application - Aufgabe  - fancy");
        buttonText = new SimpleObjectProperty<ButtonStatus>(ButtonStatus.Off);
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

    public ButtonStatus getButtonText() {
        return buttonText.get();
    }

    public ObjectProperty<ButtonStatus> buttonTextProperty() {
        return buttonText;
    }

    public void setButtonText(ButtonStatus status) {
        this.buttonText.set(status);
    }

    public void toggle() {
        if (getButtonText() == ButtonStatus.On){
            setButtonText(ButtonStatus.Off);
        } else{
            setButtonText(ButtonStatus.On);
        }
    }
}
