class Solution {
    public String removeOuterParentheses(String s) {
        String str = "";
        int len = s.length();
        int cnt = 0;
        for(int i = 0;i < len;i++){
            if(s.charAt(i) == '(')
            {
                if(cnt > 0)
                str += s.charAt(i);
                cnt++;
            }
           else if(s.charAt(i) == ')')
            {
                cnt--;
                if(cnt > 0)
                str += s.charAt(i);
            }
        }
        return str;
    }
}