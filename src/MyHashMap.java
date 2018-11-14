class MyHashMap {
    final Bucket[] buckets = new Bucket[10000];

    public void put(int key, int value) {
        int i = idx(key);
        if (buckets[i] == null)
            buckets[i] = new Bucket();
        ListNode prev = find(buckets[i], key);
        if (prev.next == null)
            prev.next = new ListNode(key, value);
        else prev.next.val = value;
    }

    public int get(int key) {
        int i = idx(key);
        if (buckets[i] == null)
            return -1;
        ListNode node = find(buckets[i], key);
        return node.next == null ? -1 : node.next.val;
    }

    public void remove(int key) {
        int i = idx(key);
        if (buckets[i] == null) return;
        ListNode prev = find(buckets[i], key);
        if (prev.next == null) return;
        prev.next = prev.next.next;
    }

    int idx(int key) {
    	return Integer.hashCode(key) % buckets.length;
    	}

    ListNode find(Bucket bucket, int key) {
        ListNode node = bucket.head, prev = null;
        while (node != null && node.key != key) {
            prev = node;
            node = node.next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	MyHashMap hashMap = new MyHashMap();
    	hashMap.put(1, 1);          
    	hashMap.put(2, 2);         
    	hashMap.get(1);            // returns 1
    	hashMap.get(3);            // returns -1 (not found)
    	hashMap.put(2, 1);          // update the existing value
    	hashMap.get(2);            // returns 1 
    	hashMap.remove(2);          // remove the mapping for 2
    	hashMap.get(2); 
	}

}

class Bucket {
    final ListNode head = new ListNode(-1, -1);
}

class ListNode {
    int key, val;
    ListNode next;

    ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}