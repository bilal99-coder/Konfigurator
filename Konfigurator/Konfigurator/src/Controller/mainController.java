package Controller;

import Model.Bil;
import Model.Utstyr;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import prisData.prisData;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class mainController implements Initializable {
    public boolean erAutomat;
    public String farge;
    @FXML
    private ComboBox<String> merkeBox;

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
    private RadioButton metalikkLakkBtn;
    @FXML
    private RadioButton standardLakkBtn;
    @FXML
    private Label lblTotalPris;
    @FXML
    private Label sliderValue;

    @FXML
    void hkSliderOnAction(MouseEvent event) {
        //Henter ønsker hestkreft verdien og printer den ut i GUI
        int hk_Gui = (int) hestSlider.getValue();
        sliderValue.setText(hk_Gui + "");
    }

    @FXML
    private CheckBox HengerFeste_CheckBtn;

    @FXML
    private CheckBox radioDab_checkBtn;

    @FXML
    private CheckBox NavigasjonPakke_checkBtn;

    @FXML
    private CheckBox klimapakke_checkBtn;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        merkeBox.getItems().addAll("Audi", "Volvo", "Nissan");
        modelBox.getItems().addAll("Velg en bil merke først!");
        drivstoffBox.getItems().addAll("Elektrisitet", "Bensin", "Diesel", "Hybrid");
        museInn_IFarge();

    }

    public void changeModell(ActionEvent event) {
        String Merke = merkeBox.getValue();
        modelBox.getItems().clear();
        if (merkeBox.getValue().equals("Audi")) {

            modelBox.getItems().addAll("A3", "A5", "A6", "Q5", "Q7", "Q8", "RS3");
        } else if (Merke.equals("Volvo")) {

            modelBox.getItems().addAll("XC40", "XC60", "XC90", "S60");

        } else if (Merke.equals("Nissan")) {
            modelBox.getItems().addAll("Leaf", "Qashqai", "GTR");

        } else
            modelBox.getItems().addAll("Velg en merke!");

    }

    @FXML
    void autoGirSelected(ActionEvent event) {
        manuellGirBtn.setSelected(false);
        erAutomat = true;
    }

    @FXML
    void manGirSelected(ActionEvent event) {
        autoGirBtn.setSelected(false);
        erAutomat = false;
    }
    @FXML
    void metalikkLakkBtn_onAction(ActionEvent event) {
        standardLakkBtn.setSelected(false);
    }
    @FXML
    void standardLakkBtnOnAction(ActionEvent event) {
        metalikkLakkBtn.setSelected(false);
    }
    @FXML
    private Button blåFarge;

    @FXML
    private Button hvitFarge;

    @FXML
    private Button rødFarge;

    @FXML
    private Button grønnFarge;

    @FXML
    private Button svartFarge;

    @FXML
    private Label valgtFarge;


    @FXML
    void blåOnAction(ActionEvent event) {
        farge = "Blå";
    }

    @FXML
    void hvitOnAction(ActionEvent event) {
        farge = "Hvit";
    }

    @FXML
    void grønnOnAction(ActionEvent event) {
        farge = "Grønn";
    }

    @FXML
    void rødOnAction(ActionEvent event) {
        farge = "Rød";
    }

    @FXML
    void svartOnAction(ActionEvent event) {
        farge = "Svart";
    }


    //En metode som handler når muse rør en av de farge knappene
    public void museInn_IFarge() {
        List<Button> fargeButton = new ArrayList<Button>();
        fargeButton.add(grønnFarge);
        fargeButton.add(rødFarge);
        fargeButton.add(hvitFarge);
        fargeButton.add(svartFarge);
        fargeButton.add(blåFarge);
        for (Button btn : fargeButton) {
            btn.setOnMouseEntered(e -> {
                 if (btn == grønnFarge) {
                    valgtFarge.setText("Farge er grønn");
                } else if (btn == blåFarge) {
                    valgtFarge.setText("Farge er blå");
                } else if (btn == hvitFarge) {
                    valgtFarge.setText("Farge er hvit");
                } else if (btn == rødFarge) {
                    valgtFarge.setText("Farge er rød");
                } else valgtFarge.setText("Farge er svart");
            });

            btn.setOnMouseExited(e -> valgtFarge.setText(""));
        }
    }



    public Utstyr ekstra_Utstyr() {
        Utstyr ekstra_Utstyr = new Utstyr();
        if (HengerFeste_CheckBtn.isSelected()) {
            ekstra_Utstyr.setHengerfeste(true);
        }
        if (radioDab_checkBtn.isSelected()) {
            ekstra_Utstyr.setRadioDab(true);
        }
        if (NavigasjonPakke_checkBtn.isSelected()) {
            ekstra_Utstyr.setNavigasjonPakke(true);
        }
        if (klimapakke_checkBtn.isSelected()) {
            ekstra_Utstyr.setKlimmaPakke(true);
        }
        return ekstra_Utstyr;
    }
    @FXML
    public void register(ActionEvent event) {
        //Henter bil merke fra comboBox fra GUI
        String bilMerke = merkeBox.getValue();
        // Henter bil model fra GUI
        String bilModell = modelBox.getValue();
        // Henter ønsket drivstoff fra GUI
        String drivstoff = drivstoffBox.getValue();
        // Henter ønsket hestkreft fra GUI
        int hk_Gui = (int) hestSlider.getValue();

         Bil nyBil = new Bil(bilMerke, bilModell,  drivstoff, hk_Gui, erAutomat, farge, ekstra_Utstyr());

        //Henter opprinnelig prisen fra Gui
        prisData prisListe = new prisData();
        int opprinnelig_pris = prisListe.beregn(bilMerke, bilModell);
        System.out.println(opprinnelig_pris);
        // beregner ekstra kostnader relatert til ekstra utstyr
        int final_pris = opprinnelig_pris  ;
        if (erAutomat){ final_pris +=  1500;}
        if(nyBil.getMinUtstyr().isHengerfeste()){ final_pris += 2400 ;}
        if(nyBil.getMinUtstyr().isRadioDab()){ final_pris += 1650 ;}
        if(nyBil.getMinUtstyr().isNavigasjonPakke()){ final_pris +=13900 ;}
        if(nyBil.getMinUtstyr().isKlimmaPakke()){ final_pris=  final_pris += 5900 ;}
        if (metalikkLakkBtn.isSelected()){ final_pris +=13000;}
        lblTotalPris.setText(final_pris +"");
        System.out.println(final_pris );
    }

}
