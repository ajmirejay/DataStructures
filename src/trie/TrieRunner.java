//The complexity of creating a trie is O(W*L) , where W is the number of words, 
//and L is an average length of the word
//for searching, insertion, deletion time complexity is O(n)
package trie;

public class TrieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] key = { "there", "their", "apple", "string" };
		TrieFunction tri = new TrieFunction();
		tri.root = new TrieNode();
		for (int i = 0; i < key.length; i++) {
			tri.insert(key[i]);
		}
		String find = "their";

		System.out.println(tri.search(find));

		System.out.println(tri.startsWith(find));

		tri.delete(find);

		System.out.println(tri.search(find));
	}

}
