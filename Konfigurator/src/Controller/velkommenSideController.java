package Controller;
import Model.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class velkommenSideController {
    Stage stage ;
    @FXML
    private ImageView image;
    @FXML
    private Button byggBtn;
    @FXML
    void byggBil(ActionEvent event) throws Exception {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("/resource/mainView.fxml"));
        Parent root = loader.load();
        Scene  mainView = Main.getScene();
        mainView.setRoot(root);
        stage = (Stage) byggBtn.getScene().getWindow() ;
        stage.getIcons().add(new Image("resource/images/mechanic.png"));
        stage.setTitle("Bil Konfigurator");
      //  mainView.getStylesheets().add(getClass().getResource("/resource/stylesheet.css").toExternalForm());
        stage.show();


    }
}
