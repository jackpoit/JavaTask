package itwn.com.chessdemo1;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class Main extends Application {
	private final static int MAIN_VIEW_WIDTH =700;
	private final static int MAIN_VIEW_HEITHGT=800;
	private final static int GRID_SIZE=40;
	private static boolean depend=false;
	private final static String path="file/chess.txt";
	private static Color color=Color.BLACK;
	private LinkedList<Chess> list = new LinkedList<>();
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
        Pane pane=new Pane();
		Scene scene=new Scene(pane, MAIN_VIEW_WIDTH,MAIN_VIEW_HEITHGT);
        pane.setBackground(new Background(new BackgroundFill(Color.rgb(244,202,119),null,null)));
        //绘制棋盘
		{
			for (int x = 50, y = 50; x <= 650; x += GRID_SIZE) {
				Line line = new Line(x, y, x, y + 600);
				pane.getChildren().add(line);
			}
			for (int x = 50, y = 50; y <= 650; y += GRID_SIZE) {
				Line line = new Line(x, y, x + 600, y);
				pane.getChildren().add(line);
			}
		}
        //绘制按钮
        String[] titles={"重新开始","悔棋","存档","读档","退出"};
        for (int i=0;i<titles.length;i++) {
			Button button=new Button(titles[i]);
			button.setPrefSize(100,40);
			button.setFont(new Font(15));
			button.setLayoutX(50+i*125);
			button.setLayoutY(700);
			pane.getChildren().add(button);
			if ("重新开始".equals(button.getText())){
				button.setOnMouseClicked(event -> {
					if (!list.isEmpty()) {
						restart(pane);
					}
				});
			}else if ("悔棋".equals(button.getText())){
				button.setOnMouseClicked(event -> regret(pane));
			}else if ("存档".equals(button.getText())){
				button.setOnMouseClicked(event -> {
					writeObj(list);
					Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
					alert.setTitle("存档");
					alert.setContentText("正在存档。。。。。");
					alert.showAndWait();
				});
			}else if ("读档".equals(button.getText())){
				button.setOnMouseClicked(event -> readChess(pane));
			}else if ("退出".equals(button.getText())){
				button.setOnMouseClicked(event -> System.exit(0));
			}
		}

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("五子棋");
        primaryStage.show();
		//下棋

        pane.setOnMouseClicked(event -> {
            double clickX=event.getX();
            double clickY=event.getY();
            int x=(int)(Math.round((clickX-50)/GRID_SIZE)*GRID_SIZE)+50;
            int y=(int)(Math.round((clickY-50)/GRID_SIZE)*GRID_SIZE)+50;
			if (!depend&&x>=50&&y>=50&&x<=650&&y<=650&&isChessExist(x,y)) {
				Chess chess= new Chess(x, y, color == Color.BLACK ? 0 : 1);
				list.add(chess);
				Circle circle = new Circle(x, y, 20, color);
				pane.getChildren().add(circle);
				if (isWin(chess)){
					depend=true;
					Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
					alert.setTitle("消息提示");
					alert.setContentText("游戏结束！"+(color==Color.BLACK?"黑棋赢":"白棋赢")+"win");
					alert.showAndWait();
				}
				color=color==Color.BLACK?Color.WHITE:Color.BLACK;
					//-----------------------------------------------------------

				}
        });

	}
	//
	public void regret(Pane pane){
		if (list.isEmpty()){
			Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
			alert.setTitle("警告");
			alert.setContentText("棋盘棋子数量为空！");
			alert.showAndWait();
		}else {
			ObservableList<Node> node = pane.getChildren();
			node.remove(node.size() - 1);
			list.removeLast();
		}
	}
	public boolean isChessExist(int x,int y){
		for (Chess c: list){
			if (c.getX()==x&&c.getY()==y){
				return false;
			}
		}
		return true;
	}

	public boolean isWin(Chess nowChess){
		int[]dx = {-1,-1,-1,0};
		int[]dy = {0,-1,1,1};
		int x=nowChess.getX();
		int y=nowChess.getY();
		int color=nowChess.getColor();
		for (int i=0;i<4;i++){
			int count=1;
			int fx = x ;
			int fy = y ;
			while (fx<=650&&fy<=650&&fx>=50&&fy>=50){
				int step = 1;
				fx += dx[i] * GRID_SIZE * step;
				fy += dy[i] * GRID_SIZE * step;
				if (list.contains(new Chess(fx, fy, color))){
					count++;
				}else {
					break;
				}
				step++;
			}
			 fx = x ;
			 fy = y ;
			while (fx<=650&&fy<=650&&fx>=50&&fy>=50){
				int step = -1;
				fx += dx[i] * GRID_SIZE * step;
				fy += dy[i] * GRID_SIZE * step;
				if (list.contains(new Chess(fx, fy, color))){
					count++;
				}else {
					break;
				}
				step--;
			}
			if (count==5){
				return true;
			}
		}
		return false;
	}

	public void writeObj(Object obj)  {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
			out.writeObject(obj);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void readChess(Pane pane){
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream(path));
			LinkedList<Chess> temp=(LinkedList<Chess>) in.readObject();
			in.close();
			while (!temp.isEmpty()){
				Chess chess=temp.removeLast();
				list.add(chess);
				Circle circle = new Circle(chess.getX(), chess.getY(), 20, chess.getColor()==0?Color.BLACK:Color.WHITE);
				pane.getChildren().add(circle);
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void restart(Pane pane){

			ObservableList<Node> node = pane.getChildren();
			node.remove(node.size()- list.size(), node.size());
			list.clear();

	}
	static class Chess implements Serializable {
		public int x;
		public int y;
		public int color; //0黑 1白

		public Chess() {
		}
		public Chess(int x, int y, int color) {
			this.x = x;
			this.y = y;
			this.color = color;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getColor() {
			return color;
		}

		public void setColor(int color) {
			this.color = color;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Chess)) return false;

			Chess chess = (Chess) o;

			if (x != chess.x) return false;
			if (y != chess.y) return false;
			return color == chess.color;
		}

		@Override
		public int hashCode() {
			int result = x;
			result = 31 * result + y;
			result = 31 * result + color;
			return result;
		}
	}
}
