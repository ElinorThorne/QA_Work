#Timestable Simple

table <-as.numeric(readline("Timestable: "))
rnge <-as.numeric(readline("Range: "))
  
print(sprintf("Timestable of %d", table))

for( x in seq(1,rnge))
  print(sprintf("%d x %d = %d", table, x, table*x))
  