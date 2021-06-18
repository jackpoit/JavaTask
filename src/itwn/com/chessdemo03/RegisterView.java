package itwn.com.chessdemo03;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RegisterView extends Stage {
	private UserDAO userDAO=new UserDAO();
	private static RegisterView rv;
	public static RegisterView getRegisterView(){
		if (rv==null){
			rv= new RegisterView();
		}
		return rv;
	}
	private RegisterView(){
		GridPane root=new GridPane();
		root.setBackground(new Background(new BackgroundFill(Color.PLUM,null,null)));
		Label userLabel=new Label("用户名:");
		TextField userText=new TextField();
		JavaFXUtil.createGridNode(userLabel,80,40,20);
		JavaFXUtil.createGridNode(userText,180,30,20,"请输入用户名");
		root.add(userLabel,0,0);
		root.add(userText,1,0);

		Label passLabel=new Label("密　码:");
		TextField passText=new TextField();
		JavaFXUtil.createGridNode(passLabel,80,40,20);
		JavaFXUtil.createGridNode(passText,180,30,20,"请输入密码");
		root.add(passLabel,0,1);
		root.add(passText,1,1);

		Label phoneLabel=new Label("手机号：");
		TextField phoneText=new TextField();
		JavaFXUtil.createGridNode(phoneLabel,80,40,20);
		JavaFXUtil.createGridNode(phoneText,180,30,20,"请输入手机号");
		root.add(phoneLabel,0,2);
		root.add(phoneText,1,2);

		Button registerBtn=new Button("注册");
		Button cancelBtn=new Button("取消");
		JavaFXUtil.createGridNode(registerBtn,80,40,20);
		JavaFXUtil.createGridNode(cancelBtn,80,40,20);
		root.add(registerBtn,1,3);
		root.add(cancelBtn,1,3);
		GridPane.setMargin(cancelBtn,new Insets(0,0,0,100));

		root.setAlignment(Pos.CENTER);
		root.setHgap(8);
		root.setVgap(30);

		Scene scene=new Scene(root,400,300);
		this.setScene(scene);
		this.setTitle("注册界面");
		this.setResizable(false);
		this.show();

		cancelBtn.setOnMouseClicked(event -> {
		});

		registerBtn.setOnMouseClicked(event -> {
			if (userDAO.register(userText.getText(),passText.getText(),phoneText.getText())){
				JavaFXUtil.createAlert("注册成功",0);
				RegisterView.this.hide();
				LoginView.getLoginView();
			}else {
				JavaFXUtil.createAlert("注册失败",0);
			}

		});

	}
}
