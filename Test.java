class Solution {
    @SuppressWarnings("unused")
    public static boolean rotateString(String s, String goal) {
      //  int n = s.length;
       char[] b = s.toCharArray();
       char[] c = goal.toCharArray();
       int n = b.length;
       for(int i=0;i<n/2;i++){
            char ch = b[i];
            b[i]=b[n-i-1];
            b[n-i-1]=ch;
            if(b==c){
                return true;
            }
            break;
        }
        return false;
    }
    public static void main(String[] args){
        String s = "abcde";
        String goal = "cdeab";
        boolean k = rotateString(s,goal);
        System.out.println(k);
    }
}