class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        String rts = "";

    for(int i = 0; i < s.length(); i++){
    if(Character.isLetterOrDigit(s.charAt(i))){
        char ch = s.charAt(i);
        ch = Character.toLowerCase(ch);
        str += ch;
        rts = ch + rts;
      }
    }
    
    if(str.equals(rts)){
        return true;
    }
   else {
    return false;
   }
  

    }
}
