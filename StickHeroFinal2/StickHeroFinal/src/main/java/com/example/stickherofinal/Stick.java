package com.example.stickherofinal;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;

// 6
public class Stick {

    private Line stick;
    private double stickHeight = 0;
    private double stickLength;


    public Stick(int initialX, int initialY) {
        this.stick = new Line();
        this.stick.setLayoutX(initialX);
        this.stick.setLayoutY(initialY);
        this.stick.setStroke(Color.RED);
        this.stick.setStrokeWidth(4);
        this.stick.setEndY(stickHeight);
    }

    public Line getStick() {
        return stick;
    }
    public void extendLine() {
            stickHeight-=5;
            this.stick.setEndY(stickHeight);
    }

    public void rotateLine(int i) {
            Rotate rotate = new Rotate(i);
            stick.getTransforms().add(rotate);
    }


    public double getStickLength() {
        stickLength = 0;
        stickLength += (-1)*stickHeight;
//        System.out.println(stickLength);
        return stickLength;
    }

    public double getStickEnd(){
        return this.stick.getEndX();
    }



    public double getXCoor() {
        return stick.getLayoutX();
    }


}
