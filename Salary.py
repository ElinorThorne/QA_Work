no1 = input("Please enter your annual salary between £10,000 and £20,000:\n")
salary = int(no1)

no2 = input("Please enter your grade between 1 and 20:\n")
grade = int(no2)

no3 = input("Please enter your dept; IT or HR:\n")
if(no3 == "IT"):
	dept = 0
else:
	dept = 1

no4 = input("Are you a CTO?:\n")
if( no4 == "No"):
	CTO = 0
else:
	CTO = 1

if(CTO == 1 and dept == 0 ):
	print( "IT CTO pays no tax" )



if( salary > 1500 ):	
	if( dept == 0 ):
		if (grade >=1 and grade <=10):
			pay = salary - (salary * 0.09)
			print("Your yearly income after tax is £%d" %pay)
		else:
			pay = salary - (salary * 0.13)
			print("Your yearly income after tax is £%d" %pay)
	

	if(CTO == 1 and dept == 1 ):	
		else:
			if (grade >=1 and grade <=10):
				pay = salary - (salary * 0.09)
				print("Your yearly income after tax is £%d" %pay)
			else:
				pay = salary - (salary * 0.17)
				print("Your yearly income after tax is £%d" %pay)
if(dept ==0):
	bonus = (salary * 0.05)
	print("and enjoy your additional bonus of £%d" %bonus)