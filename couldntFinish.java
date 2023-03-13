import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class couldntFinish {

	public static void main(String[] args) {
		String[] participant={"mislav", "stanko", "mislav", "ana", "ana"};
		String[] completion={"stanko", "ana", "mislav", "ana", "mislav", "ana"};
		String parti="";
		String comp="";
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		HashMap<String, Integer> hashMap2 = new HashMap<>();
		for (int i = 0; i < completion.length; i++) {
		if (hashMap.containsKey(completion[i])) {
			hashMap.put(completion[i], hashMap.get(completion[i]) + 1);
	    } else {
	    	hashMap.put(completion[i], 1);
	    }
		}
		for (int i = 0; i < participant.length; i++) {
			if (hashMap2.containsKey(participant[i])) {
				hashMap2.put(participant[i], hashMap2.get(participant[i]) + 1);
			} else {
				hashMap2.put(participant[i], 1);
			}
			
		}
		
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
		    if (entry.getValue() > 0) {
		        
		        parti=parti+entry.getKey() + " : " + entry.getValue()+" ";
		    }

		}
//		System.out.println(parti);
		for (Map.Entry<String, Integer> entry2 : hashMap2.entrySet()) {
			if (entry2.getValue() > 0) {
				if(parti.contains(entry2.getKey() + " : " + entry2.getValue())) {
					
				}else {
				comp=comp+entry2.getKey() + " : " + entry2.getValue()+" ";
				}
				}
		}
		String resul[]=comp.split(" ");
		System.out.println(resul[0]);
		
		
		
		
		

	}

}
