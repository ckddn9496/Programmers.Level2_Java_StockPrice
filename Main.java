import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		System.out.println(Arrays.toString(new Solution().solution(prices)));
	}
	static class Solution {
	    public int[] solution(int[] prices) {
	        int[] answer = new int[prices.length];
	        for (int i = 0; i < prices.length; i++) {
	        	int num = prices[i];
	        	for (int j = i + 1; j < prices.length; j++) {
		        	if (prices[j] < num) {
		        		answer[i] = j - i;
		        		break;
		        	}
		        	if (j == prices.length - 1)
		        		answer[i] = j - i;
	        	}
	        }
	        return answer;
	    }
	}
}
