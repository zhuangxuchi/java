class Solution {
    public static int countServers(int[][] grid) {
        int res=0;
        int a=0;
        int x=grid.length,y=grid[0].length;
        for(int i = 0; i < x; i++) {
        	for(int j = 0; j < y; j++) {
        		if(grid[i][j]==1) {
        			for(int k=0;k<x;k++) {
        				if(k!=i && grid[k][j]==1) {
        					a=1;
        					res++;
        					break;
        				}
        			}
        			if(a==0) {
        				for(int l=0;l<y;l++) {
            				if(l!=j && grid[i][l]==1) {
            					res++;
            					break;
            				}
            			}
        			}
        			a=0;
        		}
        	}
        }
		return res;
    }
}