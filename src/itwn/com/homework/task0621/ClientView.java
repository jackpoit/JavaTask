package itwn.com.homework.task0621;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ClientView extends Stage {

	public ClientView(){
		Pane root=new Pane();
		root.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));


		TextArea textArea=new TextArea();
		JavaFXUtil.createNode(textArea,310,400,20,20,20,"请输入");

		root.getChildren().add(textArea);

		TextField textField=new TextField();
		JavaFXUtil.createNode(textField,220,20,20,440,20,"请输入");
		root.getChildren().add(textField);


		Button sendBtn=new Button("发送");
		JavaFXUtil.createNode(sendBtn,90,40,240,440,18);
		root.getChildren().add(sendBtn);



		Scene scene=new Scene(root,350,500);
		this.setTitle("客户端界面");
		this.setScene(scene);
		this.setResizable(false);
		this.show();


	}
}
