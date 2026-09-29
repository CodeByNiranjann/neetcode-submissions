class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
       int res=0;

        int l=0;
         int fmap[]= new int[26];
            int max=0;
        for(int r=0;r<n;r++){
           
            fmap[s.charAt(r)-'A']++;
            max=Math.max(max,fmap[(s.charAt(r)-'A')]);
            int length=r-l+1;
            if(length-max>k){
                fmap[s.charAt(l)-'A']--;
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
