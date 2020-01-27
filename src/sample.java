import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sample {

	public static void main(String[] args) {
		System.out.println("hello");
		
		int [] arr = {4,1,2,1,3,1,1,2,2,4,5,6,4,4,5,5};
		long [] arr1 = {4,1,2,1,3,1,1,2,2,4,5,6,4,4,5,5};
		  long bg  = 0;
		 for (long i : arr1)
		 {
			bg=bg+i;
		 } 
		Map <Integer,Integer> occurenceMap = new HashMap ();
		
		for (Integer i : arr) {
			
				occurenceMap.put(i,  (int)occurenceMap.getOrDefault(i, 0)+1);	
		}
		//occurenceMap.getOrDefault(1, 1);
		//occurenceMap.entrySet().stream().sorted()
		System.out.println("HashMap"+occurenceMap);
		int  sum = occurenceMap.values().stream().mapToInt(Integer :: valueOf).sum();
		int i = 3/2;
		System.out.println(1000000001 +1000000002+ 1000000003 +1000000004 +1000000005);
		int sockMerchant = sockMerchant(4, arr);
		System.out.println(sockMerchant);

	}
	
	static int sockMerchant(int n, int[] ar) {
        Map <Integer,Integer> m =  new HashMap ();
      for(int i : ar)
      {
    	  m.put(i,  (int)m.getOrDefault(i, 0)+1);	
      }
      return  m.values().stream().map(a-> a/2).mapToInt(Integer::valueOf).sum();
    }
	
	 static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int alice =0 , bob=0;
		 for (int i=0 ; i<a.size() ; i++)
		{

			 if(a.get(i) != b.get(i))
			 {
          if(a.get(i)>b.get(i))
        	  alice++;
          else
        	  bob++;
			 }
        	  
        	  
	    }
		 return Arrays.asList(alice,bob);

	 }
	 String abc = "";
	
}
