package Queue;

public class QueueNodeGeneric <T>{
    private T data;
    private QueueNodeGeneric <T>front;
    private QueueNodeGeneric<T> rear;

    public QueueNodeGeneric(T data) {
        this.data = data;
    }

    public QueueNodeGeneric() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public QueueNodeGeneric<T> getFront() {
        return front;
    }

    public void setFront(QueueNodeGeneric<T> front) {
        this.front = front;
    }

    public QueueNodeGeneric<T> getRear() {
        return rear;
    }

    public void setRear(QueueNodeGeneric<T> rear) {
        this.rear = rear;
    }

    @Override
    public String toString() {
        return "QueueNodeGeneric{" +
                "data=" + data +
                '}';
    }
}
