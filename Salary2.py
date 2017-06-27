no1 = input("Please enter your annual salary between £10,000 and £20,000:\n")
salary = int(no1)

no2 = input("Please enter your grade between 1 and 20:\n")
grade = int(no2)

dept = input("Please enter your dept; IT or HR:\n")
cto = input("Are you a CTO? Y or N:\n")


if( salary > 15000 ):
	#IT + CTO	
	if(dept == "IT" and cto == "Y"):
		bonus = (salary * 0.05)
		print( "IT CTO pays no tax")
	#IT + grades
	elif( dept == "IT" ):
		if (grade >=1 and grade <=10):
			pay = salary - (salary * 0.09)
			print("Your yearly income after tax is £%d" %pay)
		else:
			pay = salary - (salary * 0.13)
			print("Your yearly income after tax is £%d" %pay)
	#HR + CTO
	elif(dept == "HR" and cto=="Y"):
		pay = salary - (salary * 0.02)
		print("Your yearly income after tax is £%d" %pay)
	#GR + grades
	elif(dept == "HR"):
		if (grade >=1 and grade <=10):
				pay = salary - (salary * 0.09)
				print("Your yearly income after tax is £%d" %pay)
		else:
			pay = salary - (salary * 0.17)
			print("Your yearly income after tax is £%d" %pay)
else:
	print("No tax to pay")

if(dept == "IT"):
	bonus = (salary * 0.05)
	print("and enjoy your additional bonus of £%d" %bonus)