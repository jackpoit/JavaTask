package itwn.com.chessdemo03;

import javafx.scene.control.*;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;

import java.util.Optional;


public class JavaFXUtil {
	/**
	 * @description 创建一个输入框，按钮，Label,密码框，多行文本输入框
	 * @param node 组件节点
	 * @param width 组件的宽度
	 * @param height 组件的高度
	 * @param x 组件的横坐标位置
	 * @param y 组件的纵坐标位置
	 * @param fontSize 组件字体的大小
	 * @param message 输入框的文字提示
	 * */
	public static void createNode(Region node, double width, double height, int x, int y, int fontSize, String message){
		node.setLayoutX(x);
		node.setLayoutY(y);
		node.setPrefSize(width,height);
		if (node instanceof Labeled){
			Labeled labeled=(Labeled) node;
			labeled.setFont(new Font(fontSize));
		}else if (node instanceof TextInputControl){
			TextInputControl text=(TextInputControl) node;
			text.setPromptText(message);
			text.setFont(new Font(fontSize));
		}
	}
	/**
	 * @description 创建按钮，Label
	 * @param node 组件节点
	 * @param width 组件的宽度
	 * @param height 组件的高度
	 * @param x 组件的横坐标位置
	 * @param y 组件的纵坐标位置
	 * @param fontSize 组件字体的大小
	 * */
	public static void createNode(Region node,double width,double height,int x,int y,int fontSize){
		createNode(node,width,height,x,y,fontSize,null);
	}
	/**
	 * 	@description 创建消息提示框
	 *  @param message 消息提示的主体内容
	 *  @param msgType  0 代表AlertType.INFORMATION  1 代表AlertType.CONFIRMATION
	 * */
	public static Optional<ButtonType> createAlert (String message, int msgType) {
		Alert alert=msgType==0?new Alert(Alert.AlertType.INFORMATION):new Alert(Alert.AlertType.CONFIRMATION);
		alert.setHeaderText("");
		alert.setTitle("消息提示");
		alert.setContentText(message);
		return alert.showAndWait();
	}
	/***
	 * @description 网格布局中的 组件设置
	 * */
	public static void createGridNode(Region node,double width,double height,int fontSize,String message) {
		node.setPrefSize(width, height);
		node.setPrefSize(width,height);
		if (node instanceof Labeled){
			Labeled labeled=(Labeled) node;
			labeled.setFont(new Font(fontSize));
		}else if (node instanceof TextInputControl){
			TextInputControl text=(TextInputControl) node;
			text.setPromptText(message);
			text.setFont(new Font(fontSize));
		}
	}
	public static void createGridNode(Region node,double width,double height,int fontSize) {
		createGridNode(node, width, height, fontSize,null);
	}
}
