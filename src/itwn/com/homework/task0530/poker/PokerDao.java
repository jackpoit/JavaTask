package itwn.com.homework.task0530.poker;

public class PokerDao {
    private MyArrayList totalList=new MyArrayList();
    private MyArrayList user1list=new MyArrayList();
    private MyArrayList user2list=new MyArrayList();
    private MyArrayList user3list=new MyArrayList();

   //开牌
    public void newPoker(){
        String[] values={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors={"♣","♦","♥","♠"};
        for (int i=0;i<values.length;i++){
            for (int j=0;j<colors.length;j++){
                Poker tempPoker=new Poker(values[i],colors[j]);
                totalList.add(tempPoker);
            }
        }
        totalList.add(new Poker("小王",""));
        totalList.add(new Poker("大王",""));

    }
    //洗牌
    public void shuffle(MyArrayList list,int count){
        for (int i=1;i<=count;i++){
            int rnum1=(int) (Math.random()*list.size());
            int rnum2=(int) (Math.random()*list.size());
            list.swap(rnum1,rnum2);
        }
    }
    //发牌
    public void givePoker(){
        for (int i=0;i<17;i++){

            user1list.add(totalList.get(0));
            totalList.remove(0);
            user2list.add(totalList.get(0));
            totalList.remove(0);
            user3list.add(totalList.get(0));
            totalList.remove(0);

        }
    }
    //看牌
    public MyArrayList getPoker(MyArrayList checkList){
        return checkList;
    }
    //码牌
    public void sortPoker(){
        for (int i=1;i<17;i++){
            for (int j=0;j<17-i;j++){
                Poker poker01=(Poker) user1list.get(j);
                Poker poker02=(Poker) user1list.get(j+1);
                if (poker01.getId()<poker02.getId()){
                    user1list.swap(j,j+1);
                }
                poker01=(Poker) user2list.get(j);
                poker02=(Poker) user2list.get(j+1);
                if (poker01.getId()<poker02.getId()){
                    user2list.swap(j,j+1);
                }
                poker01=(Poker) user3list.get(j);
                poker02=(Poker) user3list.get(j+1);
                if (poker01.getId()<poker02.getId()){
                    user3list.swap(j,j+1);
                }
            }
        }
    }
    public MyArrayList getTotalList() {
        return totalList;
    }

    public void setTotalList(MyArrayList totalList) {
        this.totalList = totalList;
    }

    public MyArrayList getUser1list() {
        return user1list;
    }

    public void setUser1list(MyArrayList user1list) {
        this.user1list = user1list;
    }

    public MyArrayList getUser2list() {
        return user2list;
    }

    public void setUser2list(MyArrayList user2list) {
        this.user2list = user2list;
    }

    public MyArrayList getUser3list() {
        return user3list;
    }

    public void setUser3list(MyArrayList user3list) {
        this.user3list = user3list;
    }
}



