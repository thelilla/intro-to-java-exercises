/*
  Write a program that animates the binary search algorithm. Create an array
  with numbers from 1 to 20 in this order. The array elements are displayed
  in a histogram. You need to enter a search key in the text field. Clicking
  the Step button causes the program to perform one comparison in the algorithm.
  Use a light-gray color to pain the bars for the numbers in the current search
  range and use a black color to paint the bar indicating the middle number
  in the search range. The Step button also freezes the text field to prevent
  its value from being changed. When the algorithm is finished, display the
  status in a label at the top of a border pane. Clicking the Reset button
  enables a new search to start. This button also makes the text field editable.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class E22_18 extends Application {
  @Override
  public void start(Stage primaryStage) {
    HistogramGUI hist = new HistogramGUI();

    Scene scene = new Scene(hist);
    primaryStage.setTitle("E22_18");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}