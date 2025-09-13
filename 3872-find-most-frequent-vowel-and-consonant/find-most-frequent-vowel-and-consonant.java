class Solution {
    public int maxFreqSum(String s) {
    
       int Frequency[]=new int[26];
       int max_count_consonant=0;
       int max_count_vowel=0;
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||
        s.charAt(i)=='u'){
            Frequency[s.charAt(i)-'a']++;
           max_count_vowel=Math.max(Frequency[s.charAt(i)-'a'],max_count_vowel);

        }
        else{
            Frequency[s.charAt(i)-'a']++;
           max_count_consonant=Math.max(Frequency[s.charAt(i)-'a'],max_count_consonant);
        }
      }
     


      return (max_count_vowel+max_count_consonant);


}
}