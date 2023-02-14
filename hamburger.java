
public class hamburger {

	public static void main(String[] args) {
		int answer=0;
		String notthing="";
		
		int[]ingredient= {1,2,3,1,2, 1, 1,1,2,3,1,2, 3, 1, 2, 3, 1,1,2,3,1};
	
		int i=0;
		for(int x:ingredient) {
			notthing+=String.valueOf(x);
			i++;
		}
		String notthing2=notthing;
		while(notthing2.contains("1231")) {
		notthing=notthing.replace("1231", "7");
		for(i=0; i<notthing.length();i++) {
			if(notthing.substring(i,i+1).matches("7")) {
				answer++;
				}
		}
		notthing2=notthing2.replace("1231", "");
		notthing=notthing2.replace("1231", "7");
		
//		System.out.println(notthing2);
		}
		System.out.println(answer);
//		if(notthing.contains("1231")) {
//			answer++;
//			String[]cut=notthing.split("1231");
//			while((cut[0]+cut[1]).contains("1231")){
//				
//			}
//			
//			cut=(cut[0]+cut[1]).split("1231");
//			System.out.println(cut[0]);
//		}
		
//		String test="1231";
//		String test4="1123112311231";
//		String test1[]=test4.split(test);
//		String test2=test4.substring(test4.length()-4,test4.length());
//		System.out.println(test2);
//			if(test2.equals("1231")) {
//				answer++;
//			}
//			if(test.equals(test4)) {
//				answer++;
//			}
//			System.out.println(test1.length);
//		answer=answer+test1.length;
//		answer--;
//		System.out.println(answer);
//		for(String x:test1) {
////			System.out.println(x);
//		}
		
		
		
	}

}
