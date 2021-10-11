package Queue;

public class QueueGeneric <T>{
    private QueueNodeGeneric <T> front;
    private QueueNodeGeneric <T> rear;

    public void enqueueGeneric(T data){

        if (isEmpty()){
            QueueNodeGeneric<T> queueNode = new QueueNodeGeneric<T>(data);
            front = queueNode;
            rear = queueNode;
        }else{
            QueueNodeGeneric <T> queueNode = new QueueNodeGeneric<T>(data);
            rear.setRear(queueNode);
            rear = queueNode;
        }
    }

    public T dequeueGeneric(){

        if (isEmpty()){
            return (T) "Queue is empty";
        }else {
            T data = (T) front.getData();
            front = front.getFront();
            return data;
        }
    }

    public T peekGeneric(){
        if (isEmpty()){
            return (T) "Queue is empty";
        }else{
            return (T) front.getData();
        }
    }

    public boolean isEmpty(){
        return front ==null;
    }

    @Override
    public String toString() {
        return "QueueGeneric{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
