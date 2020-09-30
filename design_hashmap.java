class MyHashMap {

class Tuple{
    Integer key;
    Integer value;
    
    Tuple(Integer key, Integer value){
        this.key = key;
        this.value = value;
    }
    
    public int getKey(){
        return this.key;
    }
    public int getValue(){
        return this.value;
    }
}
LinkedList<Tuple>[] hashMap;

int hashKey(int key){
    return key % hashMap.length;
}

/** Initialize your data structure here. */
public MyHashMap() {
    hashMap = new LinkedList[10];
    
    for(int i = 0; i < hashMap.length; i++){
        hashMap[i] = new LinkedList();
    }
}

/** value will always be non-negative. */

public void put(int key, int value) {
    if(get(key) != -1)
        remove(key);
    int hashedKey = hashKey(key);
    hashMap[hashedKey].add(new Tuple(key, value));
}

/** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
public int get(int key) {
    int hashedKey = hashKey(key);
    Iterator<Tuple> iter = hashMap[hashedKey].listIterator();
     while(iter.hasNext()){
         Tuple curr = iter.next();
         if(curr.key.equals(key))
             return curr.value;
     }
    return -1;
}

/** Removes the mapping of the specified value key if this map contains a mapping for the key */
public void remove(int key) {
    int hashedKey = hashKey(key);
    Iterator<Tuple> iter = hashMap[hashedKey].listIterator();
    Tuple removePair = new Tuple(-1, -1);
    while(iter.hasNext()){
         Tuple curr = iter.next();
         if(curr.key.equals(key)){
             removePair = curr;
             break;
         }
     }
    
    hashMap[hashedKey].remove(removePair);
}
}