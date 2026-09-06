class Solution {
    public boolean isValidSudoku(char[][] b) {
        Set set=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=b[i][j];
                if(c!='.'){
                    if(!set.add(c+" in r "+i) || !set.add(c+"in c"+j) 
                    || !set.add(c+"in b"+i/3+"."+j/3)){
                        return false;
                    }

                }
            }
        }
        return true;
    }
}
