package itwn.com.homework.littletrik;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CaiQuan {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int soloCount=0;
            int myScore=0;
            int enemyScore=0;
            String enemy;
            System.out.println("----------欢迎进入游戏世界----------\n");
            System.out.println("     *******************");
            System.out.println("     **  猜拳，开始    **");
            System.out.println("     *******************\n\n");
            System.out.println("出拳规则：1.剪刀 2.石头 3.布");
            System.out.print("请选择对方角色(1：刘备2：孙权 3：曹操)：");
            int op1=in.nextInt();
            if(op1==1) {
                enemy="刘备";
            }else if(op1==2) {
                enemy="孙权";
            }else {
                enemy="曹操";
            }
            System.out.print("请输入你的名字：");
            String name=in.next();

            do {
                if(soloCount==0) {
                    System.out.print("要开始吗？（y/n)");
                    String op2=in.next();
                    if(op2.equals("n")) {
                        System.out.println("----------------------------");
                        break;
                    }
                }
                soloCount++;
                System.out.print("\n请出拳：1.剪刀 2.石头 3.布（输入相应数字）：");
                int inp1=in.nextInt();
                int inp2=(int)(Math.random()*3)+1;
                if(inp1==1) {
                    System.out.println("你出拳:剪刀");
                }else if(inp1==2) {
                    System.out.println("你出拳:石头");
                }else {
                    System.out.println("你出拳:布");
                }

                if(inp2==1) {
                    System.out.println(enemy+"出拳:剪刀");
                }else if(inp2==2) {
                    System.out.println(enemy+"出拳:石头");
                }else {
                    System.out.println(enemy+"出拳:布");
                }

                if((inp1==1&&inp2==3)||(inp1==2&&inp2==1)||(inp1==3&&inp2==2)) {
                    myScore++;
                    System.out.println("结果：恭喜，你赢了");
                }else if(inp1!=inp2) {
                    enemyScore++;
                    System.out.println("结果：果咩内，你输了");
                }else {
                    System.out.println("结果：平局");
                }


                System.out.print("是否开始下一轮？（y/n)");
                String op3=in.next();
                if(op3.equals("n")) {
                    System.out.println("----------------------------");
                    break;
                }

            }while(true);
            System.out.println(enemy+"VS"+name);
            System.out.printf("对战次数：%d\n\n",soloCount);
            System.out.println("姓名\t得分");
            System.out.println(name+"\t"+myScore);
            System.out.println(enemy+"\t"+enemyScore+"\n");
            if(myScore>enemyScore) {
                System.out.println("结果：恭喜恭喜！");
            }else if(myScore<enemyScore) {
                System.out.println("结果：果咩果咩！");
            }else {
                System.out.println("结果：平局");
            }
            System.out.println("----------------------------");
            in.close();
            List<Integer> list = new ArrayList<>();
        }

    }

