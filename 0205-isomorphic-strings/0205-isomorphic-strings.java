class Solution {
    public String f(String s){
         Map<Character,Integer> mp = new HashMap<>();
        StringBuilder temp = new StringBuilder();
        for(int i =0; i<s.length(); ++i){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, i);
            }
            temp.append(Integer.toString(mp.get(ch)));
            temp.append(" ");
        }
        return temp.toString();
    }
    public boolean isIsomorphic(String s, String t) {
        return f(s).equals(f(t));
    }
}
// class Solution {
//     private String transformString(String s) {
//         Map<Character, Integer> indexMapping = new HashMap<>();
//         StringBuilder builder = new StringBuilder();
        
//         for (int i = 0; i < s.length(); ++i) {
//             char c1 = s.charAt(i);
            
//             if (!indexMapping.containsKey(c1)) {
//                 indexMapping.put(c1, i);
//             }
            
//             builder.append(Integer.toString(indexMapping.get(c1)));
//             builder.append(" ");
//         }
//         return builder.toString();
//     }
    
//     public boolean isIsomorphic(String s, String t) {
//         return transformString(s).equals(transformString(t));
//     }
// }