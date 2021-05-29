package itwn.com.homework.task0527;
class WorkerTest {
    public static void main(String[] args) {
        Worker worker01=new Worker(1,"jack",99);
        Worker worker02=new Worker(1,"JACK",99);
        Worker worker03=new Worker(1,"jack",99);
        System.out.println(worker01.equals(worker02));
        System.out.println(worker01.equals(worker03));
    }
}