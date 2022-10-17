class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> temp = new HashSet<>();
        for(int i =0; i< sentence.length(); i++){
            char ch = sentence.charAt(i);
            temp.add(ch);
        }
        return temp.size() == 26;
    }
}