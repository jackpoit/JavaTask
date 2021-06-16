package itwn.com.homework.littletrik.teachersystem;


public class MyArrayList {
    private Object[] objs=new Object[10];
    private int size;//统计数组中实际放置的元素个数

    /**
     * @description 添加数据
     * @param obj 新元素
     * */
    public void add(Object obj){
        if(size==objs.length){
            Object[] newArr=new Object[size+(size>>1)];
            for (int i=0;i<size;i++){
                newArr[i]=objs[i];
            }
            objs=newArr;
        }
        objs[size]=obj;
        size++;
    }

    /**
     * @description 根据下标从容器获取元素
     **/
    public Object get(int index){
        return objs[index];
    }

    /**
     * @description 根据下标替换数组中的元素
     * @param index 需要修改元素的位置
     * @param obj 新元素
     * */
    public void set(int index,Object obj){
        objs[index]=obj;
    }
    /**
     * @description 根据下标删除元素
     * @param index 需要删除的元素对应的下标
     * */
    public void remove(int index){
        for (int i=index;i<size-1;i++){
            objs[i]=objs[i+1];
        }
        objs[size-1]=null;
        size--;
    }
    /**
     * @description 获得元素的总数
     * */
    public int size(){
        return size;
    }

    /**
     * 交换元素的位置
     * */
    public void swap(int i,int j) {
        Object temp=objs[i];
        objs[i]=objs[j];
        objs[j]=temp;
    }

    @Override
    public String toString() {
        String str="[";
        for (int i=0;i<size;i++){
            if (i<size-1) {
                str += objs[i] + ",";
            }else {
                str+=objs[i]+"]";
            }
        }
        return str;
    }
}
