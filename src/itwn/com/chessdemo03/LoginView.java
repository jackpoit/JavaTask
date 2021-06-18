package itwn.com.chessdemo03;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginView extends Stage {
	private static LoginView lv;
	private UserDAO userDAO=new UserDAO();
	public static LoginView getLoginView(){
		if (lv==null) {
			lv = new LoginView();
		}
		return lv;
	}
	private LoginView(){
		GridPane root=new GridPane();
		root.setBackground(new Background(new BackgroundFill(Color.PLUM,null,null)));
		Label userLabel=new Label("用户名:");
		TextField userText=new TextField();
		JavaFXUtil.createGridNode(userLabel,80,40,20);
		JavaFXUtil.createGridNode(userText,180,30,20,"请输入用户名");
		root.add(userLabel,0,0);
		root.add(userText,1,0);

		Label passLabel=new Label("密　码:");
		PasswordField passText=new PasswordField();
		JavaFXUtil.createGridNode(passLabel,80,40,20);
		JavaFXUtil.createGridNode(passText,180,30,20,"请输入密码");
		root.add(passLabel,0,1);
		root.add(passText,1,1);

		Button logBtn=new Button("登录");
		Button cancelBtn=new Button("取消");
		JavaFXUtil.createGridNode(logBtn,80,40,20);
		JavaFXUtil.createGridNode(cancelBtn,80,40,20);
		root.add(logBtn,1,2);
		root.add(cancelBtn,1,2);
		GridPane.setMargin(cancelBtn,new Insets(0,0,0,100));

		root.setAlignment(Pos.CENTER);
		root.setHgap(8);
		root.setVgap(30);

		Scene scene=new Scene(root,400,300);
		this.setScene(scene);
		this.setTitle("登录界面");
		this.setResizable(false);
		this.show();

		logBtn.setOnMouseClicked(event -> {

			if (userDAO.login(userText.getText(),passText.getText())){
				JavaFXUtil.createAlert("登录成功",0);
				LoginView.this.hide();
				new ChessView();
			}else {
				JavaFXUtil.createAlert("登录失败",0);
			}

		});


	}
}
