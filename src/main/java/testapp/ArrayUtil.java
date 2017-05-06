package testapp;

public class ArrayUtil {

	public ArrayUtil() {
		
	}
	
	public long sum(int[]array){
		int sum =0;
		for(int num:array)
			sum += num;
		return sum;
	}

}
