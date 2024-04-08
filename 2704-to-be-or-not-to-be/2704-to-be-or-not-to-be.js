/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: (x) => {
            if (x !== val) {
                throw new Error("Not Equal");
            }
            return true;
        },
        notToBe: (x) => {
            if (x === val) {
                throw new Error("Equal");
            }
            return true;
        }
    };
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */