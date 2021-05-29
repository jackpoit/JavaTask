package itwn.com.homework.task0527;

import java.util.Objects;

public class Worker {
    private int id;
    private String name;
    private int score;

    public Worker(){}
    public Worker(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id == worker.id && score == worker.score && name.equals(worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }
}
