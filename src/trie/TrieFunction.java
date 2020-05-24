package trie;

public class TrieFunction {
	TrieNode root;

	void insert(String key) {
		TrieNode current = root;
		int index;
		int length = key.length();
		for (int i = 0; i < length; i++) {
			index = key.charAt(i) - 'a';
			if (current.children[index] == null) {
				current.children[index] = new TrieNode();
			}
			current = current.children[index];
			current.count += 1;
		}

		current.endOfWord += 1;
	}

	boolean search(String key) {
		TrieNode current = root;
		int length = key.length();
		int index;
		for (int i = 0; i < length; i++) {
			index = key.charAt(i) - 'a';
			if (current.children[index] == null) {
				return false;
			}
			current = current.children[index];
		}
		return (current.endOfWord > 0);
	}

	boolean startsWith(String prefix) {
		TrieNode current = root;
		int index;
		int length = prefix.length();
		for (int i = 0; i < length; i++) {
			index = prefix.charAt(i) - 'a';
			if (current.children[index] == null) {
				return false;
			}
			current = current.children[index];
		}
		return (current.count > 0);
	}

	void delete(String deletion) {
		if (search(deletion)) {
			int index, i;
			TrieNode current = root;
			for (i = 0; i < deletion.length(); i++) {
				index = deletion.charAt(i) - 'a';
				current.children[index].count -= 1;
				current = current.children[index];
			}
			current.endOfWord = 0;
			System.out.println("word deleted ");
		} else {
			System.out.println("word not found ");
		}
	}

}
