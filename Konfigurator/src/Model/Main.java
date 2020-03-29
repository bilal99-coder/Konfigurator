package Model;

import Controller.velkommenSideController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    private static Scene scene;
    public static Scene getScene() {
        return scene;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/resource/velkommenSide.fxml"));
            Parent root = myLoader.load();
            velkommenSideController myController = myLoader.getController();
            primaryStage.setTitle("Bil Konfigurator");
            primaryStage.getIcons().add(new Image("resource/images/mechanic.png"));
            scene = new Scene(root, 900, 700);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            primaryStage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
