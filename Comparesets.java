import java.util.*;
class Comparesets{
	public static void main(String[] args){
		HashSet<String> hs=new HashSet<String>();
		hs.add("komal");
		hs.add("jyoti");
		hs.add("aanchal");
		hs.add("diksha");
		hs.add("radhika");
		hs.add("gaytri");
		System.out.println("friend: "+hs);

		HashSet<String> subset=new HashSet<String>();
		subset.add("priya");
		subset.add("pratima");
		subset.add("shweta");
		subset.add("simran");
		subset.add("radhika");
		subset.add("gurleen");
		subset.add("himanshi");
		System.out.println("school friend: "+subset);
		hs.retainAll(subset);
		System.out.println(hs);
		

	}
}