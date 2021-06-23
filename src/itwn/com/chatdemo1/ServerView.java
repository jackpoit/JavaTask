package itwn.com.chatdemo1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerView extends Stage {
	private static ServerSocket server=null;
	private static Socket client=null;
	private final static int PORT=9688;
	private static DataInputStream ins=null;
	private static DataOutputStream out=null;
	public ServerView() throws IOException {
		Pane root=new Pane();
		root.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
		TextArea textArea=new TextArea();
		JavaFXUtil.createNode(textArea,310,400,20,20,20);
		root.getChildren().add(textArea);
		TextField textField=new TextField();
		JavaFXUtil.createNode(textField,220,20,20,440,20,"请输入");
		root.getChildren().add(textField);
		Button sendBtn=new Button("发送");
		JavaFXUtil.createNode(sendBtn,90,40,240,440,18);
		root.getChildren().add(sendBtn);
		Scene scene=new Scene(root,350,500);
		this.setTitle("服务端界面");
		this.setScene(scene);
		this.setResizable(false);
		this.show();



		server=new ServerSocket(PORT);
		new Thread(()->{
			try {
				client=server.accept();
				ins=new DataInputStream(client.getInputStream());
				out=new DataOutputStream(client.getOutputStream());
				while (true) {
						try {
							textArea.appendText(ins.readUTF()+"\n");
						} catch (IOException e) {
							e.printStackTrace();
						}

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}).start();


		sendBtn.setOnMouseClicked(event -> {
			if (out!=null) {
				String respond = textField.getText();
				textArea.setText(textArea.getText()+respond+"\n");
				textField.setText("");
				try {
					out.writeUTF("服务端："+respond);
				} catch (IOException e) {
					e.printStackTrace();
				}
				textField.clear();
			}
		});
	}

}

