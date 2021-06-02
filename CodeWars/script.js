
// function tribonacci(q,n){
//   let array = q;
//   if(n==0){
//     return array;
//   }else{
//   for(let i = 0 ; i<n; i++){
//       array.push(array[i]+array[i+1]+array[i+2])
//   }
//   console.log(array);
//   }
// }
// tribonacci([12,11,31],10);


// function validatePIN (pin) {
//   var num = pin;
//   var digits = num.toString().split('');
//   var realDigits = digits.map(Number)
  
//   if(realDigits.length == 4 && Number.isInteger(+pin) && pin>=0 && realDigits[realDigits.length-2].toString() != "NaN" && realDigits[realDigits.length-1].toString() != "NaN" ){
//     console.log(true);
//   }else if(realDigits.length == 6 && Number.isInteger(+pin) && pin>=0 && realDigits[realDigits.length-2].toString() != "NaN" && realDigits[realDigits.length-1].toString() != "NaN"){
//     console.log(true);
//   }else{
//     console.log(false);  
//   }
 
//   console.log(realDigits);
// }
// validatePIN('111 ')


// function validatePIN (pin) {
//   //return true or false
//   var n = pin.length;
//   if( n != 4 && n != 6)
//       console.log(false);;
//   for (var i in pin)
//       if (pin[i] > '9' || pin[i] < '0')
//           console.log(false);;
//   console.log(true);
// }
// validatePIN('1111.0')

// function disemvowel(str){
//   var num = str;
//   var digits = num.toString().split('');
//   var realDigits = digits.map(String)


//   for(let i = 0 ; i<  realDigits.length ; i++){
//     if(realDigits[i] == "a" ){
//        realDigits.splice(i,1)
//     }
//   }

//   console.log(realDigits);
// }
// disemvowel("aaaaaaaaasdaassssaaadeeead")

// function removeVowels( input ){
//   return input.replace(/[aeiou]/gi, ""); 
// }
// console.log(removeVowels(`iAnHrPXuWKXj mvOopMnfyaY wjEeozwXVoZzvPFj") should equal "nHrPXWKXj mvpMnfyY wjzwXVZzvPFj`));

var lines = 7;
var str = " ";
var star = "*";
for(var i = 0; i < 5; i++){
    str += star;
    console.log(str);
}