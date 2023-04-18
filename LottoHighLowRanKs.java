import java.util.ArrayList;
import java.util.Arrays;

public class LottoHighLowRanKs {

	public static void main(String[] args) {
		int[] lottos= {44, 1, 0, 0, 31, 25};
		int[] win_nums= {31, 10, 45, 1, 6, 19};
		ArrayList<String> first = new ArrayList<String>();
		ArrayList<String> second = new ArrayList<String>();
		ArrayList<String> thir = new ArrayList<String>();
		ArrayList<String> Four = new ArrayList<String>();
		int box=0;
		int [] box2= new int[lottos.length];
		int [] box3= new int[win_nums.length];
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		int i=0;
		for(int x:lottos) {
			first.add("/"+x);
			if(x==0) {
				box++;
			}
		}
		for(int y:win_nums) {
			second.add("/"+y);
		}
		System.out.println(box);
		System.out.println(first.toString().replace("/0,", ""));
		System.out.println(second.toString());
		
		
	}

}
