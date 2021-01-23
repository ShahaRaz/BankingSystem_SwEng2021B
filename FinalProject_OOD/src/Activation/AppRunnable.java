package Activation;

/*
 * @author Gadi Engelsman.
 * @author Shachar Raz.
 * */

import javafx.application.Application;
import javafx.stage.Stage;
import main.controller.Controller;

import main.model.Model;
import main.view.View;

public class AppRunnable extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Model theModel = new Model();
        View theView = new View(primaryStage);
        Controller TheController = new Controller(theModel, theView);
    }
}

//// _______________ REFERENCES _______________
//package FxActivation;
//
//
//        import controller.Controller;
//        import javafx.application.Application;
//        import javafx.stage.Stage;
//        import model.Model;
//        import view.View;
//
//public class AppRunable extends Application{
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Model theModel = new Model();
//        View theView = new View(primaryStage);
//        Controller TheController = new Controller(theModel, theView);
//    }
//    // in-order to set different players count, change NUMBER_OF_PLAYERS [to 2^n] in Model class
//
//}
