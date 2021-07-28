function nextBigger(n){
    const digits = n.toString().split('')
    const realDigits = digits.map(Number)
    for(let i=0; i<realDigits.length ; i++){
      if(realDigits[i]< realDigits[i+1]){
        let tmt = realDigits[i+1];
        realDigits[i+1] =realDigits[i]
        realDigits[i] = tmt
      }
    }
    const num = realDigits.join('');
    if(num == n ){
      return -1
    }else{
      return num
    }
  }
  
  console.log(nextBigger(979446422486641));