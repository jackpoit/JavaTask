package itwn.com.homework.task0608.employee;


public class MyArrayList<E> {
    private int size;
    private Object[] data;

    //构造函数 传入容量构造数组
    public MyArrayList(int capacity) {
        data = new Object[capacity]; //建一个Object类的数组，然后强转为E[]
        size = 0;
    }

    //无参构造 默认传入容量10
    public MyArrayList() {
        this(10);
    }

    //获取容量
    public int getCapacity() {
        return data.length;
    }

    //获取数组实际大小即元素个数
    public int size() {
        return size;
    }

    //判断数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //在index索引位置插入新元素e
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed.Require index >= 0 and index <= size.");
            //index可以等于size   就相当于在所有元素后添加一个
        }
        if (size == data.length) {
            resize(data.length + (data.length >> 1));
        }

//        if (size - index >= 0) System.arraycopy(data, index, data, index + 1, size - index);
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    //在所有元素后添加一个元素
    public void addLast(E e) {
        add(size, e);
    }

    //在所有元素前添加一个元素
    public void addFirst(E e) {
        add(0, e);
    }

    // 获取index索引位置的元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return (E)data[index];
    }

    public E getLast() {
        return get(size - 1);
    }

    public E getFirst() {
        return get(0);
    }

    // 修改index索引位置的元素为e
    public boolean set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
        return true;

    }

    // 查找数组中是否有元素e
    public boolean contain(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
        Object res = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        data[size - 1] = null;
        size--;
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        //size变成capacity四分之一时再缩小
        //同时 data.length/2!=0保证当容积为1时 resize不会接受0的参数 因为不能new一个长度为0的数组
        //
        // 二次分析 不加&&data.length/2!=0也不会出错 因为 当最后需要缩容时
        //size=0,data.length=1,之后remove会报异常 不会执行resize
        return (E)res;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst() {
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast() {
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    // 将数组空间的容量变成newCapacity大小
    private void resize(int newCapacity) {
        Object[] newData =  new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
    public void swap(int i,int j) {
        Object temp=data[i];
        data[i]=data[j];
        data[j]=temp;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size=%d,capacity=%d\n", size(), getCapacity()));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(',');
            }
        }
        res.append(']');
        return res.toString();
    }


//    @Override
//    public Iterator<E> iterator() {
//        return null;
//    }
//
//    @Override
//    public void forEach(Consumer<? super E> action) {
//        final int size = MyArrayList.this.size;
//        int i = 0;
//        if (i >= size) {
//            return;
//        }
//        final Object[] Data = data;
//        if (i >=Data.length) {
//            throw new ConcurrentModificationException();
//        }
//        while (i != size ) {
//            action.accept((E) Data[i++]);
//        }
//
//
//    }
//
//    @Override
//    public Spliterator<E> spliterator() {
//        return Iterable.super.spliterator();
//    }
}
