package itwn.com.chessdemo3;

import itwn.com.chessdemo3.JavaFXUtil;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class MainView extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Pane pane=new Pane();
			pane.setBackground(new Background(new BackgroundFill(Color.PINK,null,null)));
			Button clientBtn=JavaFXUtil.createButton("客户端",100, 40,75,80);
			Button serverBtn=JavaFXUtil.createButton("服务端",100, 40,225,80);
			pane.getChildren().add(clientBtn);
			pane.getChildren().add(serverBtn);
			//1.客户端界面
			clientBtn.setOnMouseClicked(e->{
				new ClientView().showAndWait();
			});
			//2.服务器端界面
			serverBtn.setOnMouseClicked(e->{
				//new ServerView().showAndWait();
			});
			Scene scene = new Scene(pane,400,200);
			primaryStage.setScene(scene);
			primaryStage.setTitle("聊天室");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
