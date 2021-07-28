function dec2bin(dec){
  let num = dec.toString(2);
  var digits = num.toString().split('');
  var realDigits = digits.map(Number)
 

  let number = 0;
  for(let i = 0;i< num.length; i++ ){
    number += realDigits[i];
  }
  console.log(number);
}
dec2bin(24274179)