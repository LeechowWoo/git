public class Demo {
    public static void main(String[] args) {
        int n=25;
        int ans=0;
        String s = Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

