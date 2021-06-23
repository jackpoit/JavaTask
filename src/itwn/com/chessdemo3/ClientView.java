package itwn.com.chessdemo3;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ClientView extends Stage{
	private static final int WIDTH=350;
	private static final int HEIGHT=470;
	private Pane pane;//面板
	private TextArea txArea;//多行文本输入框
	private TextField txTalk;//当行文本输入框、
	
	private Socket client; //客户端
	private DataInputStream ins;
	private DataOutputStream out;
	
	private int port=9888;
	private String host="192.168.5.21";
	
	
	public ClientView() {
		pane=new Pane();
		//1.创建了一个 消息显示框
		txArea=JavaFXUtil.createTextArea(WIDTH-40,380,20, 20);
		txArea.setFont(new Font(18));//设置输入框中的字体大小
		//txArea.setBackground(new Background(new BackgroundFill(Color.PURPLE, null,null)));
		//txArea.setDisable(true);//不可编辑
		//txArea.setText("请输入你想对我说的话......\n请输入你想对我说的话......\n");
		pane.getChildren().add(txArea);
		//2.消息输入框
		txTalk=JavaFXUtil.createTextField(WIDTH-100,40, 20,420);
		pane.getChildren().add(txTalk);
		//3.创建发送按钮
		Button btn=JavaFXUtil.createButton("发送",70, 40,WIDTH-80,420);
		
		//4.点击发送按钮 向服务器端发送数据(客户端向服务器端发送数据)
		
		pane.getChildren().add(btn);
		Scene sc=new Scene(pane, WIDTH,HEIGHT);
		this.setScene(sc);
		this.setTitle("客户端界面");
		this.setResizable(false);
		
		//1.往服务端写数据 
		btn.setOnMouseClicked(e->{
			if(out!=null) {//已经连上了服务端
				try {
					String clientTalk=txTalk.getText();
					//1.先写给服务端
					out.writeUTF("charles:"+clientTalk+"\n");
					//2.回显到当前客户端界面
					txArea.setText(txArea.getText()+"charles:"+clientTalk+"\n");
					//3.清空输入框中的数据..
					txTalk.setText("");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		//2.开辟线程创建客户端，然后不断的读取服务端发送过来的数据
		new Thread(()-> {
			try {
				client=new Socket(host, port);
				ins=new DataInputStream(client.getInputStream());
				out=new DataOutputStream(client.getOutputStream());
				while(true) {
					String serverTalk=ins.readUTF();
					txArea.setText(txArea.getText()+serverTalk);
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}).start();
	}
}
