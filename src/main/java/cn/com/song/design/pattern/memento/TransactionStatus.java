package cn.com.song.design.pattern.memento;

public class TransactionStatus {

    private String status = "";

    public void suspend() {
        this.status = "suspend";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Memento createMemento() {
        return new Memento(this.status);
    }

    public void restore(Memento memento) {
        this.status = memento.getStatus();
    }


}
