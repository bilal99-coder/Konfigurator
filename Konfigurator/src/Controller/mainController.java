package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private ComboBox<String> merkeBox;

    @FXML
    private ComboBox<String> motorBox;

    @FXML
    private Slider hestSlider;

    @FXML
    private CheckBox automatGirkasseBtn;

    @FXML
    private CheckBox manGirBtn;

    @FXML
    private TextField lblTotalPris;

    @FXML
    void HengerFesteBtn(ActionEvent event) {

    }

    @FXML
    void NavigasjonPakkeBtn(ActionEvent event) {

    }

    @FXML
    void autoGir(ActionEvent event) {

    }

    @FXML
    void dab_Btn(ActionEvent event) {

    }

    @FXML
    void klimaBtn(ActionEvent event) {

    }

    @FXML
    void manGir(ActionEvent event) {

    }

    @FXML
    void metalikkLakkBtn(ActionEvent event) {

    }

    @FXML
    void stnadardLakkBtn(ActionEvent event) {

    }
       @Override
    public void initialize(URL location, ResourceBundle resources) {
        merkeBox.getItems().addAll("Audi", "Volvo", "Nissan");
        //modelBox.getItems().addAll("Velg en bil merke først!");
        drivstoffBox.getItems().addAll("Elektrisitet", "Bensin", "Diesel", "Hybrid");
        merkeBox.setOnAction(e-> changeModell());
       // merkeBox.
   }
   public void changeModell( ){
       String Merke = merkeBox.getValue().toString();
        if (merkeBox.getValue().toString().equals("Audi")){
          //  modelBox.setValue(null);
               modelBox.getItems().addAll("A3", "A5", "A6", "Q5","Q7", "Q8", "RS3");
        }
      else   if (Merke.equals("Volvo")){
          merkeBox = new ComboBox<>() ;
            modelBox.getItems().addAll("XC40" , "XC60", "XC90", "S60");

        }
      else  if (Merke.equals("Nissan")){
            merkeBox = new ComboBox<>() ;
            modelBox.getItems().addAll("Leaf", "Quashqai" ,"GTR" );

        }
       else
       modelBox.getItems().addAll("Velg en merke!");

    }

}
