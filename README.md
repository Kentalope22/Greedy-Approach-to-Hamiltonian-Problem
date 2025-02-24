# Greedy-Approach-to-Hamiltonian-Problem

You are given a set of cities that are laid out in a circle, connected by a circular road that runs
clockwise. Each city has a gas station that provides gallons of fuel, and the distances between these
cities are known. You have a car that can drive some number of miles per gallon of fuel, and your
goal is to pick a starting city such that you can fill up your car in that city (using that city’s gas
station). You can then drive to the next city, refill up your car with that city's fuel, drive to the next
city, and so on and so forth until you return back to the starting city with 0 or more gallons of fuel
left. This city is called a preferred starting city. In this problem, it is guaranteed that there will
always be exactly one valid starting city.
The problem set involves series of arrays. The first array is the distance between neighboring cities.
Assume that city 𝑖 is 𝑑𝑖𝑠𝑡𝑎𝑛𝑐𝑒𝑠[𝑖] away from city 𝑖 + 1 . Since the cities are connected via a
circular road, the last city is connected to the first city. In other words, the last distance in the
distances array is equal to the distance from the last city to the first city. The second array is an
array of gas available at each city, where 𝑔𝑎𝑠 [𝑖] is equal to the gas available at 𝑐𝑖𝑡𝑦 𝑖 . The total
amount of gas available (from all gas stations) is enough to travel to all cities. Your gas tank always
starts out empty, and a positive integer value for the number of miles that your car can travel per
gallon of fuel (miles per gallon, or MPG) is also given.
Design an algorithm that returns the index of the preferred starting city.


## Mathematical analysis and correct Big O efficiency class

The program uses 2 loops of length n = 5, therefore at max the program will wun n^2 times or 25 times in this example and the time complexity is O(n^2)

## Instructions

Simply open up *greedy.java* in your chosen ide and run. if you want to change the results then 
edit arrays *city_distances* and *fuel* and int *mpg* 
