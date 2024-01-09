package org.example.lab3_cp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private TextField SetColor;
    @FXML
    private TextField SetCountOfAngles;
    @FXML
    private Label TestLabel;
    @FXML
    private Canvas FigureCanvas;
    @FXML
    private void click() {
        var ctx = FigureCanvas.getGraphicsContext2D();
        ctx.clearRect(0,0,300,300);
        if(SetCountOfAngles.getText().equals("3"))
        {
            ctx.beginPath();
            ctx.moveTo(150, 0);
            ctx.lineTo(300, 150);
            ctx.lineTo(0, 150);
            ctx.setFill(Color.web(SetColor.getText()));
            ctx.fill();
        }
        else if(SetCountOfAngles.getText().equals("4"))
        {
            ctx.setFill(Color.web(SetColor.getText()));
            ctx.fillRect(0, 0, 300, 300);
        }
        else if(SetCountOfAngles.getText().equals("5"))
        {
            ctx.beginPath();
            ctx.moveTo(150, 0);
            ctx.lineTo(300, 150);
            ctx.lineTo(300, 300);
            ctx.lineTo(0, 300);
            ctx.lineTo(0, 150);
            ctx.setFill(Color.web(SetColor.getText()));
            ctx.fill();
        }
        else
        {
            TestLabel.setText("Enter a number from 3 to 5!!!");
        }
    }
}