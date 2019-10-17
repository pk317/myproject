package classpraticsepkg;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List  li = new ArrayList();
		li.add(10);
		li.add("abc");
		li.add(12.4f);
		li.add(20.5);
		int size= li.size();
	System.out.println(li);	
	
	ListIterator ui = li.listIterator();
	
	while (ui.hasNext()) {
		System.out.println(ui.next());
	}
	//for(int i=0;i<li.size();i++) {
		
		//System.out.println(li.get(i));
	
/*	for(Object ob:li) {
		
		System.out.println(ob);
	}*/
	
	


	}

}
