ABC <- function(A,B){
  c = A+B
  return(c)
}

F <- function(X){
  A = X(2,7)
  B = paste("Result: ", A)
  return(B)
}

print(F(ABC))
print(do.call(ABC, list(7,8)))


f2<- function(){
    f3<-function(a,b){
      c=paste("the result",(a+b))
    }
    
    return (f3)
}

x = f2()
print(x(2,3))