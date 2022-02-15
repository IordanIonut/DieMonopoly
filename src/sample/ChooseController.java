package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ChooseController extends MainController implements Initializable {

    @FXML
    private AnchorPane parent;

    @FXML
    private Button monopoly;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(isLightMode){
            setLight();
        }
        else{
            setDark();
        }
    }

    public void setDark(){
        parent.getStylesheets().remove("style/Light.css");
        parent.getStylesheets().add("style/Dark.css");
    }

    public void setLight(){
        parent.getStylesheets().remove("style/Dark.css");
        parent.getStylesheets().add("style/Light.css");
    }

    public void OneDie(ActionEvent event) throws IOException {
        one.getScene().getWindow().hide();
        Stage signup=new Stage();
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("OneDie.fxml")));
        Scene scene=new Scene(root);
        signup.setScene(scene);
        signup.show();
        signup.setResizable(false);
    }

    public void TwoDie(ActionEvent event) throws IOException {
        two.getScene().getWindow().hide();
        Stage signup=new Stage();
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TwoDie.fxml")));
        Scene scene=new Scene(root);
        signup.setScene(scene);
        signup.show();
        signup.setResizable(false);
    }

    public void MonopolyDie(ActionEvent event) throws IOException {
        monopoly.getScene().getWindow().hide();
        Stage signup=new Stage();
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MonopolyDie.fxml")));
        Scene scene=new Scene(root);
        signup.setScene(scene);
        signup.show();
        signup.setResizable(false);
    }
}
