package Practicum09B.hotel.userinterface;

import Practicum09B.hotel.model.Hotel;
import Practicum09B.hotel.model.KamerType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
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
    void MaakBoeking(ActionEvent event) {
        try{
        if(NaamEntry.getText()!=null && AdresEntry.getText()!=null && AankomstDatumEntry.getValue().isAfter(LocalDate.now().minusDays(1)) && AankomstDatumEntry.getValue().isBefore(VertrekDatumEntry.getValue()) && KamerTypeEntry.getValue()!=null){
            Hotel.getHotel().voegBoekingToe(AankomstDatumEntry.getValue(), VertrekDatumEntry.getValue(), NaamEntry.getText(), AdresEntry.getText(), KamerTypeEntry.getValue());
        }else{
            System.out.println("Niet alle gegevens zijn ingevuld!");
        }
        }catch (Exception e) {
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
