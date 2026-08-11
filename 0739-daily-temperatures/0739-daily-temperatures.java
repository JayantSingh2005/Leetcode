class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prevIndex = st.pop();
                ans[prevIndex] = i - prevIndex; // distance to next warmer day
            }
            st.push(i);
        }
        return ans;
    }
}
