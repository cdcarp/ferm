#Test for Fermentation Interface
from datetime import datetime, timedelta
import decimal
import tkinter

tkinter._test()

#Racking Dates
start_date = datetime.strptime(input("Enter Start Date in the format MM/DD/YYYY: "), "%m/%d/%Y")
rack_one = start_date + timedelta(days=15)
rack_two = rack_one + timedelta(days=30)
rack_three = rack_two + timedelta(days=60)
rack_four = rack_three + timedelta(days=120)
rack_five = start_date + timedelta(days=365)
bottle = start_date + timedelta(days=730)

print(("Start Date: "), start_date.date())
print(("Rack 1: "),rack_one.date())
print(("Rack 2: "),rack_two.date())
print(("Rack 3: "),rack_three.date())
print(("Rack 4: "),rack_four.date())
print(("Rack 5: "),rack_five.date())
print(("Bottle Date: "),bottle.date())

#Brix Calculation
OG = decimal.Decimal(input("Enter Original Specific Gravity: "))
Brix = (220 * (OG - 1)) + decimal.Decimal("1.6")
print(("Brix Calculation: "), Brix)

#Percentage Done
now = datetime.now()
diff = ((now - start_date) / 730) * 100
print (("Percentage Done: "), diff.days, "%")

#Estimated Number of Bottles, assuming 1 liter bottles
IV = decimal.Decimal(input("Enter Initial Volume (in gallons): "))
FV = (IV) * decimal.Decimal("3.78")
print(("Estimation of number of bottles: "), FV)

#ABV calculator
FG = decimal.Decimal(input("Enter Final Specific Gravity: "))
convert = (OG-FG) * decimal.Decimal("131.25")
print("Estimated ABV: ", convert)

