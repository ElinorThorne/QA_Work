ones <- function(a){
  
  return(switch(a,"one ","two ","three ","four ","five ","six ","seven ","eight ","nine "))
}

teens <- function(a){
  return(switch(a,"eleven ","twelve ","thirteen ","fourteen ","fifteen ", "sixteen ","seventeen ","eighteen ","nineteen "))
}

tens <- function(a){
  return(switch(a,"ten ", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ","eighty ","ninety "))
}

a <-as.numeric(readline("Insert number 1-9999: "))

word <- NULL

if(a>=1000){
  word <- paste(word, ones(a/1000), "thousand ")
  a = a%%1000;
}

if(a>=100){
  word <- paste(word, ones(a/100), "hundred and ")
  a = a%%100;
}

if(a>10 && a<20){
  word <- paste(word, teens(a%%10))
} else{
  x = trunc(a/10)
  word <- paste(word, tens(x))
  a = a%%10;
  word <- paste(word, ones(a))
}

print(word)