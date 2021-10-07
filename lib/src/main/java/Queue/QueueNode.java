package Queue;

public class QueueNode {
    private String data;
    private QueueNode front;
    private  QueueNode rear;

    public QueueNode() {
    }

    public QueueNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public QueueNode getFront() {
        return front;
    }

    public void setFront(QueueNode front) {
        this.front = front;
    }

    public QueueNode getRear() {
        return rear;
    }

    public void setRear(QueueNode rear) {
        this.rear = rear;
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                "data='" + data + '\'' +
                '}';
    }
}
