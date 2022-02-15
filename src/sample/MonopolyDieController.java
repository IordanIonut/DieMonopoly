package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

public class MonopolyDieController extends MainController implements Initializable {
    @FXML
    private Button choose;

    @FXML
    private AnchorPane parent;

    @FXML
    private ImageView die1;

    @FXML
    private ImageView die2;

    @FXML
    private ImageView die3;

    @FXML
    private ImageView fffffff;

    @FXML
    private Button roll;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(isLightMode){
            setLight();
        }else{
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

    public void ChooseDie(ActionEvent event) throws IOException {
        choose.getScene().getWindow().hide();
        Stage signup=new Stage();
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Choose.fxml")));
        Scene scene=new Scene(root);
        signup.setScene(scene);
        signup.show();
    }

    public void RollDie(ActionEvent event) {
        Random random1=new Random();
        int answer1=random1.nextInt(6)+1;
        int answer2=random1.nextInt(6)+1;
        int answer3=random1.nextInt(6)+1;
        if(answer1==1){
            Image image=new Image("image/1.png");
            die1.setImage(image);
        }else if(answer1==2){
            Image image=new Image("image/2.png");
            die1.setImage(image);
        }else if(answer1==3){
            Image image=new Image("image/3.png");
            die1.setImage(image);
        }else if(answer1==4){
            Image image=new Image("image/4.png");
            die1.setImage(image);
        }else if(answer1==5){
            Image image=new Image("image/5.png");
            die1.setImage(image);
        }else{
            Image image=new Image("image/6.png");
            die1.setImage(image);
        }
        if(answer2==1){
            Image image=new Image("image/1.png");
            die2.setImage(image);
        }else if(answer2==2){
            Image image=new Image("image/2.png");
            die2.setImage(image);
        }else if(answer2==3){
            Image image=new Image("image/3.png");
            die2.setImage(image);
        }else if(answer2==4){
            Image image=new Image("image/4.png");
            die2.setImage(image);
        }else if(answer2==5){
            Image image=new Image("image/5.png");
            die2.setImage(image);
        }else{
            Image image=new Image("image/6.png");
            die2.setImage(image);
        }
        if(answer3==1){
            Image image=new Image("image/1.png");
            die3.setImage(image);
        }else if(answer3==2){
            Image image=new Image("image/2.png");
            die3.setImage(image);
        }else if(answer3==3){
            Image image=new Image("image/3.png");
            die3.setImage(image);
        }else if(answer3==4){
            Image image=new Image("image/bus.png");
            die3.setImage(image);
        }else if(answer3==5){
            Image image=new Image("image/5.png");
            die3.setImage(image);
        }else{
            Image image=new Image("image/monopoly.png");
            die3.setImage(image);
        }
    }
}
