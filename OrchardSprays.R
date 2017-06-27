#s<- rbind(OrchardSprays)
#print(s[which.max(s[,1]),])


#print(OrchardSprays[])
  
#print(dim(OrchardSprays)[1])

#print(OrchardSprays[max("decrease")])


for(i in seq(OrchardSprays[i,dim(OrchardSprays)[1]])){
  if( OrchardSprays[i,"decrease"] == max(OrchardSprays$decrease) )
    print(OrchardSprays[i, ])
}

#for(i in seq(OrchardSprays[i,dim(OrchardSprays)[1]])){
#  if( OrchardSprays[i,"decrease"] == OrchardSpreays[max("decrease")] )
#    print(OrchardSprays[i, ])
#}

