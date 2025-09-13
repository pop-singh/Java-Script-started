class Solution {
    public int maxFreqSum(String s) {
      int count_Vowel[]=new int[26];
       int count_Consonant[]=new int[26];
       int max_count=0;
       int max_count_vowel=0;
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||
        s.charAt(i)=='u'){
            count_Vowel[s.charAt(i)-'a']++;
           max_count_vowel=Math.max(count_Vowel[s.charAt(i)-'a'],max_count_vowel);

        }
        else{
           count_Consonant[s.charAt(i)-'a']++;
           max_count=Math.max(count_Consonant[s.charAt(i)-'a'],max_count);
        }
      }
     


      return (max_count_vowel+max_count);


}
}