/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
   let res=init;
   let sum=0;
   for(let i=0;i<nums.length;i++)
   {
        sum=fn(res,nums[i]);
       res=sum;
   }
   return res;
    
};