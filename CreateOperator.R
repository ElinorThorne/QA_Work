`%VAT%`<-function(Salary,Tax){
  VAT=(Salary*Tax)/100
  return(VAT)
}

print(2000%VAT%21)