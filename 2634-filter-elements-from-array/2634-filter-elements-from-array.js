/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const arr2 = [];
    let j=0;
    for(let i=0; i<arr.length; i++){
        if(fn(arr[i], i)){
            arr2[j++]=arr[i];
        }
    }
    return arr2;
};