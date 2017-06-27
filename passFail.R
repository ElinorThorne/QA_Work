#Task Fail

failures <- 0

no1 <- readline("Physics: ")
no2 <- readline("Math: ")
no3 <- readline("Chemisrty: ")

Physics <- as.numeric(no1)
Maff <- as.numeric(no2)
Chemistry <- as.numeric(no3)

#result<- Physics+Math+Chemistry
#sprintf("Physics %d",result)

if( Physics < 70 )
  failures <- failures + 1

if( Maff < 70 )
  failures <- failures + 1

if( Chemsitry < 70 )
  failures <- failures + 1

if (failures == 3 )
  print("Go home, you're drunk")
if (failures == 2 )
  print("Re-take course")
if (failures == 1 )
  print("Re-take exam")