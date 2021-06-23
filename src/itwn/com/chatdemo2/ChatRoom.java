package itwn.com.chatdemo2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class ChatRoom extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
        GridPane root=new GridPane();
        root.setBackground(new Background(new BackgroundFill(Color.PINK,null,null)));

        Button clientBtn=new Button("客户端");
		JavaFXUtil.createGridNode(clientBtn,100,40,18);
        root.add(clientBtn,0,0);
		GridPane.setMargin(clientBtn,new Insets(0,10,0,0));

		Button serverBtn=new Button("服务端");
		JavaFXUtil.createGridNode(serverBtn,100,40,18);
		root.add(serverBtn,1,0);
		GridPane.setMargin(serverBtn,new Insets(0,0,0,10));

		root.setAlignment(Pos.CENTER);

        Scene scene=new Scene(root,500,250);
        primaryStage.setTitle("聊天室");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        clientBtn.setOnMouseClicked(event -> {

			try {
				new ClientView();
			} catch (IOException e) {
				e.printStackTrace();
			}

		});
	}
}
