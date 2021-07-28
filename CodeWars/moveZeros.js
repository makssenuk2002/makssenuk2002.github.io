var moveZeros = function (arr) {
    let str = arr.length;
    for (let i = 0; i < str; i++) {
        if (arr[i] === 0){
            arr.push(0);
            arr.splice(i,1);
            // str--;
            i--
        }
    }
    return(arr)
}
console.log(moveZeros([9,0,0,1,2,1,1,3,1,9,0,0,9,0,0,0,0,0,0,0]));