package itwn.com.chessdemo3;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Font;

public class JavaFXUtil {
	/**
	 * @description 创建一个按钮
	 * @param name 按钮的名字
	 * @param width 按钮的宽度
	 * @param height 按钮的高度
	 * @param x 按钮的横坐标
	 * @param y 按钮的纵坐标
	 * */
	public static Button createButton(String name,int width,int height,int x,int y) {
		Button btn=new Button(name);
		btn.setPrefSize(width, height);
		btn.setLayoutX(x);
		btn.setLayoutY(y);
		return btn;
	}
	/**
	 * @description 创建文本标签
	 * @param name 标签的名字
	 * @param fontSize 字体大小
	 * @param x 横坐标
	 * @param y 纵坐标
	 * */
	public static Label createLabel(String name,int fontSize,int x,int y) {
		Label  label=new Label(name);
		label.setLayoutX(x);
		label.setLayoutY(y);
		label.setFont(new Font(fontSize));
		return label;
	}
	/**
	 * @description 创建一个单行文本输入框
	 * @param width 输入框的宽度
	 * @param height 输入框的高度
	 * @param x 输入框的横坐标
	 * @param y 输入框的纵坐标
	 **/
	public static TextField createTextField(int width,int height,int x,int y) {
		TextField txField=new TextField();
		txField.setPrefSize(width,height);
		txField.setLayoutX(x);
		txField.setLayoutY(y);
		return txField;
	}
	/**
	 * @description 创建一个多行文本输入框
	 * @param width 输入框的宽度
	 * @param height 输入框的高度
	 * @param x 输入框的横坐标
	 * @param y 输入框的纵坐标
	 **/
	public static TextArea createTextArea(int width,int height,int x,int y) {
		TextArea txArea=new TextArea();
		txArea.setPrefSize(width,height);
		txArea.setLayoutX(x);
		txArea.setLayoutY(y);
		return txArea;
	}
	
	/**
	 * @description 创建一个密码输入框
	 * @param width 输入框的宽度
	 * @param height 输入框的高度
	 * @param x 输入框的横坐标
	 * @param y 输入框的纵坐标
	 **/
	public static PasswordField createPassField(int width,int height,int x,int y) {
		PasswordField passField=new PasswordField();
		passField.setPrefSize(width,height);
		passField.setLayoutX(x);
		passField.setLayoutY(y);
		return passField;
	}
	/***
	 * @param headerText 消息提示框的头部信息
	 * @param contextText 消息提示框的主体信息
	 * */
	public static Alert createAlert(String headerText,String contextText) {
		Alert alert=new Alert(AlertType.CONFIRMATION);
		alert.setTitle("消息提示");
		alert.setHeaderText(headerText);
		alert.setContentText(contextText);
		return alert;
	}
}
