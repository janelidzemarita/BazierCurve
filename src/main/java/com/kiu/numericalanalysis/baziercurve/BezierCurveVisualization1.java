package com.kiu.numericalanalysis.baziercurve;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

public class BezierCurveVisualization1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        // Create control points for the Bezier curve
        double startX = 100;
        double startY = 200;
        double controlX1 = 300;
        double controlY1 = 600;
        double endX = 500;
        double endY = 200;

        // Create the Bezier curve shape
        QuadCurve bezierQuadCurve = new QuadCurve();

        bezierQuadCurve.setStartY(startY);
        bezierQuadCurve.setStartY(startY);
        bezierQuadCurve.setStartX(startX);
        bezierQuadCurve.setStartY(startY);
        bezierQuadCurve.setControlX(controlX1);
        bezierQuadCurve.setControlY(controlY1);
        bezierQuadCurve.setEndX(endX);
        bezierQuadCurve.setEndY(endY);
        bezierQuadCurve.setStroke(Color.BLUE);

        bezierQuadCurve.setStrokeWidth(2);
        bezierQuadCurve.setFill(Color.BLACK);
        bezierQuadCurve.setOnMouseDragged(mouseEvent -> {
            bezierQuadCurve.setControlX(mouseEvent.getX());
            bezierQuadCurve.setControlY(mouseEvent.getY());
        });

        root.getChildren().add(bezierQuadCurve);

        // Create the scene and show the stage
        Scene scene = new Scene(root, 700, 700);
        primaryStage.setTitle("Bezier Curve 1 Point Visualization");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
