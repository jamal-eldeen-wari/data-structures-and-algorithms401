package Queue;

public class Queue {
    private QueueNode front;
    private  QueueNode rear;


    public void enqueue(String data){

        if (isEmpty()){
            QueueNode queueNode = new QueueNode(data);
            front = queueNode;
            rear = queueNode;
        }else{
            QueueNode queueNode = new QueueNode(data);
            rear.setRear(queueNode);
            rear = queueNode;
        }

    }
    public String dequeue(){
        if (isEmpty()){
            return "Queue is empty";
        }else {
            String data = front.getData();
            front = front.getFront();
            return data;
        }
    }

    public String peek(){
        if (isEmpty()){
            return "Queue is empty";
        }else{
            return front.getData();
        }


    }

    public boolean isEmpty(){
        return front ==null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
