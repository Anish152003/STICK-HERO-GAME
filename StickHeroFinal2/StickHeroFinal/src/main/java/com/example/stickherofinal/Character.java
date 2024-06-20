package com.example.stickherofinal;


import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Character {

    private ImageView imageView;

    private double xCoor;


    public Character(String imagePath) {
        Image image = new Image(imagePath);
        imageView = new ImageView(image);
        imageView.setLayoutX(59);
        imageView.setLayoutY(200);
        imageView.setFitWidth(37);
        imageView.setFitHeight(30);
        xCoor = imageView.getLayoutX();
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void move(double units) {
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), imageView);
        translateTransition.setToX(units);
        translateTransition.setOnFinished(event -> updateXCoor()); // Update xCoor after movement

        translateTransition.play();
    }
    private void updateXCoor() {
        xCoor = imageView.getLayoutX();
    }

    public void fall() {
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1), imageView);
        translateTransition.setToY(500);
        translateTransition.play();
    }
    public double getXCoor() {
        return xCoor;
    }

    // Add other methods or properties as needed
}