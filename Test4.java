
public class Test4 {

	public static void main(String[] args) {
	
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10,11};
		int count=0;
		int product=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			count++;
			product *= arr[i];
		}
		System.out.println("THE LENGTH OF THE ARRAY IS :"+count);
		System.out.println("THE PRODUCT OF ARRAY IS :"+product);

	}

}
