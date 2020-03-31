package Controller;

import Model.Bil;
import Model.Utstyr;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class mainController implements Initializable  {
   // public boolean autoGir_check;

    @FXML
    private ComboBox<String> merkeBox ;

    @FXML
    private ComboBox<String> modelBox;

    @FXML
    private ComboBox<String> drivstoffBox;


    @FXML
    private Slider hestSlider;
    @FXML
    private RadioButton autoGirBtn;

    @FXML
    private RadioButton manuellGirBtn;

    @FXML
    private TextField lblTotalPris;
    @FXML
    private TextField sliderValue;
    @FXML
    void hkSliderOnAction(MouseEvent event) {
        //Henter ønsker hestkreft verdien og printer den ut i GUI
        int hk_Gui = (int) hestSlider.getValue();
        sliderValue.setText(hk_Gui+"");

    }

    @FXML
    private CheckBox HengerFeste_CheckBtn;

    @FXML
    private CheckBox radioDab_checkBtn;

    @FXML
    private CheckBox NavigasjonPakke_checkBtn;

    @FXML
    private CheckBox klimapakke_checkBtn;



    @FXML
    void metalikkLakkBtn(ActionEvent event) {

    }

    @FXML
    void stnadardLakkBtn(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        merkeBox.getItems().addAll("Audi", "Volvo", "Nissan");
        modelBox.getItems().addAll("Velg en bil merke først!");
        drivstoffBox.getItems().addAll("Elektrisitet", "Bensin", "Diesel", "Hybrid");


   }
   public void changeModell( ActionEvent event ){
       String Merke = merkeBox.getValue();
       modelBox.getItems().clear();
        if (merkeBox.getValue().equals("Audi")){

               modelBox.getItems().addAll("A3", "A5", "A6", "Q5","Q7", "Q8", "RS3");
        }
      else   if (Merke.equals("Volvo")){

            modelBox.getItems().addAll("XC40" , "XC60", "XC90", "S60");

        }
      else  if (Merke.equals("Nissan")){
            modelBox.getItems().addAll("Leaf", "Quashqai" ,"GTR" );

        }
       else
       modelBox.getItems().addAll("Velg en merke!");

    }
    public String girKasse(){
        //Denne metoden henter valgt girkasse button fra Gui og returnere en streng som representerer girkasse type.
        //gruppere JavaFX RadioButton-forekomster i en ToggleGroup.
        ToggleGroup radioGruppe =  new ToggleGroup();
        // En ToggleGroup lar deg velge kun en RadioButton når som helst.

        autoGirBtn.setToggleGroup(radioGruppe);
        manuellGirBtn.setToggleGroup(radioGruppe);
        RadioButton rb = (RadioButton) radioGruppe.getSelectedToggle();
        String girkasse = rb.getText();
        return girkasse;


    }
   /* public Utstyr ekstra_Utstyr(){
        Utstyr ekstra_Utstyr = new Utstyr();
        if (HengerFeste_CheckBtn.isSelected()){
           // ekstra_Utstyr.isHengerfeste()==  true;
        }
    }*/
    public void register(){
        //Henter bil merke fra comboBox fra GUI
        String bilMerke = merkeBox.getValue();
        // Henter bil model fra GUI
        String bilModell = modelBox.getValue() ;
        // Henter ønsket drivstoff fra GUI
        String drivstoff = drivstoffBox.getValue();
        // Henter ønsket hestkreft fra GUI
        int hk_Gui = (int) hestSlider.getValue();

      //  Bil nyBil = new Bil(bilMerke, bilModell,  drivstoff, hk_Gui, girKasse() , );
    }

}
