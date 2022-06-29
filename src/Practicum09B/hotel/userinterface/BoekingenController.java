package Practicum09B.hotel.userinterface;

import Practicum09B.hotel.model.Hotel;
import Practicum09B.hotel.model.Kamer;
import Practicum09B.hotel.model.KamerType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class BoekingenController {

    public void initialize(){
        ObservableList<KamerType> kamerTypenJavaFX = FXCollections.observableArrayList();
        List<KamerType> kamerTypen;
        kamerTypen = Hotel.getHotel().getKamerTypen();
        for(KamerType k : kamerTypen){
            kamerTypenJavaFX.add(k);
        }
        AankomstDatumEntry.setValue(LocalDate.now());
        VertrekDatumEntry.setValue(LocalDate.now().plusDays(3));
        KamerTypeEntry.setItems(kamerTypenJavaFX);
    }

    @FXML
    private DatePicker AankomstDatumEntry;

    @FXML
    private TextField AdresEntry;

    @FXML
    private Button BoekButton;

    @FXML
    private ChoiceBox<KamerType> KamerTypeEntry;

    @FXML
    private TextField NaamEntry;

    @FXML
    private Button ResetButton;

    @FXML
    private DatePicker VertrekDatumEntry;

    @FXML
    private Label boekingLabel;

    @FXML
    // DONE: Herkansing: NaamEntry controle moet op Equals zijn, correcte error-handling of melding wanneer de data incorrect is ingevuld
    // DONE: Herkansing: Na elke check een aparte foutmelding geven op het scherm, niet in de console
    // Herkansing: Foute input moet niet een boeking alsnog insturen
    void MaakBoeking(ActionEvent event) {
        try {
        if (
                // Bij HK: De entry checks controleerden of de text fiels "null" waren. Dat was niet het geval,
                // de value was namelijk "", en niet null. Nu controleert het op
                NaamEntry.getText() != "" &&
                AdresEntry.getText() != "" &&
                AankomstDatumEntry.getValue().isAfter(LocalDate.now().minusDays(1)) &&
                AankomstDatumEntry.getValue().isBefore(VertrekDatumEntry.getValue()) &&
                KamerTypeEntry.getValue() != null) {
                    Hotel.getHotel().voegBoekingToe(
                            AankomstDatumEntry.getValue(),
                            VertrekDatumEntry.getValue(),
                            NaamEntry.getText(),
                            AdresEntry.getText(),
                            KamerTypeEntry.getValue());
        } else if (NaamEntry.getText() == null) {
            boekingLabel.setText("Uw naam is niet ingevuld!");
        } else if (AdresEntry.getText() == null) {
            boekingLabel.setText("Adres is niet ingevuld!");
        } else if (!AankomstDatumEntry.getValue().isAfter(LocalDate.now().minusDays(1))) {
            boekingLabel.setText("De aankomstdatum is in het verleden!");
        } else if (!AankomstDatumEntry.getValue().isBefore(VertrekDatumEntry.getValue())) {
            boekingLabel.setText("De aankomstdatum is voor de vertrekdatum!");
        } else if (KamerTypeEntry.getValue() == null) {
            boekingLabel.setText("Er is geen kamertype gekozen!");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ResetBoekingen(ActionEvent event) {
        NaamEntry.setText("");
        AdresEntry.setText("");
        AankomstDatumEntry.setValue(LocalDate.now());
        VertrekDatumEntry.setValue(LocalDate.now().plusDays(3));

        ObservableList<KamerType> kamerTypenJavaFX = FXCollections.observableArrayList();
        List<KamerType> kamerTypen = new ArrayList<KamerType>();
        kamerTypen = Hotel.getHotel().getKamerTypen();
        for(KamerType k : kamerTypen){
            kamerTypenJavaFX.add(k);
        }
        KamerTypeEntry.setItems(kamerTypenJavaFX);
    }

}
