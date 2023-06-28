package june14;
import java.util.*;

public class SupplierInfo {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of suppliers you want to add: ");
		int sNum=sc.nextInt();
		
		ArrayList<Supplier> s=new ArrayList<>();
		
		for(int i=0;i<sNum;i++)
		{
			System.out.println("enter supplier ID: ");
			int sId=sc.nextInt();
			
			System.out.println("enter supplier name: ");
			String sName=sc.next();
			
			System.out.println("enter item ID: ");
			int iId=sc.nextInt();
			
			System.out.println("enter item name: ");
			String iName=sc.next();
			
			System.out.println("enter item price: ");
			int iPrice=sc.nextInt();
			
			s.add(new Supplier());
			s.get(i).setsId(sId);
			s.get(i).setsName(sName);
			s.get(i).setI(new Item());
			s.get(i).getI().setiId(iId);
			s.get(i).getI().setiName(iName);
			s.get(i).getI().setiPrice(iPrice);
		}
			Iterator<Supplier> itr=s.iterator();
			while(itr.hasNext())
			{
				Supplier sd=itr.next();
				if(sd.getI().getiPrice()>100)
				{
					System.out.println(sd.getsName());
				}
			}
		
		
	}
}
