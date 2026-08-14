class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character , Integer> map = new HashMap<>();
        int i = 0, res = 0, n = s.length();
        for(int j = 0; j < n;j++)
        {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while(map.get(c) > 2)
            {
                char ch = s.charAt(i);
                map.put(ch, map.get(ch) - 1);
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}