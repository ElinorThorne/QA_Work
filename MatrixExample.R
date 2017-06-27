Shafeeq<-c(95, 95, 93)
Harvey<-c(53, 35, 58)
Elinor<-c(93, 83, 75)
Sufyan<-c(92, 72, 27)
Jane<-c(96, 68, 78)
Luke<-c(82, 85, 73)
Chris<-c(95, 65, 48)

Susan<-c(95, 46, 93)
Colin<-c(92, 35, 58)
Ian<-c(93, 83, 75)
Eddie<-c(92, 12, 27)
Marnie<-c(96, 68, 78)
Mel<-c(12, 85, 73)
Clive<-c(10, 6, 70)

Results1<-rbind(Shafeeq, Harvey, Elinor, Sufyan, Jane, Luke, Chris)
Results2<-rbind(Susan, Colin, Ian, Eddie, Marnie, Mel, Clive)
Results3<-rbind(Results1, Results2)
print(colnames(Results1)<-c("Physics", "Chemistry", "Math"))

print(Results3)

grade <- function(x) {
  total <- sum(x)
  percentage <- total*100/450
  if(percentage > 70)
    "Pass"
  else 
    "Fail"
}

print(apply(Results3,1,grade))
