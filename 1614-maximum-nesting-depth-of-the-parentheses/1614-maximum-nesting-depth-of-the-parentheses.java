class Solution {
    public int maxDepth(String s) {
        int cnt=0,res = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '(')
            {
                cnt++;
                res = Math.max(res, cnt);
            }
            else if(s.charAt(i) == ')')
             cnt--;
        }
        return res;
    }
}