ones <- function(a){
  
  return(switch(a,"one ","two ","three ","four ","five ","six ","seven ","eight ","nine "))
}

teens <- function(a){
  return(switch(a,"eleven ","twelve ","thirteen ","fourteen ","fifteen ", "sixteen ","seventeen ","eighteen ","nineteen "))
}

tens <- function(a){
  return(switch(a,"ten ", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ","eighty ","ninety "))
}

wordChange <- function(a){
  pounds <- trunc(a)
  pence <- (a %% 1)*100
  
  word <- NULL
  wordp <- NULL
  
  if(pounds>=1000){
    word <- paste(word, ones(pounds/1000), "thousand and ")
    pounds = pounds%%1000;
  }
  
  if(pounds>=100){
    word <- paste(word, ones(pounds/100), "hundred and ")
    pounds = pounds%%100
  }
  
  if(pounds>10 && pounds<20){
    word <- paste(word, teens(pounds%%10))
  } else{
    x = trunc(pounds/10)
    word <- paste(word, tens(x))
    pounds = pounds%%10;
    word <- paste(word, ones(pounds))
  }
  
  if(pence>=1000){
    wordp <- paste(wordp, ones(pence/1000), "thousand and ")
    pence = pence%%1000;
  }
  
  if(pence>=100){
    wordp <- paste(wordp, ones(pence/100), "hundred and ")
    pence = pence%%100
  }
  
  if(pence>10 && pence<20){
    wordp <- paste(wordp, teens(pence%%10))
  } else{
    x = trunc(pence/10)
    wordp <- paste(wordp, tens(x))
    pence = pence%%10;
    wordp <- paste(wordp, ones(pence))
  }
  
  word <- paste(word, "pounds and")
  wordp <- paste(wordp, "pence")
  
  finalWord <- paste(word, wordp)
  
  return(finalWord)
  
  
}

bill <- as.numeric(readline("Bill: "))
cash <- as.numeric(readline("Cash: "))
change <- cash - bill
changeW <- change

print(sprintf("Change due = £%.2f", change))

fifty <- as.integer(change / 50)
change <- change - (fifty * 50)
if(fifty>0)
  print(sprintf("£50: %d", fifty))

twenty <- as.integer(change / 20)
change <- change - (twenty * 20 )
if(twenty>0)
  print(sprintf("£20: %d", twenty))

ten <- as.integer(change / 10)
change <- change - (ten * 10 )
if(ten>0)
  print(sprintf("£10: %d", ten ))

five <- as.integer(change / 5)
change <- change - (five * 5 )
if(five>0)
  print(sprintf("£5: %d", five))

two <- as.integer(change / 2)
change <- change - (two * 2 )
if(two>0)
  print(sprintf("£2: %d", two ))

one <- as.integer(change / 1)
change <- change - (one * 1 )
if(one>0)
  print(sprintf("£1: %d", one ))

fiftyP <- as.integer(change / 0.5)
change <- as.single(change - (fiftyP * 0.50 ))
if(fiftyP > 0)
  print(sprintf("50p: %d", fiftyP ))

twentyP <- as.integer(change / 0.2)
change <- as.single(change - (twentyP * 0.20 ))
if(twentyP > 0)
  print(sprintf("20p: %d",twentyP ))

tenP <- as.integer(change / 0.1)
change <- as.single(change - (tenP * 0.10 ))
if(tenP > 0)
  print(sprintf("10p: %d", tenP ))

fiveP <- as.integer(change / 0.05)
change <- as.single(change - (fiveP * 0.05 ))
if(fiveP > 0)
  print(sprintf("5p: %d", fiveP ))

twoP <- as.integer(change / 0.02)
change <- as.single(change - (twoP * 0.02))
if(twoP > 0)
  print(sprintf("2p: %d", twoP ))

oneP <- as.single(change / 0.01)
entire1p <- as.double(trunc(oneP))
change <- as.single(change - (entire1p * 0.01 ))
if(entire1p > 0)
  print(sprintf("1p: %d", as.integer(entire1p)))

print(wordChange(changeW))