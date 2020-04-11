package sample;

import javafx.scene.control.Alert;

// Validerer at feltene ikke er tomme.
class Validering {
    private boolean validereFelt() {
        if (modelBox.getValue().isEmpty() | merkeBox.getValue().isEmpty()
                | drivstoffBox.getValue().isEmpty()) ;
        {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Valider Felt");
            alert.setHeaderText(null);
            alert.setContentText("Fyll ut alle felt");
            alert.showAndWait();

            return false;
        }
    }
     tableView.setEditable(true); // Gjøre tabellen redigerbar med tableview. 
}


