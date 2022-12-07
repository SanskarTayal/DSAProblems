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

	public boolean search(String word){
		return search(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return search(child, word.substring(1));
	}
	public void add(TrieNode root,String word)
	{
		if(word.length()==0)
		{
		root.isTerminating=true;
		return;
		}
		int characterindex=word.charAt(0)-'a';
		if(root.children[characterindex]==null)
		{
			root.children[characterindex]=new TrieNode(word.charAt(0));
			root.childCount++;
		}
		add(root.children[characterindex],word.substring(1));

	}

	public void patternMatching(ArrayList<String> arr, String Pattern, TrieNode root)
	{
		for(int i=0;i<arr.size();i++)
		{
			add(root,arr.get(i));
		}
	}
	public boolean patternMatching(ArrayList<String> vect, String pattern) {
        patternMatching(vect,pattern,root);
		return patternHelper(pattern,root);
	}
	public boolean patternHelper(String pattern,TrieNode root)
	{
		if(pattern.length()==0)
		return true;
		if(root.childCount==0)
		return false;
		int childindex=pattern.charAt(0)-'a';
		boolean ans=false;
		for(int i=0;i<26;i++)
		{
			if(root.children[i]==null)
				continue;
			if(i==childindex)
			{
				ans=ans||patternHelper(pattern.substring(1),root.children[i]);
				if(ans==true)
				return ans;
			}
			ans=ans||patternHelper(pattern,root.children[i]);
		}
		return ans;
	}

}