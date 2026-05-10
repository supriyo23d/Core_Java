package breakstatement2feb;

public class Break {
	public static void main(String[] args) 
	{
		String[] electronicProducts= {"laptop","smartphone",null,"powerbank",null};
		//1 st nul pe break ho jayega
		for(int index=0;index<electronicProducts.length;index++);
		{
			
			System.out.println("Executing "+index+" time");
			String currentProduct =electronicProducts[index];
			if(currentProduct==null)
			{
				System.out.println("Found null products");
				continue;
			}
		}
	}
}
