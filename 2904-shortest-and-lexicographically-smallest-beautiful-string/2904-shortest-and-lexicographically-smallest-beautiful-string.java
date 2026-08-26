class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int one = 0, l = s.length(),left = 0;
        String ans = "";
        for(int i = 0;i < l;i++)
        {
            if(s.charAt(i) == '1')
            one++;
            while(one > k){
                if(s.charAt(left) == '1')
                one--;
                left++;
            }
            if(one == k){
                while(left < i && s.charAt(left) == '0'){
                    left++;
                }
                String cur = s.substring(left, i + 1);
                if(ans.isEmpty() || cur.length() < ans.length() || (cur.length() == ans.length() && cur.compareTo(ans) < 0)){
                    ans = cur;
                }
            }

        }
        return ans;
    }
}