package practice.priority_queue.Element;

public class priorityqueuetest {
    public static void main(String[] args) throws priorityqueueexception
    {
        priority_queue<String> que= new priority_queue<>();
        que.insert("hello", 50);
        que.insert("sanskar", 25);
        que.insert("udit", 100);
        System.out.println(que.getmin());
        System.out.println(que.removemin());
        System.out.println(que.getmin());
    }
}
