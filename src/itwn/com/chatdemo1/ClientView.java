package itwn.com.chatdemo1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class ClientView extends Stage {
	private static Socket client = null;
	private final static String HOST="192.168.5.21";
	private final static int PORT = 9688;
	private static DataInputStream ins = null;
	private static DataOutputStream out = null;

	public ClientView() throws IOException {
		Pane root=new Pane();
		root.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
		Image img0 = new Image("file:file/1.jpg",350,500,false,false);
		ImageView imageView=new ImageView();
		imageView.setImage(img0);
		root.getChildren().add(imageView);
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


		new Thread(()->{
			try {
				client = new Socket(HOST,PORT);
				ins = new DataInputStream(client.getInputStream());
				out = new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}

			while (true){
				try {
					textArea.appendText(ins.readUTF()+"\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
		sendBtn.setOnMouseClicked(event -> {
			if (out!=null) {
				String request = textField.getText();
				textArea.appendText(request+"\n");
				try {
					out.writeUTF("客户端："+request);
				} catch (IOException e) {
					e.printStackTrace();
				}
				textField.clear();
			}
		});

	}
}
