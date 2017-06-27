y={}
y["Llanfair"] = "St Mary's Church (in the)"
y["pwll"] = "hollow (of the)"
y["gwyn"] = "white"
y["gyll(go)"] = "hazel"
y["ger"] = "near"
y["y"] = "the"
y["chwyrn"] = "rapid"
y["drobwll"] = "whirlpool (and)"
y["llantysilio"] = "St Tysilio's Church (of the)"
y["ogo"] = "cave"
y["goch"] = "red"

print("\nLlanfairpwllgwyngyllgogerychwyndrobwllllantysilioogogoch\n")

for i in y.keys():
	print ("'%s' means '%s'" %(i, y[i]))

print("\nSt Mary's Church in the hollow of the white hazel near the rapid whirlpool and St Tysilio's Church of the red cave\n")