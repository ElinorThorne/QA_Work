no1 = input("Please enter your annual salary between £10,000 and £20,000:\n")
salary = int(no1)

no2 = input("Please enter your grade between 1 and 20:\n")
grade = int(no2)

dept = input("Please enter your dept; IT or HR:\n")
cto = input("Are you a CTO? Y or N:\n")

bonus=0
pay=0
if(grade>=1 and grade<=10):
		tax = (salary * 0.09)
if(dept.lower=="IT"):
	if(grade>=10 and gade<=20):
		tax = (salary * 0.13)
	if(cto.lower=="Y"):
		bonus = (salary * 0.05)
if(dept.lower=="HR"):
	if(grade>=10 and gade<=20):
		tax = (salary * 0.17)
	if(cto.lower=="Y"):
		tax = (salary * 0.02)


print(" Salary = £%d" %salary)
print(" Tax = £%.2f" %tax)
print(" Bonus = £%.2f" %bonus)
print(" Take Home = £%.2f" %(salary+bonus-tax))


