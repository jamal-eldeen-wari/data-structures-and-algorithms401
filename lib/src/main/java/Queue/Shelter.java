package Queue;

public class Shelter {
    public QueueGeneric<Cat> catQueue;
    public QueueGeneric <Dog>dogQueue;

    public Shelter() {
        this.catQueue = new QueueGeneric<Cat>();
        this.dogQueue = new QueueGeneric<Dog>();
    }

    public void enqueueShelter(Animal animal){
        if (animal instanceof Cat){
            catQueue.enqueueGeneric((Cat) animal);
        }else if(animal instanceof Dog){
            dogQueue.enqueueGeneric((Dog) animal);
        }else{
            System.out.println("Sorry the shelter only for animals(ONLY CATS AND DOGS) ");
        }
    }

    public Animal dequeueShelter(String pref){
        if(pref.equals("cat") && !catQueue.isEmpty()){
            return catQueue.dequeueGeneric();
        }else if (pref.equals("dog") && !dogQueue.isEmpty()){
            return dogQueue.dequeueGeneric();
        }else{
            return null;
        }
    }



    @Override
    public String toString() {
        return "Shelter{" +
                "catQueue=" + catQueue +
                ", dogQueue=" + dogQueue +
                '}';
    }
}
