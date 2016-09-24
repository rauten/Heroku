/**
 * Created by rileyauten on 5/24/16.
 */

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;


public class MenuScreen {

    @FXML
    private Button updateCompany;

    @FXML
    private Button updateTypeform;

    @FXML
    private Label welcomeLabel;

    @FXML
    private Label actionLabel;

    private Excel excel;

    @FXML
    private void initialize() {

        updateCompany.setOnAction(event -> {
            excel.closeScreen();
            excel.showFirstScreen();
        });
    }

    public final void setMainApp(final Excel mainApp) {
        this.excel = mainApp;
    }


}
