package basePrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDummy {

	public static void main(String[] args) {

		Set<Object> set = new LinkedHashSet<Object>();
		set.add("shiva");
		set.add(21);
		set.add("siva");
		set.add(25);

		for (Object ob : set) {

			System.out.println(ob);
		}

	}

}
