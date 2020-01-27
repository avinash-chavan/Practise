import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Avinash {
	
	public static void main(String[] args) {
		
		Integer[] arr = {1,1,1,1,2,2,3,3,4,5,5,5,6,6,7,3,2,6};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		  Map m = new ConcurrentHashMap<K, V>();
		//map
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);

		//sort
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		Set<Entry<Integer, Integer>> collect = entrySet.stream().sorted((a,b) -> b.getValue().compareTo(a.getValue())).collect(Collectors.toSet());
		
		collect.forEach(System.out::println);
		
//		Iterator<Entry<Integer, Integer>> iterator = collect.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next().getKey()+ " - "+ iterator.next().getValue());
//		}
		
		//Set<Integer> keySet = map.keySet();
	}

}
