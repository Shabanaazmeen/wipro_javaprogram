package programs;

import java.util.ArrayList;
import java.util.List;

public class SearchElementinArrayList {

	public static void main(String[] args) {
		List<String>elements=new ArrayList<String>();
		elements.add("Red");
		elements.add("Green");
		elements.add(" Orange");
		elements.add("White");
		elements.add("Black");
		if(elements.contains("pink")) {
			System.out.println("the element is found");
		}
		else {
		System.out.println("the element is not found");
		}
		// TODO Auto-generated method stub

	}

}
