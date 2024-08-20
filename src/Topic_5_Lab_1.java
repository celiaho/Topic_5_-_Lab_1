/* *****************************************
 *  File : Topic_5_Lab_1.java
 *  Author : Celia Ho		// Celia Ho   
 *  Last Modified : Thu Mar 14 2024
 *  Description : Create a JavaFX application.

Set the title of the application to be Topic 5 Lab 1 <Your Name> where Your Name  is your actual name.

Use a VBox layout. In the VBox layout, put:
A Label with the text "Don't touch things"
A Button with the Label "press me"
A Circle with a radius of 25, a stroke with the Color BLUE and fill with the Color ALICEBLUE

ZIP your ENTIRE project and upload it.
 * ******************************************/

// FILE IMPORT SECTION
import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;


public class Topic_5_Lab_1 extends Application {
  @ Override  // Override the start method in the Application class
  public void start(Stage primaryStage) throws Exception {

    // Create a VBox
    VBox pane = new VBox();

    // Create a pane and set its properties
    // Flowpane pane = new FlowPane();
    pane.setPadding(new Insets(11, 12, 13, 14));
    
    // Create a label
    Label lbl = new Label("Don't touch things");
    
    // Create a button
    Button btPressMe = new Button("press Me");
    
    // Create a circle
    Circle circle = new Circle();
    circle.setCenterX(100);
    circle.setCenterY(100);
    circle.setRadius(25);
    circle.setStroke(Color.BLUE);
    circle.setFill(Color.ALICEBLUE);  

    pane.getChildren().addAll(lbl, btPressMe, circle);  // Add all the widgets to the pane
    pane.setPadding(new Insets(25));  // Sets padding around pane
    pane.setSpacing(20);              // Sets vertical spacing between widgets

    // Create a scene and place it in the stage
    Scene scene = new Scene (pane, 200, 250);
    primaryStage.setTitle("Topic 5 Lab 1 <Celia Ho>");  // Set the stage title
    primaryStage.setScene(scene);    // Place the scene in the stage
    primaryStage.show();             // Display the stage
  }

  // MAIN SECTION
  /** 
   * The main method is only needed for the IDE with limited JavaFX support. Not needed for running
   * from the command line.
  */
  public static void main(String[] args) throws Exception {
    launch(args);
  }

// CLASS ENDS
}