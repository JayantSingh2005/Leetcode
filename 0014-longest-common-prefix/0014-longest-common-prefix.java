class Solution {
    public String longestCommonPrefix(String[] strs) {
    char ch;int c, n=strs.length;
    String s="";
    for(int i=0;i<strs[0].length();i++)
    {
        c=0;
        ch=strs[0].charAt(i);
        for(int j=1; j<n;j++)
        {
            if(i<strs[j].length())
            if(ch==strs[j].charAt(i))
            c++;
        }
        if(c==n-1)
        s+=ch;
        else 
        break;

    }
    return s;
    }
}