class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1l=s1.length();
        int s2l=s2.length();

        int s1map[]= new int[26];
        int s2map[]= new int[26];
        if(s1l>s2l){
            return false;
        }
        for(int i=0;i<s1l;i++){
            s1map[s1.charAt(i)-'a']++;
            s2map[s2.charAt(i)-'a']++;

        }
        int l=0;
        int r=s1l;

        while(r<s2l){
            if(Arrays.equals(s1map,s2map)){
                return true;
            }
            int lind=s2.charAt(l)-'a';
            s2map[lind]--;
            l++;
            int rind=s2.charAt(r)-'a';
            s2map[rind]++;
            r++;
        }
        return Arrays.equals(s1map,s2map);
    }
}
