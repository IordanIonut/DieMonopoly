package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

public class OneDieController extends MainController implements Initializable {
    @FXML
    private Button choose1;

    @FXML
    private AnchorPane parent;

    @FXML
    private ImageView gif;

    @FXML
    private ImageView die;

    @FXML
    private Button roll;

    public void RollDIe(ActionEvent event) {
        Random random=new Random();
        int answer=random.nextInt(6)+1;
        if(answer==1){
            Image image=new Image("image/1.png");
            die.setImage(image);
        }else if(answer==2){
            Image image=new Image("image/2.png");
            die.setImage(image);
        }else if(answer==3){
            Image image=new Image("image/3.png");
            die.setImage(image);
        }else if(answer==4){
            Image image=new Image("image/4.png");
            die.setImage(image);
        }else if(answer==5){
            Image image=new Image("image/5.png");
            die.setImage(image);
        }else{
            Image image=new Image("image/6.png");
            die.setImage(image);
        }
    }

    public void ChooseDie(ActionEvent event) throws IOException {
        choose1.getScene().getWindow().hide();
        Stage signup=new Stage();
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Choose.fxml")));
        Scene scene=new Scene(root);
        signup.setScene(scene);
        signup.show();
    }

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
}
