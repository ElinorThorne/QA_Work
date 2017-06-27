course <- c('Java', 'VB', 'R', 'SQL')
salary <- c(1700, 1600, 400, 700)
num <- seq(1000,1100, by=5)
mark <- c('Shafeeq' = 170,
          'Peter' = 175,
          'John' = 180)

print(sprintf("The 4th course is: %s", course[4]))
print(sprintf("Shafeeq's marks are: %d", (mark['Shafeeq'])))
print(sprintf("The sum of salary is: %d", sum(salary)))
print(sprintf("The min of salary is: %d", min(salary)))
print(sprintf("The max of salary is: %d", max(salary)))
print(sprintf("The length of salary is: %d", length(salary)))

print(sprintf("Courses 1-3 are: %s", course[1:3]))
print(sprintf("The 1st and 4th courses are: %s", (course[c(TRUE, FALSE,FALSE, TRUE)])))
print(sprintf("Every other course is: %s", (course[c(TRUE, FALSE)])))
print(sprintf("All salaries above 700 are: %d", (salary[salary>700])))