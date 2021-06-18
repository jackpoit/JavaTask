package itwn.com.chessdemo03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MainView extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Pane pane=new Pane();
//		Image image = new Image("file:C:\\JavaProgram\\JavaTask\\file/1.jpg",400,300,false,false);
//		ImageView imageView = new ImageView();
//		imageView.setImage(image);
//		pane.getChildren().add(imageView);
		pane.setBackground(new Background(new BackgroundFill(Color.PLUM,null,null)));
		Button logbtn=new Button("登录");
		JavaFXUtil.createNode(logbtn,100,40,30,80,15);
		Button regisbtn=new Button("注册");
		JavaFXUtil.createNode(regisbtn,100,40,170,80,15);
		pane.getChildren().add(logbtn);
		pane.getChildren().add(regisbtn);
		logbtn.setOnMouseClicked(event -> {
			primaryStage.hide();
			LoginView.getLoginView();
		});
		regisbtn.setOnMouseClicked(event -> {
			primaryStage.hide();
			RegisterView.getRegisterView();
		});


		Scene scene=new Scene(pane,300,200);
		primaryStage.setTitle("五子棋");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
