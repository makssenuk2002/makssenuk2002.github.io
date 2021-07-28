function pigIt(str){
    const text = str.split(' ')
    let ans = ''
    for(let i = 0; i< text.length ; i++ ){
      const word = text[i].split('');
      const firstLetter = word[0];
      const wordWithoutLetter = word.slice(1, ).join('')
      ans += (`${wordWithoutLetter}${firstLetter }ay ` );
    }
    return ans
  }
  console.log(pigIt('hisTay siay ymay tringsay'));