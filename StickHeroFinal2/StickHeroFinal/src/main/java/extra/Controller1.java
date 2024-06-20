//package com.example.stickherofinal;
//
//import javafx.animation.TranslateTransition;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//import java.io.IOException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.ResourceBundle;
//
//public class Controller1 implements Initializable {
//
//    private ArrayList<Rectangle> pillar = new ArrayList<>();
//    private Rectangle rectangle0;
//    private Rectangle rectangle1;
//    private Rectangle rectangle2;
//
//    @FXML
//    private AnchorPane anchorPane;
//
//    private TranslateTransition transitionRectangle0;
//    private TranslateTransition transitionRectangle1;
//    private TranslateTransition transitionRectangle2;
//
//    public void start(ActionEvent event) {
////        resetRectangles();
//        rectangle0 = new Rectangle(165, 230,75,170);
//        rectangle1 = new Rectangle(400, 230,35,170);
//        rectangle2 = new Rectangle(600, 230,10,170);
//
//        anchorPane.getChildren().addAll(rectangle0, rectangle1, rectangle2);
//
//        pillar.add(rectangle0);
//        pillar.add(rectangle1);
//        pillar.add(rectangle2);
//
//    }
//
//    public void newPillarGenerator() {
//
//        Rectangle newRect = new Rectangle(600, 230,10,170);
//
//        Random random = new Random();
//        int randomWidth = random.nextInt(46) + 35;
//        newRect.setWidth(randomWidth);
//
//        pillar.set(2,newRect);
//        anchorPane.getChildren().add(pillar.get(2));
//
//
//
//
//        transitionRectangle0 = new TranslateTransition(Duration.seconds(1), pillar.get(0));
//        transitionRectangle1 = new TranslateTransition(Duration.seconds(1), pillar.get(1));
//        transitionRectangle2 = new TranslateTransition(Duration.seconds(1), pillar.get(2));
//
//
//        transitionRectangle0.setToX(-300);
//        transitionRectangle0.play();
//
//        int a = (int) ( 300 - ( 60+( (pillar.get(1) ).getWidth() ) ) );
//        transitionRectangle1.setToX(a*(-1));
//        transitionRectangle1.play();
//
//        int xCoordinate = random.nextInt(201) + 100;
//        transitionRectangle2.setToX(xCoordinate*(-1));
//        transitionRectangle2.play();
//
//        Rectangle r1_0 = pillar.get(1);
//        Rectangle r2_1 = pillar.get(2);
//
//        pillar.set(0, r1_0);
//        pillar.set(1, r2_1);
//        pillar.set(1, null);
//
//
////
////
////        ( pillar.get(0) ).setX(600);
////        Rectangle temp = pillar.get(0);
////        pillar.set( 0, pillar.get(1) );
////        pillar.set( 1, pillar.get(2) );
////        pillar.set( 2, temp );
//
//
//    }
//
//    @FXML
//    private Stage stage;
//    private Scene scene;
//    private Parent root;
//
//    public void switchToPlay(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("PlayScene.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
////        initializeGame();
//    }
//
//    public void switchToMain(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public void switchToResume(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("PauseMenu.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//    }
//
////    public void newPillar(){
//////        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlayScene.fxml"));
////        PillarGenerator gameController = new PillarGenerator();
////        gameController.handleAddRectangleButton();
////    }
//
//
//}
//
//
//
//
//
