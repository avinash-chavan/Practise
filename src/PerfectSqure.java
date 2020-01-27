
public class PerfectSqure {

	public static void main(String[] args) {

			Integer [] abc  = {1,2,3,4,5,6,7,8,9};
			  int sum=0;
			for(int  i : abc)
			{
				if(Math.sqrt(i) == Math.floor(Math.sqrt(i)))
				{
					sum = sum+i;
				}
				
			}
			
		System.out.println(sum);
	}

}
