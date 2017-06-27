#Task Fail

failures <- 0
result<- ((Physics+Math+Chemistry) / 450) * 100
Physics <- as.numeric(readline("Physics: "))
Maff <- as.numeric(readline("Math: "))
Chemistry <- as.numeric(readline("Chemisrty: "))


#if( Physics<0 || Physics>150 )
#  print("Incorrect.  Please try again")

#if( Maff<0 || Maff>150 )
#  print("Incorrect.  Please try again")

#if( Chemistry<0 || Chemistry>150 )
#  print("Incorrect.  Please try again")

#if( Physics < 70 )
#  failures <- failures + 1

if( Maff < 70 )
  failures <- failures + 1

if( Chemistry < 70 )
  failures <- failures + 1

if (failures == 3 )
  print("Go home, you're drunk")
if (failures == 2 )
  print("Re-take year")
if(failures == 1 )
  print("Re-sit your exam")
if(failures == 0 )
  print("Congratulations you passed")