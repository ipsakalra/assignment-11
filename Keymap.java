import java.util.*;
class Keymap{
	public static void main(String[] args){
		
		HashMap<Integer,String>na=new HashMap<Integer,String>();

		na.put(1,"ipsa");
		na.put(2,"komal");
		for(Map.Entry x:na.entrySet()){
		System.out.println(x.getKey()+" "+x.getValue());
	}
}
	}
