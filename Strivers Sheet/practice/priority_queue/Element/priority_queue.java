package practice.priority_queue.Element;

import java.util.ArrayList;

public class priority_queue<T> {
    private ArrayList<element<T>> heap;
    public priority_queue(){
        heap=new ArrayList<>();
    }  
    public T removemin()
    {
        T min=heap.get(0).data;
        
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int parentindex=0;
        int childindex1=2*parentindex+1;
        int childindex2=2*parentindex+2;
        int minimumchild=parentindex;
        while(childindex1<heap.size())
        {
        minimumchild=parentindex;
        
            if(heap.get(childindex1).priority<heap.get(minimumchild).priority)
            {
                minimumchild=childindex1;
            }
            if(childindex2<heap.size()&&heap.get(childindex1).priority>heap.get(childindex2).priority)
            minimumchild=childindex2;
        if(minimumchild==parentindex)
        break;
            element<T> temp=heap.get(parentindex);
            heap.set(parentindex,heap.get(minimumchild));
            heap.set(minimumchild,temp);
            parentindex=minimumchild;
            childindex1=2*parentindex+1;
            childindex2=2*parentindex+2;
        }
        
        return min;
    }
    public void insert(T data, int priority)
    {
        element<T> elem=new element<T>(data, priority);
        heap.add(elem);
       
        int childindex=heap.size()-1;
        int parentindex=(childindex-1)/2;
        while(childindex>0)
        {
        if(heap.get(childindex).priority<heap.get(parentindex).priority)
        {
            element<T> temp=heap.get(childindex);
            heap.set(childindex,heap.get(parentindex));
            heap.set(parentindex,temp);
            childindex=parentindex;
            parentindex=(childindex-1)/2;
        }
        else break;
    }
    }
    public T getmin() throws priorityqueueexception{
        if(isEmpty())
        throw new priorityqueueexception();
        return heap.get(0).data;
    }
    public boolean isEmpty()
    {
        if(size()==0)
        return true;
        return false;
    }
    public int size()
    {
        return heap.size();
    }

}
