package com.example.films_testpaper;


import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class InitController {

    @FXML
    private void toChoose() throws IOException {
        FilmApp.setRoot("choose");
    }

    @FXML
    private TableView<Film> tableFilms;

    @FXML
    private TableColumn<Film, Integer> idColumn;

    @FXML
    private TableColumn<Film, String> nameColumn;

    @FXML
    private TableColumn<Film, String> genreColumn;

    @FXML
    private TableColumn<Film, String> durationColumn;

    @FXML
    private TableColumn<Film, String> yearColumn;


}
