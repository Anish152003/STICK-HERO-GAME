package com.example.stickherofinal;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Random;

public class gameController {

    @FXML
    private Rectangle newRect0;
    @FXML
    private Rectangle newRect1;
    @FXML
    private Rectangle newRect2;
    @FXML
    private Rectangle newRect3;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMain(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private Character stickHero;
    private void createCharacter(){
        stickHero = new Character("char21.png");
        anchorPane.getChildren().add(stickHero.getImageView());
    }

    @FXML
    private void moveCharacter() {
        int lowerBound = (int) (newRect1.getLayoutX());
        int upperBound = (int) (lowerBound + newRect1.getWidth());
        double decider = stickHero.getXCoor();

        double moveUnits;
        if ((lowerBound <= decider) && (decider <= upperBound)) {
            moveUnits = (newRect1.getLayoutX() + newRect1.getWidth() - stickHero.getImageView().getFitWidth());
        } else {
            moveUnits = (stick.getStickLength()) + ((stick.getXCoor()) - (stickHero.getImageView().getLayoutX()) - (10));

            // Check if the character is moving ahead of the gap between two pillars
            double gapStartX = newRect1.getLayoutX() + newRect1.getWidth();
            double gapEndX = newRect2.getLayoutX();
            if (decider > gapStartX && decider < gapEndX) {
                // The character is over the gap, trigger the fall animation
                stickHero.fall();
            }
        }
        stickHero.move(moveUnits);
    }


    private Stick stick;
    private void createStick(){
        stick = new Stick((int)(newRect0.getLayoutX() + newRect0.getWidth()),(int)(newRect0.getLayoutY()));
        anchorPane.getChildren().add(stick.getStick());
    }
    boolean isDKeyPressed = false;
    Timeline extensionTimeline;

    @FXML
    void extendStick(KeyEvent event) {
        if (event.getCode() == KeyCode.D && !isDKeyPressed) {
            System.out.println("Key D pressed, extending line...");
            isDKeyPressed = true;
            startLineExtension();
        }
    }

    private void startLineExtension() {
        extensionTimeline = new Timeline(new KeyFrame(Duration.millis(50), event -> stick.extendLine()));
        extensionTimeline.setCycleCount(Timeline.INDEFINITE);
        extensionTimeline.play();
    }

    @FXML
    void stopStickExtension(KeyEvent event) {
        if (event.getCode() == KeyCode.D) {
            System.out.println("Key D released, stopping line extension...");
            isDKeyPressed = false;
            if (extensionTimeline != null) {
                extensionTimeline.stop();
            }
            startLineRotation();
            moveCharacter();
        }
    }


    private void startLineRotation() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(50), event -> stick.rotateLine(5)));
        timeline.setCycleCount(18);
        timeline.play();

    }

    private void createPillar(){

        Random random = new Random();

        newRect1.setWidth((random.nextInt(46) + 35));
        newRect2.setWidth((random.nextInt(46) + 35));
        int lastR = (random.nextInt(46) + 35);
        newRect3.setWidth(lastR);

        newRect1.setLayoutX((random.nextInt(100) + 155));
        System.out.println(newRect1.getLayoutX());
        newRect2.setLayoutX((random.nextInt(100) + 305));
        newRect3.setLayoutX(550-lastR);

    }

    @FXML
    public void initialize() {

        this.createPillar();
        this.createStick();
        this.createCharacter();
//        this.newRect0 = new Rectangle();
        this.newRect1 = new Rectangle();
        this.newRect2 = new Rectangle();
        this.newRect3 = new Rectangle();
    }


}
