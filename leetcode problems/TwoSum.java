import java.util.*;
class TwoSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+a.length+" Elements");

		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		int target;
		System.out.println("Enter target value");

		{
			target=sc.nextInt();
		}

		HashMap <Integer,Integer> map=new HashMap<>();
		for(int i=0;i<=a.length-1;i++)
		{
			if(map.containsKey(a[i]))
			{
				int b[]=new int []{map.get(a[i]),i};
				System.out.println(Arrays.toString(b));
			}
			else
			{
				map.put(target-a[i],i);
				
			}
		}
		
	} 
}
