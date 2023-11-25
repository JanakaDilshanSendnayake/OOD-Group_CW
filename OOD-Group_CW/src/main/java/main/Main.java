package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import stake_holders.ClubAdvisor;
import stake_holders.Clubs;
import stake_holders.Student;


import java.util.ArrayList;

public class Main extends Application {

    public static ArrayList<Clubs> clubs;
    public static ClubAdvisor currentUser;
    public static Clubs currentClub;
    public static Student currentStudentUser;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml_files/Common/LoginOrRegister.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("SACMS");
        stage.setResizable(false);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
