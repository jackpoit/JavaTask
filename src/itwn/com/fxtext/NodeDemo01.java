package itwn.com.fxtext;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.sound.sampled.Control;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;

public class NodeDemo01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Pane pane=new Pane();
		pane.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW,null,null)));
		Line line=new Line(10,10,390,10);
		pane.getChildren().add(line);
		Circle circle=new Circle(100,100,50,Color.PLUM);


		TextField textField=new TextField();
		textField.setLayoutX(200);
		textField.setLayoutY(200);
		textField.setPrefSize(200,40);
		textField.setFont(new Font(20));



		Scene scene=new Scene(pane,400,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("界面标题");
		primaryStage.setResizable(false);
		primaryStage.show();

	}
}
