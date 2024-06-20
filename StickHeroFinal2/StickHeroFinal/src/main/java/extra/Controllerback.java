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
//import java.util.Random;
//import java.util.ResourceBundle;
//
//public class Controllerback implements Initializable {
//
//    private String s1 = "rectangle1";
//    private String s2 = "rectangle2";
//    private String s3 = "rectangle3";
//    private Rectangle rectangle1;
//    private Rectangle rectangle2;
//    private Rectangle rectangle3;
//
//    @FXML
//    private AnchorPane anchorPane;
//
//    private TranslateTransition transitionRectangle1;
//    private TranslateTransition transitionRectangle2;
//    private TranslateTransition transitionRectangle3;
//
//    public void start(ActionEvent event) {
////        resetRectangles();
//        rectangle1 = new Rectangle(165, 230,75,170);
//        rectangle2 = new Rectangle(400, 230,35,170);
//        rectangle3 = new Rectangle(600, 230,10,170);
//        anchorPane.getChildren().addAll(rectangle1,rectangle2);
////        transitionRectangle1.play();
////        transitionRectangle2.play();
////        transitionRectangle3.play();
//    }
//
//    public void newPillarGenerator() throws IOException {
//
//        Random random = new Random();
//
//        rectangle3 = new Rectangle(600, 230,10,170);
//
////        int randomWidth = random.nextInt(46) + 35;
////        rectangle3.setWidth(randomWidth);
////        rectangle1.setWidth(400);
////        System.out.println(rectangle1.getWidth());
//
//        anchorPane.getChildren().add(rectangle3);
//
//        transitionRectangle1 = new TranslateTransition(Duration.seconds(1), rectangle1);
//        transitionRectangle2 = new TranslateTransition(Duration.seconds(1), rectangle2);
//        transitionRectangle3 = new TranslateTransition(Duration.seconds(1), rectangle3);
////
//        System.out.println("r1");
//        System.out.println(rectangle1.getX());
//        System.out.println(rectangle1.getWidth());
//        transitionRectangle1.setToX(-300);
//        transitionRectangle1.play();
//
//        int a = (int) (300-(60+rectangle2.getWidth()));
//        System.out.println("r2");
//        System.out.println(rectangle2.getX());
//        System.out.println(rectangle2.getWidth());
//        transitionRectangle2.setToX(-a);
//        transitionRectangle2.play();
//
//        int xCoordinate = random.nextInt(101) + 200;
//        System.out.println("r3");
//        System.out.println(rectangle3.getX());
//        System.out.println(rectangle3.getWidth());
//        transitionRectangle3.setToX(-xCoordinate);
//        transitionRectangle3.play();
//
//
//        System.out.println(rectangle1.getX());
//        System.out.println(rectangle2.getX());
//        System.out.println(rectangle3.getX());
//
//        Rectangle temp = rectangle1;
//
//        rectangle1 = rectangle2;
//        rectangle2 = rectangle3;
//        rectangle3 = null;
////        rectangle3.setX(600);
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
