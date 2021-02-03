package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    Label label = null;

    @FXML
    ProgressBar progressBar = null;


    public void onClickEvent(MouseEvent mouseEvent) {
        System.out.println("Button clicked");
        label.setText("Button clicked");
    }

    public void onDragDetectedEvent(MouseEvent mouseEvent) {
        System.out.println("Drag detected");
        label.setText("Drag detected");
    }

    public void onKeyPressed(KeyEvent keyEvent) {
        System.out.println("KeyPressed");

        if(keyEvent.getCode() == KeyCode.W) {
            progressBar.setRotate(progressBar.getRotate()+1);
            progressBar.setProgress(progressBar.getProgress()+0.01);
        }
        else if(keyEvent.getCode() == KeyCode.S) {
            progressBar.setRotate(progressBar.getRotate()-1);
            progressBar.setProgress(progressBar.getProgress()-0.01);
        }

        if(progressBar.getProgress() > 1) {
            progressBar.setProgress(0);
        }

    }

}
