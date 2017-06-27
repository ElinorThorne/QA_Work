t<-function(...){
  for(a in c(...))
    print(a)  
}

t(c(2,5,7,8,52,4,28,3,45))