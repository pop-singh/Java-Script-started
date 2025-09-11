class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> sortedString=new ArrayList<>();
        String result="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
                  s.charAt(i)=='o'||s.charAt(i)=='u' ||  s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I' ||s.charAt(i)=='O'||s.charAt(i)=='U' ){
                    sortedString.add(s.charAt(i));
             
        }
        }
  
   Collections.sort(sortedString);
   int index=0;
    for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
                  s.charAt(i)=='o'||s.charAt(i)=='u' ||  s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I' ||s.charAt(i)=='O'||s.charAt(i)=='U' ){
               result+=sortedString.get(index++);    
             
        }
        else{
            result+=s.charAt(i);
        }
        }


         return result;
    }
}