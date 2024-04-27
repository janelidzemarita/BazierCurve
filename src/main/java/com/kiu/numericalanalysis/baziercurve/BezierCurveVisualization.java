package com.kiu.numericalanalysis.baziercurve;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

public class BezierCurveVisualization extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        // Create control points for the Bezier curve
        double startX = 0;
        double startY = 0;
        double controlX1 = 600;
        double controlY1 = 0;
        double controlX2 = 200;
        double controlY2 = 350;
        double endX = 300;
        double endY = 0;

        // Create the Bezier curve shape
        CubicCurve bezierCurve = new CubicCurve();
        bezierCurve.setStartX(startX);
        bezierCurve.setStartY(startY);
        bezierCurve.setControlX1(controlX1);
        bezierCurve.setControlY1(controlY1);
        bezierCurve.setControlX2(controlX2);
        bezierCurve.setControlY2(controlY2);
        bezierCurve.setEndX(endX);
        bezierCurve.setEndY(endY);
        bezierCurve.setStroke(Color.BLUE);
        bezierCurve.setStrokeWidth(2);
        bezierCurve.setFill(Color.RED);

        root.getChildren().add(bezierCurve);

        // Create the scene and show the stage
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Bezier Curve Visualization");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
