package classpraticsepkg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPracise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs= new HashSet();
		hs.add("frg");
		hs.add(10);
		Iterator it =hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
