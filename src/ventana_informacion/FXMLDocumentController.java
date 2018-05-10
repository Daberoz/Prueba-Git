/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana_informacion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author 44889924l
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private TextArea tanumeros;
    @FXML
    private TextArea tahospitales;
    @FXML
    private Button btnumeros;
    @FXML
    private Button bthospitales;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        tanumeros.setText("Emergencias Médicas SAMU \n"
                + "Número: 15\n"
                + "\n"
                + "Policía\n"
                + "Número: 17\n"
                + "\n"
                + "Bomberos\n"
                + "Número: 18\n"
                + "\n"
                + "Consultas Médicas\n"
                + "Número: 12\n"
                + "\n"
                + "Número de Emergencia Europeo\n"
                + "Número: 112\n"
                + "\n"
                + "Centro Anti-Veneno\n"
                + "Número: 01 40 05 48 48\n"
                + "\n"
                + "Farmacia de 24 Horas\n"
                + "Número: 01 48 74 64 18 y 01 45 62 02 41\n"
                + "\n"
                + "Sercicio de Médicos a Domicilio\n"
                + "Número: 01 47 07 77 77 y 01 43 37 77 77\n"
                + "\n"
                + "Asistencia Vial 24 Horas\n"
                + "Número: 01 47 07 99 99");
    }

    @FXML
    private void handleButtonAction2(ActionEvent event) {
        tahospitales.setText("American Hospital en París (63 Boulevard Victor Hugo, 92200 Neuilly; 01 46 41 25 25 o 01 47 47 70 15 para las emergencias) \n"
                + "\n"
                + "Centro Quirúrgico Ambroise Parc (27 Blvd Victor Hugo 92200 Neuilly sur Seine París Francia 33 1 46 41 88 88)\n"
                + "\n"
                + "Bichat Claude-Bernard (46 rue Henri-Huchard, 75018 París, 33 1 40 25 80 80)\n"
                + "\n"
                + "Hôtel Dieu (1 place du Parvis Notre-Dame, 75004 París, 33 1 42 34 82 34)\n"
                + "\n"
                + "Broussais (96 rue Didot, 75014 París, 33 1 43 95 95 95)\n"
                + "\n"
                + "Cochin (27 rue du Faubourg Saint Jacques, 75014 París, 33 1 58 41 41 41)\n"
                + "\n"
                + "Pitié-Salpetrière (47-83 boulevard de l'Hôpital, 75013 París, 33 1 42 16 00 00)\n"
                + "\n"
                + "Hôpital Saint-Antoine (184 rue du Fauborg Saint-Antoine, 75012 París, 33 1 49 28 20 00)");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
