import java.util.*;
class PQ {
	ArrayList<Integer> heap;
	public PQ(){
		heap=new ArrayList<>();
	}
	boolean isEmpty() {
		if(heap.size()==0)
		return true;
		return false;
		// Implement the isEmpty() function here
	}

	int getSize() {
		return heap.size();
			}

	int getMax() {
		int max=heap.get(0);
		return max;
		// Implement the getMax() function here
	}

	void insert(int element) {
		heap.add(element);
		int childnode=heap.size()-1;
		int parentNode=(childnode-1)/2;
		while(childnode>0)
		{
			parentNode=(childnode-1)/2;
			if(heap.get(parentNode)<heap.get(childnode))
			{
				int temp=heap.get(parentNode);
				heap.set(parentNode,heap.get(childnode));
				heap.set(childnode,temp);
				childnode=parentNode;
			}
			else
			break;
		}
	}

	int removeMax() {
		int max=heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentNode=0;
		
		int leftchild=2*parentNode+1;
		int rightchild=2*parentNode+2;
		int gratest=parentNode;
		while(leftchild<heap.size())
		{
			if(heap.get(leftchild)>heap.get(gratest))
			gratest=leftchild;
			if(rightchild<heap.size()&&heap.get(rightchild)>heap.get(gratest))
			gratest=rightchild;
			if(gratest==parentNode)
			break;
			int temp=heap.get(gratest);
			heap.set(gratest,heap.get(parentNode));
			heap.set(parentNode,temp);
			gratest=parentNode;
		}
		return max;
	}
}