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

if(a>=1000){
  word = sprintf("%s thousand ", ones(a/1000))
  print(word)
  a = a%%1000;
  #print(sprintf("The result is now: %d", a))
}

if(a>=100){
  word = sprintf("%s hundred and ", ones(a/100))
  print(word)
  a = a%%100;
  #print(sprintf("The result is now: %d", a))
}

if(a>10 && a<20){
  word = (teens(a%%10))
  print(word)
  #a = a%%10;
  #print(sprintf("The result is now: %d", a))
} else{
  x = trunc(a/10)
  print(tens(x))
  a = a%%10;
  print((ones(a)))
}