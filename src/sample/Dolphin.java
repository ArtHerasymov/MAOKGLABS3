package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Dolphin extends Application {
    public static void main(String args[]) {
        Application.launch(Dolphin.class, args);
    }

    private void formBody(Group root){
        Path path = new Path();
        MoveTo moveTo = new MoveTo();
        moveTo.setX(135.0f);
        moveTo.setY(80.0f);

        QuadCurveTo quadTo = new QuadCurveTo();
        quadTo.setControlX(200.0f);
        quadTo.setControlY(0.0f);
        quadTo.setX(260.0f);
        quadTo.setY(80.0f);

        LineTo line1 = new LineTo();
        line1.setY(100.0f);
        line1.setX(265.0f);

        QuadCurveTo nose = new QuadCurveTo();
        nose.setControlX(315.0f);
        nose.setControlY(145.0f);
        nose.setX(251.0f);
        nose.setY(145.0f);

        LineTo line2 = new LineTo();
        line2.setX(245.0f);
        line2.setY(180.0f);

        LineTo line3 = new LineTo();
        line3.setX(225.0f);
        line3.setY(163.0f);

        QuadCurveTo quad3 = new QuadCurveTo();
        quad3.setControlX(210.0f);
        quad3.setControlY(190.0f);
        quad3.setX(225.0f);
        quad3.setY(210.0f);

        LineTo line4 = new LineTo();
        line4.setX(255.0f);
        line4.setY(230.0f);

        QuadCurveTo quad4 = new QuadCurveTo();
        quad4.setControlX(241.0f);
        quad4.setControlY(250.0f);
        quad4.setX(220.0f);
        quad4.setY(240.0f);

        LineTo line5 = new LineTo();
        line5.setX(205.0f);
        line5.setY(266.0f);

        QuadCurveTo quad5 = new QuadCurveTo();
        quad5.setControlX(180.0f);
        quad5.setControlY(250.0f);
        quad5.setX(190.0f);
        quad5.setY(228.0f);

        LineTo line6 = new LineTo();
        line6.setX(190.0f);
        line6.setY(216.0f);

        QuadCurveTo quad6 = new QuadCurveTo();
        quad6.setControlX(145.0f);
        quad6.setControlY(200.0f);
        quad6.setX(129.0f);
        quad6.setY(124.0f);

        LineTo line7 = new LineTo();
        line7.setX(104.0f);
        line7.setY(109.0f);

        QuadCurveTo quad7 = new QuadCurveTo();
        quad7.setControlX(110.0f);
        quad7.setControlY(90.0f);
        quad7.setX(135.0f);
        quad7.setY(80.0f);


        path.getElements().add(moveTo);
        path.getElements().add(quadTo);
        path.getElements().add(line1);
        path.getElements().add(nose);
        path.getElements().add(line2);
        path.getElements().add(line3);
        path.getElements().add(quad3);
        path.getElements().add(line4);
        path.getElements().add(quad4);
        path.getElements().add(line5);
        path.getElements().add(quad5);
        path.getElements().add(line6);
        path.getElements().add(quad6);
        path.getElements().add(line7);
        path.getElements().add(quad7);

        path.setFill(Color.rgb(48, 162, 215));
        path.setStrokeWidth(2.0f);

        root.getChildren().add(path);
    }

    private void formChest(Group root) {
        Path chest = new Path();
        MoveTo moveTo1 = new MoveTo();
        moveTo1.setX(194.0f);
        moveTo1.setY(130.0f);

        QuadCurveTo chestForm1 = new QuadCurveTo();
        chestForm1.setControlX(210.0f);
        chestForm1.setControlY(178.0f);
        chestForm1.setX(230.0f);
        chestForm1.setY(136.0f);

        QuadCurveTo chestForm2 = new QuadCurveTo();
        chestForm2.setControlX(231.0f);
        chestForm2.setControlY(140.0f);
        chestForm2.setX(225.0f);
        chestForm2.setY(163.0f);

        QuadCurveTo chestForm3 = new QuadCurveTo();
        chestForm3.setControlX(210.0f);
        chestForm3.setControlY(190.0f);
        chestForm3.setX(225.0f);
        chestForm3.setY(210.0f);

        QuadCurveTo chestForm4 = new QuadCurveTo();
        chestForm4.setControlX(195.0f);
        chestForm4.setControlY(190.0f);
        chestForm4.setX(194.0f);
        chestForm4.setY(130.0f);

        chest.getElements().add(moveTo1);
        chest.getElements().add(chestForm1);
        chest.getElements().add(chestForm2);
        chest.getElements().add(chestForm3);
        chest.getElements().add(chestForm4);

        chest.setFill(Color.rgb(232, 147, 150));

        root.getChildren().add(chest);
    }

    private void formHand(Group root){
        Circle circle1 = new Circle();
        circle1.setCenterX(155.0f);
        circle1.setCenterY(100.0f);
        circle1.setRadius(8.0f);
        circle1.setFill(Color.rgb(105,105,178));
        root.getChildren().add(circle1);

        Circle circle2 = new Circle();
        circle2.setCenterX(150.0f);
        circle2.setCenterY(125.0f);
        circle2.setRadius(7.0f);
        circle2.setFill(Color.rgb(105,105,178));
        root.getChildren().add(circle2);

        Circle circle3 = new Circle();
        circle3.setCenterX(150.0f);
        circle3.setCenterY(150.0f);
        circle3.setRadius(6.0f);
        circle3.setFill(Color.rgb(105,105,178));
        root.getChildren().add(circle3);

        Polyline hand = new Polyline();
        hand.getPoints().addAll(164.0, 160.0,
                183.0, 180.0,
                185.0, 166.0,
                188.0, 160.0,
                189.0, 156.0,
                189.0, 154.0,
                189.0, 153.0,
                188.0, 150.0);
        hand.setStrokeWidth(2.0);
        root.getChildren().add(hand);

        QuadCurve lowerQuad = new QuadCurve();
        lowerQuad.setStartX(265.0f);
        lowerQuad.setStartY(100.0f);
        lowerQuad.setEndX(225.0f);
        lowerQuad.setEndY(100.0f);
        lowerQuad.setControlX(244.0f);
        lowerQuad.setControlY(94.0f);
        lowerQuad.setFill(Color.rgb(48, 162, 215));
        lowerQuad.setStroke(Color.BLACK);
        lowerQuad.setStrokeWidth(1.0);

        root.getChildren().add(lowerQuad);
    }

    private void formFace(Group root){
        Circle eyeForm1 = new Circle();
        eyeForm1.setCenterX(225.0f);
        eyeForm1.setCenterY(90.0f);
        eyeForm1.setRadius(8.0f);
        eyeForm1.setFill(Color.WHITE);
        eyeForm1.setStroke(Color.BLACK);
        eyeForm1.setStrokeWidth(1.5);
        root.getChildren().add(eyeForm1);

        Circle innerCircle1 = new Circle();
        innerCircle1.setCenterX(226.0f);
        innerCircle1.setCenterY(93.0f);
        innerCircle1.setRadius(4.0f);
        innerCircle1.setFill(Color.BLACK);
        innerCircle1.setStroke(Color.BLACK);
        innerCircle1.setStrokeWidth(1.0);
        root.getChildren().add(innerCircle1);

        Circle eyeForm2 = new Circle();
        eyeForm2.setCenterX(245.0f);
        eyeForm2.setCenterY(87.0f);
        eyeForm2.setRadius(8.0f);
        eyeForm2.setFill(Color.WHITE);
        eyeForm2.setStroke(Color.BLACK);
        eyeForm2.setStrokeWidth(1.5);
        root.getChildren().add(eyeForm2);

        Circle innerCircle2 = new Circle();
        innerCircle2.setCenterX(246.0f);
        innerCircle2.setCenterY(90.0f);
        innerCircle2.setRadius(4.0f);
        innerCircle2.setFill(Color.BLACK);
        innerCircle2.setStroke(Color.BLACK);
        innerCircle2.setStrokeWidth(1.0);
        root.getChildren().add(innerCircle2);

        QuadCurve mouthForm = new QuadCurve();
        mouthForm.setStartX(194.0f);
        mouthForm.setStartY(110.0f);
        mouthForm.setEndX(224.0f);
        mouthForm.setEndY(135.0f);
        mouthForm.setControlX(210.0f);
        mouthForm.setControlY(168.0f);
        mouthForm.setFill(Color.rgb(201, 36, 35));
        mouthForm.setStroke(Color.BLACK);
        mouthForm.setStrokeWidth(1.5);
        root.getChildren().add(mouthForm);

        QuadCurve lowerQuad = new QuadCurve();
        lowerQuad.setStartX(251.0f);
        lowerQuad.setStartY(145.0f);
        lowerQuad.setEndX(194.0f);
        lowerQuad.setEndY(110.0f);
        lowerQuad.setControlX(210.0f);
        lowerQuad.setControlY(134.0f);
        lowerQuad.setFill(Color.rgb(48, 162, 215));
        lowerQuad.setStroke(Color.BLACK);
        lowerQuad.setStrokeWidth(1.0);
        root.getChildren().add(lowerQuad);

        QuadCurve rightQuad = new QuadCurve();
        rightQuad.setStartX(225.0f);
        rightQuad.setStartY(163.0f);
        rightQuad.setEndX(230.0f);
        rightQuad.setEndY(138.0f);
        rightQuad.setControlX(230.0f);
        rightQuad.setControlY(140.0f);
        rightQuad.setFill(Color.rgb(48, 162, 215));
        rightQuad.setStroke(Color.BLACK);
        rightQuad.setStrokeWidth(1.0);
        root.getChildren().add(rightQuad);

        QuadCurve leftBrow = new QuadCurve();
        leftBrow.setStartX(218.0f);
        leftBrow.setStartY(80.0f);
        leftBrow.setEndX(230.0f);
        leftBrow.setEndY(80.0f);
        leftBrow.setControlX(224.0f);
        leftBrow.setControlY(75.0f);
        leftBrow.setFill(Color.rgb(48, 162, 215));
        leftBrow.setStroke(Color.BLACK);
        leftBrow.setStrokeWidth(1.5);
        root.getChildren().add(leftBrow);

        QuadCurve rightBrow = new QuadCurve();
        rightBrow.setStartX(238.0f);
        rightBrow.setStartY(78.0f);
        rightBrow.setEndX(249.0f);
        rightBrow.setEndY(76.0f);
        rightBrow.setControlX(242.0f);
        rightBrow.setControlY(73.0f);
        rightBrow.setFill(Color.rgb(48, 162, 215));
        rightBrow.setStroke(Color.BLACK);
        rightBrow.setStrokeWidth(1.5);
        root.getChildren().add(rightBrow);
    }

    private void setupAnimation(Group root) {

        int counter = 2;
        int scope = 4000;

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(scope), root);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setCycleCount(counter);
        scaleTransition.setAutoReverse(true);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(scope), root);
        translateTransition.setFromX(50);
        translateTransition.setToX(750);
        translateTransition.setCycleCount(counter+2);
        translateTransition.setAutoReverse(true);

        RotateTransition rotateTransition = new RotateTransition(Duration.millis(scope), root);
        rotateTransition.setByAngle(180f);
        rotateTransition.setCycleCount(counter);
        rotateTransition.setAutoReverse(true);

        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.millis(scope), root);
        scaleTransition2.setToX(0.5);
        scaleTransition2.setToY(0.5);
        scaleTransition2.setCycleCount(counter);
        scaleTransition2.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(
                translateTransition,
                scaleTransition,
                rotateTransition,
                scaleTransition2
        );

        parallelTransition.setCycleCount(Timeline.INDEFINITE);
        parallelTransition.play();
    }


    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 1200, 600);

        // Creating dolphin
        formBody(root);
        formChest(root);
        formHand(root);
        formFace(root);

        //Setting up animation
        setupAnimation(root);

        primaryStage.setTitle("Herasymov|KP-61|Lab3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
