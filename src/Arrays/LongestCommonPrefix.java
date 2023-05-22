package Arrays;

class LongestCommonPrefix {
        public static String longestCommonPrefix(String[] strs) {     
            String ans = strs[0];
            String sub = "";
            
            for (int i = 1; i < strs.length; i++) {
                
                for (int j = 0; j < Math.min(ans.length(), strs[i].length()); j++) {
    
                    if (ans.charAt(j) == strs[i].charAt(j)) {
                        sub += ans.charAt(j);
                    }
                    else{
                        break;
                    }
                }
                ans = sub;
                sub = "";
            }
            return ans;
        }
    public static void main(String args[]){
        String[] str = { "flower", "flows", "flip", "flat"};
        System.out.println(longestCommonPrefix(str));
    }
}