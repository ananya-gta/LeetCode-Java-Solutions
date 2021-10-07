class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb= new StringBuilder();
            String[] word = sentence.split(" ");
            String goat="maa";
        for(int i = 0; i < word.length; i++) {
            char ch = word[i].charAt(0);
                
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                sb.append(word[i] + goat + " ");
                
             else 
                sb.append(word[i].substring(1) + word[i].charAt(0) + goat + " ");
                
               goat+= "a" ;
        }   
            return sb.toString().trim();
    }
}
