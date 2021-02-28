package popups;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
       ArrayList<String> al=new ArrayList<String>();
       al.add("mitrabhanu");
       al.add("devika");
       al.add(null);
       al.add("rasmita");
       al.add(null);
       System.out.println(al);
       
       ArrayList<String> al1=new ArrayList<String>();
       al1.addAll(al);
       al1.add("mitrabhanu");
       al1.add("devika");
       System.out.println(al1);
       System.out.println(al1.size());
     

	}

}
