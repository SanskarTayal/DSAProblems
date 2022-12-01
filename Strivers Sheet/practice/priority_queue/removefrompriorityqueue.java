public int removeMin() throws PriorityQueueException{
    // if(isEmpty())
    // return 0;

    int min=heap.get(0);
    heap.set(0,heap.get(heap.size()-1));
    heap.remove(heap.size()-1);
    int parentIndex=0;
    int childIndex1=2*parentIndex+1;
    int childIndex2=2*parentIndex+2;
    int minimumchildindex=0;
    
    while(childIndex1<heap.size()&&childIndex2<heap.size())
    {
        if(heap.get(childIndex1)<heap.get(childIndex2))
            minimumchildindex=childIndex1;
        else
            minimumchildindex=childIndex2;
        if(heap.get(parentIndex)>heap.get(minimumchildindex))
        {
            int temp=heap.get(parentIndex);
            heap.set(parentIndex,heap.get(minimumchildindex));
            heap.set(minimumchildindex,temp);
            parentIndex=minimumchildindex;
            childIndex1=2*parentIndex+1;
            childIndex2=2*parentIndex+2;	
        }
        else break;
    }
    return min;
}
}