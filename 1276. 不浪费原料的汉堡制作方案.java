class Solution {
    public static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
		List<Integer> res=new ArrayList<>();
		if(tomatoSlices%2!=0) {
			return res;
		}
		int tj=tomatoSlices/2-cheeseSlices;
		int ts=2*cheeseSlices-tomatoSlices/2;
		if(tj<0 || ts <0) {
			return res;
		}
		else {
			res.add(tj);
			res.add(ts);
			return res;
		}
    }
}