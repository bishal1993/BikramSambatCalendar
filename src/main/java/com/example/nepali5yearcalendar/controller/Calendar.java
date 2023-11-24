package com.example.nepali5yearcalendar.controller;

import com.example.nepali5yearcalendar.NepaliCalendar;
import com.example.nepali5yearcalendar.NepaliMonth;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Calendar implements Initializable {
    @FXML
    public Button prevButton;
    @FXML
    public Button nextMonth;
    @FXML
    public Label englishYear;
    @FXML
    public Label nepaliYear;
    @FXML
    public ChoiceBox currentMonth;
    @FXML
    public ChoiceBox currentYearList;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.getCurrentMonth().setItems(FXCollections.observableArrayList(NepaliMonth.BAISAKH,NepaliMonth.JESTHA, NepaliMonth.ASAR,NepaliMonth.BHADAU,NepaliMonth.ASOJ,NepaliMonth.KARTIK,
                NepaliMonth.MANGSIR,NepaliMonth.POUSH,NepaliMonth.MAGH,NepaliMonth.FALGUN,NepaliMonth.CHAIT));
        this.getCurrentYearList().setItems(FXCollections.observableArrayList(2080,2081,2082,2083,2084,2085));
    }

    public Button getPrevButton() {
        return prevButton;
    }

    public Button getNextMonth() {
        return nextMonth;
    }

    public Label getEnglishYear() {
        return englishYear;
    }

    public Label getNepaliYear() {
        return nepaliYear;
    }

    public ChoiceBox getCurrentMonth() {
        return currentMonth;
    }

    public ChoiceBox getCurrentYearList() {
        return currentYearList;
    }

    /**
     *
     * Baisakh  ma prev gare, last year ko chaitra janu parxa ra chaitra
     * ma next ma click gare, next yr ko baisakh ma janu parxa.
     * ra open huda jaile ni current day, month dekhaunu parxa.
     */

}
