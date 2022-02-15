package sample;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button dark;

    @FXML
    private ImageView logo;

    @FXML
    private AnchorPane parent;

    @FXML
    private Button play;

    static boolean isLightMode=true;

    public void PlayGame(ActionEvent event) throws IOException {
        play.getScene().getWindow().hide();
        Stage signup=new Stage();
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Choose.fxml")));
        Scene scene=new Scene(root);
        signup.setScene(scene);
        signup.show();
        signup.setResizable(false);
    }

    public void LightDark(ActionEvent event) {
        isLightMode=!isLightMode;
        if(isLightMode){
            setLightMode();
        }
        else {
            setDarkMode();
        }
    }

    private void setLightMode(){
        parent.getStylesheets().remove("style/Dark.css");
        parent.getStylesheets().add("style/Light.css");
    }

    private void setDarkMode(){
        parent.getStylesheets().remove("style/Light.css");
        parent.getStylesheets().add("style/Dark.css");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
