package trie;

public class TrieNode {
	public static final int alphabets = 26;
	TrieNode[] children = new TrieNode[alphabets];
	int endOfWord;
	int count;

	TrieNode() {
		for (int i = 0; i < alphabets; i++) {
			children[i] = null;
		}
		int endOfWord = 0;
		int count = 0;
	}
}
