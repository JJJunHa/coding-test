
public class stringPush {

	public static void main(String[] args) {
		String parameter="abc";
		String parameter2="cba";
		int check=0;
		int answer = 0;
		for(int i=0; i<100; i++) {
		if(parameter.equals(parameter2)) {
			check=1;
			break;
		}
		String sol=parameter.substring(parameter.length()-1,parameter.length());
		String sol2=parameter.substring(0,parameter.length()-1);
		parameter=sol+sol2;
		answer++;
		}
		if(check==0) {
			answer=-1;
		}
	   System.out.println(answer);
	}

}
