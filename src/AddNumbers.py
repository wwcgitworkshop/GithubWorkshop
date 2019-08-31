class AddNumbers:
    # Add two numbers
    def add(self, num1, num2):
      sum = float(num1) + float(num2)
      # Display the sum
      print('The sum of {0} and {1} is {2}'.format(num1, num2, sum))

f = AddNumbers()
f.add(1, 5)
