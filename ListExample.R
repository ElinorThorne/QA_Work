#V1 <- c(1,2,3)
#V2 <- c('a','b','c')
#V3 <- c(4,5,6)
#L <- list(V1, V2, V3) 
#the above contains copies of V1, V2, V3

#SELECT WHICH VECTOR WITHIN LIST TO PRINT
#print(L[3])
#print(L[2])
#print(L[1])

#SELECT MULTIPLE VECTORS FROM LIST TO PRINT
#print(L[c(1, 3)])

#SELECT [VECTOR] [POSITION] TO INSERT/AMEND
#L[[2]][1] <- "d"
#print(L[2])

#NAMED LIST & SLICING
#L2 <- list(Harvey=c(14, "M", "Brizzle"), Elinor=c(29, "F", "Risca"))
#print(L2["Elinor", "Harvey"])

#SELECTING A PARTICULAR VECTOR FROM A PARTICULAR LIST
#print(L2[["Harvey"]][1])
#print(L2[["Harvey"]][2])
#print(L2[["Harvey"]][3])

#####################################################################

#CREATE LIST VIA FUNCTION
#t<-function(...){
#  for(a in c(...))
#    list(a) 
#  return(L[3])
#}

#V1 <- c(1,2,3)
#V2 <- c('a','b','c')
#V3 <- c(4,5,6)

#t(c(V1,V2,V3))

####################################################################

#MATRICES

Shafeeq<-c(95, 46, 93)
Harvey<-c(92, 35, 58)
Elinor<-c(93, 83, 75)
Sufyan<-c(92, 12, 27)
Jane<-c(96, 68, 78)
Luke<-c(12, 85, 73)
Chris<-c(95, 65, 48)

Susan<-c(95, 46, 93)
Colin<-c(92, 35, 58)
Ian<-c(93, 83, 75)
Eddie<-c(92, 12, 27)
Marnie<-c(96, 68, 78)
Mel<-c(12, 85, 73)
Clive<-c(95, 65, 48)

Results1<-rbind(Shafeeq, Harvey, Elinor, Sufyan, Jane, Luke, Chris)
colnames(Results1)<-c("Physics", "Chemistry", "Math")
#print(Results1)

Results2<-rbind(Susan, Colin, Ian, Eddie, Marnie, Mel, Clive)
#colnames(Results2)<-c("Physics", "Chemistry", "Math")
#print(Results2)

Results3<-rbind(Results1, Results2)
print(Results3)

grade <- function(x) {
  r <- sum(x)
  p <- r*100/450
  if(p >= 60) "Pass" else "Fail"
}

apply(Results3,2,grade)



#NAME COLUMNES
#print(colnames(Results)<-c("Physics", "Chemistry", "Math"))

#PRINT EVERYTHING
#print(Results<-rbind(Shafeeq, Harvey, Elinor, Sufyan, Jane, Luke, Chris))

#Name[Row,Col]
#print(Results[1,2])
#print(Results[1,])
#print(Results[,1])
#print(Results[1:2,])
#print(Results[1,c(1,3)])
#print(Results["Shafeeq", "Chemistry"])

#ROW ATTRIBUTES
#attributes(Results)

#COLUMN ATTRIBUTES
#dim(Results)
