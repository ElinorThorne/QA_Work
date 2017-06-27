Add <- function(A,B){
  C<-A+B
  print(sprintf("The result of %d + %d = %d", A, B, C))
}

Subtract <- function(A,B){
  C<-A-B
  return(C)
}

print(Subtract(9,8))

