//package com.example.stickherofinal;
//
//import javafx.animation.TranslateTransition;
//import javafx.fxml.FXML;
//import javafx.scene.image.ImageView;
//import javafx.scene.input.MouseEvent;
//import javafx.util.Duration;
//
//public class heroPrasser {
//    @FXML
//    private ImageView imageView;
//
//    private TranslateTransition translateTransition;
//
//    @FXML
//    private void initialize() {
//        // Set up the translate transition
//        translateTransition = new TranslateTransition(Duration.seconds(1), imageView);
//    }
//
//    @FXML
//    private void handleImageClick(MouseEvent event) {
//        // Move the image using a transition
////        double newX = Math.random() * (600 - imageView.getFitWidth());
////        double newY = Math.random() * (400 - imageView.getFitHeight());
//
//        translateTransition.setToX(400);
////        translateTransition.setToY(newY - imageView.getLayoutY());
//
//        // Play the transition
//        translateTransition.play();
//    }
//}
