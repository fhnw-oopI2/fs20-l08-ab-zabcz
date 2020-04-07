package ch.fhnw.oop2.module08.ab1;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static final double width = 400;
    public static final double height = 300;


    @Override public void init() {}


    @Override public void start(Stage primaryStage) {
        PresentationModel pm = new PresentationModel();
        Parent rootPanel = new ApplicationUI(pm);
        Scene scene = new Scene(rootPanel);

        primaryStage.setScene(scene);
        primaryStage.titleProperty().bind(pm.appTitleProperty());
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);
        primaryStage.show();

    }

    @Override public void stop() {}

    public static void main(String[] args) {
        Application.launch(args);
    }

}
