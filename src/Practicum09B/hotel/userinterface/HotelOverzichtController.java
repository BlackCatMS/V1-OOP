package Practicum09B.hotel.userinterface;

import Practicum09B.hotel.HotelApp;
import Practicum09B.hotel.model.Boeking;
import Practicum09B.hotel.model.Hotel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class HotelOverzichtController {
    @FXML private Label hotelnaamLabel;
    @FXML private ListView boekingenListView;
    @FXML private DatePicker overzichtDatePicker;

    private Hotel hotel = Hotel.getHotel();

    public void initialize() {
        hotelnaamLabel.setText("Boekingen hotel " + hotel.getNaam());
        overzichtDatePicker.setValue(LocalDate.now());
        toonBoekingen();
    }

    public void toonVorigeDag(ActionEvent actionEvent) {
        LocalDate dagEerder = overzichtDatePicker.getValue().minusDays(1);
        overzichtDatePicker.setValue(dagEerder);
    }

    public void toonVolgendeDag(ActionEvent actionEvent) {
        LocalDate dagLater = overzichtDatePicker.getValue().plusDays(1);
        overzichtDatePicker.setValue(dagLater);
    }

    public void nieuweBoeking(ActionEvent actionEvent) throws Exception {
        Stage BoekingStage = new Stage();
        String fxmlPagina = "Boekingen.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPagina));
        Parent root = loader.load();

        BoekingStage.initModality(Modality.APPLICATION_MODAL);
        BoekingStage.setTitle("Nieuwe boeking");
        BoekingStage.setScene(new Scene(root));
        BoekingStage.showAndWait();

        toonBoekingen();
    }

    public void toonBoekingen() {
        ObservableList<String> boekingen = FXCollections.observableArrayList();
        List<Boeking> boekingList = hotel.getBoekingen();

        for (Boeking b : boekingList){
            if(b.getAankomstDatum().isBefore(overzichtDatePicker.getValue().plusDays(1)) && b.getVertrekDatum().isAfter(overzichtDatePicker.getValue().minusDays(1))){
                String s = "Van " + b.getAankomstDatum() + " tot " + b.getVertrekDatum() + " beschikt " + b.getBoeker().getNaam() + " over kamer " + b.getKamer().getKamerNummer() + ".";
                boekingen.add(s);
            }
        }
        boekingenListView.setItems(boekingen);
    }
}