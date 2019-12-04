class Solution {
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
		Arrays.sort(products);
		List<List<String>> res = new ArrayList<>();
		int b=0;
		for(int i=0,searchWord_Len=searchWord.length();i<searchWord_Len;i++) {
			List<String> temp = new ArrayList<>();
			int a=0;
			for(int j=0,products_Len=products.length;j<products_Len;j++) {
				for(int k=0;k<=i;k++) {
					if(i < products[j].length() && searchWord.charAt(k)==products[j].charAt(k)) {
						b=1;
					}else {
						b=0;
						break;
					}
				}
				if(b==1) {
					temp.add(products[j]);
					a++;
				}
				if(a==3) {
					break;
				}
			}
			res.add(temp);
		}
		return res;
    }
}