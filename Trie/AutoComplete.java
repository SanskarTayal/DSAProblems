import java.util.ArrayList;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {
	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}
	
	public TrieNode autoCompleteHelper(TrieNode root,String word)
	{
		if(word.length()==0)
		return root;
		int childIndex=word.charAt(0)-'a';
		if(root.children[childIndex]==null)
		return null;
		return autoCompleteHelper(root.children[childIndex], word.substring(1));
	}
	public void autoCompletePrint(TrieNode root,String word,String cur)
	{
		if(root.isTerminating)
		{
			System.out.println(word+cur);
		}
		if(root.childCount==0)
		return;
		for(int i=0;i<26;i++)
		{
			if(root.children[i]!=null)
			{
			//	System.out.print(root.children[i].data);
				autoCompletePrint(root.children[i], word,cur+root.children[i].data);
			}
		}
	}


	public void autoComplete(ArrayList<String> input, String word) {

        for(int i=0;i<input.size();i++)
		{
			add(root,input.get(i));
		}
		TrieNode roothelp=(autoCompleteHelper(root, word));
		//System.out.println(roothelp.data);
		if(roothelp!=null)
		{
			autoCompletePrint(roothelp,word,"");
		}
		return;

    }

}