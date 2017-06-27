A<-10

x<-function(){
  print(A)
  A<<-15
  ABC<-function(){
    print(A)
    A<-16
  }
  ABC()
  print(A)
}

x()
