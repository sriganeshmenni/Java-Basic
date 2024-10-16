public class Solution {
        public static void main(String[] args){
            String s = "abcde";
            String goal = "cdeab";
            char[] b = s.toCharArray();
            char[] c = goal.toCharArray();
            System.out.println(c);
            int n = b.length;
            for(int i=0;i<n;i++){
                 char ch = b[i];
                 b[i]=b[n-i-1];
                 b[n-i-1]=ch;
                 System.out.println(b);
        }
}
}
