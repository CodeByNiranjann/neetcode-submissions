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
        int matches=0;
        for(int i=0;i<26;i++){
            if(s1map[i]==s2map[i]){
                matches++;
            }
        }

        int l=0;
        int r=s1l;

        while(r<s2l){
            if(matches==26){
                return true;
            }
            int lind=s2.charAt(l)-'a';
            s2map[lind]--;
            if(s1map[lind]==s2map[lind]){
                matches++;
            }else if(s1map[lind]-1==s2map[lind]){
                matches--;
            }
            l++;
            int rind=s2.charAt(r)-'a';
            s2map[rind]++;
            if(s1map[rind]==s2map[rind]){
                matches++;
            }else if(s1map[rind]+1==s2map[rind]){
                    matches--;
            }
            r++;
        }
        return Arrays.equals(s1map,s2map);
    }
}
