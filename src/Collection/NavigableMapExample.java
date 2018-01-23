package Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap original = new TreeMap();
        original.put("4", "4");
        original.put("1", "1");
        original.put("2", "2");
        original.put("3", "3");
        
        // ceilingEntry(K key) 
        Map.Entry ceilingEntryData = original.ceilingEntry("2.5");
        System.out.println(ceilingEntryData.getValue() +" "+ ceilingEntryData.getKey());
        // result 3 3
        
        // ceilingKey() tra ve la tri nguyen lam tron len 2.5 = 3
        Object ceilingData = original.ceilingKey("2.5");
        System.out.println(ceilingData.getClass() + " " +ceilingData); // object of cellingDate is String because original put("1", 1)
        // result class java.lang.String 3
        
        // descendingKeySet() dao nguoc gia tri key
        NavigableSet<String> descendingKeySetValue = original.descendingKeySet();
        for (String value : descendingKeySetValue) {
            System.out.println(value);
        }
        // result 4 3 2 1
        
        
        //descendingMap() dao nguoc cac element trong map
        NavigableMap  reverse =  original.descendingMap();
        Iterator<Map.Entry> it = reverse.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry m = it.next();
            System.out.println(m.getValue() + " " + m.getKey());
        }
        // result 4 4; 3 3 ; 2 2; 1 1
        
        //  firstEntry() return element co gia tri be nhat hoac null neu map empty
        Map.Entry<String, String> firstEntryValue = original.firstEntry();
        System.out.println(firstEntryValue.getValue() + " " + firstEntryValue.getKey());
        // result 1 1
        
        //  floorEntry(K key) nguoc voi ceilEntry no se lay gia tri nguyen lam tron xuong 2.5 = 2
        Map.Entry  floorEntryData = original.floorEntry("2.5");
        System.out.println(floorEntryData.getValue() +" "+ floorEntryData.getKey());
        // result 2 2
        
        // floorKey(K key) nguoc voi ceilingKey 
        Object floorKeyValue = original.floorKey("2.5");
        System.out.println(floorKeyValue);
        // result 2
        
        // headMap return SortedMap<K,V> ma co gia tri key < gia tri tham so dua vao
        SortedMap headmap1 = original.headMap("2");
        // this headmap1 will contain "1" and "2"
        
        // headMap(K toKey, boolean inclusive) chap nhan Key < = neu set tham so la true
        NavigableMap headmap2 = original.headMap("3", true);
        // this headmap2 will contain "1", "2", and "3" because "inclusive"=true
        
        NavigableMap original2 = new TreeMap();
        original2.put("3", "3");
        original2.put("6", "6");
        original2.put("7", "7");
        original2.put("9", "9");
       
        
        //  higherEntry(K key) tra lai element co key lon hon gan nhat , neu ko co tra lai null ( if entry = 6 return 7)
        Map.Entry  higherEntryValue = original2.higherEntry("3.5");
        System.out.println(higherEntryValue.getKey() + " " +higherEntryValue.getValue());
        // result 6 6 
        
        // higherKey(K key) tuong tu higherEntry nhung ma lay key thoi (null neu ko co)
        String higherKeyValue = (String) original2.higherKey("3.5");
        System.out.println(higherKeyValue);
        // result 6
        
        // lastEntry() tra lai element co key lon nhat
        Map.Entry lastEntryValue = original2.lastEntry();
        System.out.println(lastEntryValue.getKey() + " " +lastEntryValue.getValue());
        // result 9 9
        
        //  lowerEntry(K key) va lowerKey(K key) nguoc lai voi higherEntry va higherKey
        
        //  navigableKeySet() tra ve set cac key
        NavigableSet<String> navigableKeySetValue = original2.navigableKeySet();
        for (String value: navigableKeySetValue) {
            System.out.println(value);
        }
        // result  3 6 7 9
        
        //  pollFirstEntry() remove and return element co gia tri key be nhat hoac tra lai null
        Map.Entry pollFirstEntryValue = original2.pollFirstEntry();
        System.out.println(pollFirstEntryValue.getKey() + " " +pollFirstEntryValue.getValue());
        // 3 3
        
        // pollLastEntry nguoc lai remove and return element co gia tri key lon nhat
        
        // subMap(K fromKey, K toKey) tra lai SortedMap gom khoang o giua ko bao gom 2 dau mut 
        
        //  subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) tra lai NavigableMap<K,V> lay dau mut neu set la true
        
        // tailMap va tailMap(K fromKey, boolean inclusive) nguoc lai voi headMap
        
        // Cac method ke thua tu SortedMap la comparator, entrySet, firstKey, keySet, lastKey, values
        
        // cac method inherit tu Map la clear, compute, computeIfAbsent, computeIfPresent, containsKey, 
        //containsValue, equals, forEach, get, getOrDefault, hashCode, isEmpty, merge, put, putAll, putIfAbsent, 
        //remove, remove, replace, replace, replaceAll, size
    }
    
}

