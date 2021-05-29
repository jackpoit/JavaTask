package itwn.com.homework.task0527;

public class Book {
    private String title;
    private int pageNum;

    public Book(){}

    public Book(String title, int pageNum) {
        this.title = title;
        if(pageNum>=200) {
            this.pageNum = pageNum;
        }else {
            this.pageNum =200;
            System.out.printf("%s页数不能少于200，已将页数重置为200\n",title);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }

    public void detail(){
        System.out.println(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
