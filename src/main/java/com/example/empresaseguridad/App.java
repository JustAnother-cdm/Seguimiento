package com.example.empresaseguridad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import com.example.empresaseguridad.ViewController.SEGURCOLViewCotroller;

import java.io.IOException;

public class App extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("SEGURCOL");
        openViewPropietario();
    }

    private void openViewPropietario() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudPropietario.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            SEGURCOLViewCotroller segurcolViewCotroller = loader.getController();
            SEGURCOLViewCotroller.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



}
