class Solution {
    public String longestCommonPrefix(String[] strs) {
        String aux = "", fina = "";
        int tam;
        
        for(int i = 0; i < strs.length; i++){
            
            if(strs.length == 1){
                return strs[0];
            }
                
            if(i == 0){
                fina = strs[0];
            }
            
            else{
                if(fina.length() > strs[i].length()){
                    tam = strs[i].length();
                }
                else{
                    tam = fina.length();
                }
                
                aux = "";
                
                for(int j = 0; j < tam; j++){
                    if(fina.charAt(j) == strs[i].charAt(j)){
                        aux += strs[i].charAt(j);
                    }
                    else break;
                }
                fina = aux;
            }
        }
        return aux;
    }
}
