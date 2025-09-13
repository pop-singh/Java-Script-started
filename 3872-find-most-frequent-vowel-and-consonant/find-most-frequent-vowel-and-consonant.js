/**
 * @param {string} s
 * @return {number}
 */
var maxFreqSum = function(s) {
    let frequency = new Array(26).fill(0); 
    let maxVowelCount = 0;
    let maxConsonantCount = 0;
    const vowels = new Set(['a', 'e', 'i', 'o', 'u']);
    
    for (let i = 0; i < s.length; i++) {
        let char = s[i].toLowerCase();
       
        let idx = char.charCodeAt(0) - 'a'.charCodeAt(0);
        
        frequency[idx]++;
        
        if (vowels.has(char)) {
            if(frequency[idx] > maxVowelCount) {
                maxVowelCount = frequency[idx];
            }
        } else {
            if(frequency[idx] > maxConsonantCount) {
                maxConsonantCount = frequency[idx];
            }
        }
    }
    return maxVowelCount + maxConsonantCount;
};
