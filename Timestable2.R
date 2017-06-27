#Timestable Simple

table <-as.numeric(readline("Timestable from: "))
rnge <-as.numeric(readline("Range to: "))

print(sprintf("Timestable of %d", table))

if(table < rnge) {
  for( x in seq(1,rnge))
  print(sprintf("%d x %d = %d", table, x, table*x))
} else {
  for( x in seq(1, rnge))
    print(sprintf("%d x %d = %d", table, x, table*x))
}
