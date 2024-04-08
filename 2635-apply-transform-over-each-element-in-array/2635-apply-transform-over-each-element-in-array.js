/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const list = Array(arr.length);
    for(let i = 0; i < arr.length; i++){
        list[i] = fn(arr[i], i);
    }
    return list;
};