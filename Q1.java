
public class Q1 {

	public static void main(String[] args) {
		
		String[]babbling = {"ayaye", "uuuma", "yemawoo", "ayaa","ayaa","maa","waoo","wooayamaye"};
		String[]ba = {"aya","ye","woo","ma"};
		int sum=0;
		int x=0;
		for(int i=0; i<babbling.length; i++) {
			x=x+secnod(babbling[i]);
			x=x+third(babbling[i]);
			x=x+qudra(babbling[i]);
			for(int j=0; j<ba.length; j++) {
				if(babbling[i].equals(ba[j])) {
					x++;
				}
			}
		}
		System.out.println(x);
		String b="mawoo";
		String c="aaya ye wo";
//		System.out.println("µÎ±ÛÀÚ°¹¼ö "+secnod(b));
//		System.out.println("¼¼±ÛÀÚ°¹¼ö "+third(b));
//		System.out.println("³×±ÛÀÚ°¹¼ö "+qudra(b));
	}
	static int secnod(String b) {
		
		String[]ba = {"aya","ye","woo","ma"};
		String d="";
		int total=0;
		for(int i=0; i<ba.length; i++) {
			if(!(ba[i].equals(b))) {
				for(int count=0; count<ba.length; count++) {
					String[] first=b.split(ba[count]);
					if(first[0]==d){
							for(int count2=0; count2<ba.length; count2++) {
									if(ba[count2].equals(first[1])) {
										total=1;
									}	
					    }
					}
				}
				
			}
		}
		
		return total;
	}
	static int third(String b) {
		String[]ba = {"aya","ye","woo","ma"};
		String d="";
		int total=0;
		if(secnod(b)==0){
		for(int count=0; count<ba.length; count++) {
			String[] first=b.split(ba[count]);
			if(first[0]==d){
					for(int count2=0; count2<ba.length; count2++) {
						String[] second=first[1].split(ba[count2]);
						if(second[0]==d){
							for(int count3=0; count3<ba.length; count3++) {
		
								if(ba[count3].equals(second[1])) {
									total=1;
								}	
						}
					}
			    }
			}
		  }
		}
		return total;
	}
	static int qudra(String b) {
		String[]ba = {"aya","ye","woo","ma"};
		String d="";
		int total=0;
		for(int count=0; count<ba.length; count++) {
			if(third(b)==0&&secnod(b)==0){
			String[] first=b.split(ba[count]);
			if(first[0]==d){
					for(int count2=0; count2<ba.length; count2++) {
						String[] second=first[1].split(ba[count2]);
						if(second[0]==d){
							for(int count3=0; count3<ba.length; count3++) {
								String[] third=second[1].split(ba[count3]);
								if(third[0]==d) {
									for(int count4=0; count4<ba.length; count4++) {
										
										if(ba[count4].equals(third[1])) {
											total=1;
										}	
								}
									
								}
									
						}
					}
			    }
			}
		}
		}
		return total;
	}
	public static int solution(String[] babbling) {
//        String a=babbling[0].split("a");
		int answer = 100;
        return answer;
    }
}
