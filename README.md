# ProductionLineProject
This project is a stand-alone Oracle Academy step-by-step project in which the overarching purpose is to create a flexible structure that could be used in any type of production line. It was built and run in IntelliJ IDE, but should be able to run in either Netbeans or Eclipse as well with or without minor changes. It was added to and improved over the course of the Fall 2018 semester. This program is
an example of Object-Oriented Programming where class objects interact with each other throughout the program to create a close-knit
and generally error-free, user-friendly program that allows the user to create "products" of either a movie-player type or an audio-
player type. The program gives prompts through using the console, and can write the user's input to a text file as well as having the
option to write it to the console. The user can use the menu-driven system to see how many "products" have been created, how many of
each type, and how many unique "products" were created.

[Link to Class Diagram](https://github.com/MarionArmbruster/ProductionLineProject/blob/master/src/productionline/productionline%20Class%20Diagram2.pdf)

# Getting Started
To run the program, download the package "productionline" and open the .java files in an IDE of your choosing. To interact with the
program, run the Main class contained in the package and follow the prompt instructions. Example output:  

```
Welcome to the Oracle Production's Line! This program will allow you to perform any of the following operations:

Enter a menu number for selection: 
1. Add a New Product 
2. Display all Products 
3. Statistics of Products 
4. Quit Program
9
General exception: java.lang.Exception
Input was not a valid integer. Please enter your selection.

Input Mismatch Exception: Input was not an integer. Please try again.
2

All items in the Collection: 
The Array List Collection set is empty. Please add a Product.

Press the enter key when you are ready to continue.

Enter a menu number for selection: 
1. Add a New Product 
2. Display all Products 
3. Statistics of Products 
4. Quit Program
3

Enter 1 to see how many products have been created. Enter 2 to see how many of
each product has been created. Enter 3 for how many unique products have been
created. Enter 4 to return to the main menu. 
1
Total number of products that have been produced: 0

Enter 1 to see how many products have been created. Enter 2 to see how many of
each product has been created. Enter 3 for how many unique products have been
created. Enter 4 to return to the main menu. 
2

Number of Movie Players created is: 0
Number of Audio Players created is: 0

Enter 1 to see how many products have been created. Enter 2 to see how many of
each product has been created. Enter 3 for how many unique products have been
created. Enter 4 to return to the main menu. 
3

The Array List Collection set is empty. Please add a Product.

Enter 1 to see how many products have been created. Enter 2 to see how many of
each product has been created. Enter 3 for how many unique products have been
created. Enter 4 to return to the main menu. 
4
Returning to main menu. . .

Enter a menu number for selection: 
1. Add a New Product 
2. Display all Products 
3. Statistics of Products 
4. Quit Program
1

Choose the type of product to add: 1 for AudioPlayer or 2 for MoviePlayer. If you wish to exit this menu, enter 4.
1
How many AudioPlayers would you like to add? Enter a number, please: 2

Enter the name of an audio player such as "iPod Mini" or "Walkman": Walkman
Enter the type of an audio format such as "MP3" or "WAV": wav

Enter the name of an audio player such as "iPod Mini" or "Walkman": Walkman2
Enter the type of an audio format such as "MP3" or "WAV": wav

Choose the type of product to add: 1 for AudioPlayer or 2 for MoviePlayer. If you wish to exit this menu, enter 4.
4
Returning to main menu. . .

Writing data to the file. . . The program needs your employee name and department number.
Directory already exists.
Enter your employee name as first name then last name: Erin Bouglash
Enter a Dept identification (must be in the form of capital letter, three lowercase letters, two numbers): Yuwe65
Successfully wrote to file. File is located at C:\LineTests\.

Enter a menu number for selection: 
1. Add a New Product 
2. Display all Products 
3. Statistics of Products 
4. Quit Program
2

All items in the Collection: 

Manufacturer  : OracleProduction
Serial Number : 1
Date          : Thu Dec 13 20:28:07 EST 2018
Name          : Walkman
Audio Spec    : WAV
Type          : AUDIO_MOBILE


Manufacturer  : OracleProduction
Serial Number : 2
Date          : Thu Dec 13 20:28:23 EST 2018
Name          : Walkman2
Audio Spec    : WAV
Type          : AUDIO_MOBILE


Manufacturer  : OracleProduction
Serial Number : 3
Date          : Thu Dec 13 20:29:58 EST 2018
Name          : Walkman
Audio Spec    : MP3
Type          : AUDIO_MOBILE

Press the enter key when you are ready to continue.

Enter a menu number for selection: 
1. Add a New Product 
2. Display all Products 
3. Statistics of Products 
4. Quit Program
3

Enter 1 to see how many products have been created. Enter 2 to see how many of
each product has been created. Enter 3 for how many unique products have been
created. Enter 4 to return to the main menu. 
1
Total number of products that have been produced: 3

Enter 1 to see how many products have been created. Enter 2 to see how many of
each product has been created. Enter 3 for how many unique products have been
created. Enter 4 to return to the main menu. 
2

Number of Movie Players created is: 0
Number of Audio Players created is: 3

Enter 1 to see how many products have been created. Enter 2 to see how many of
each product has been created. Enter 3 for how many unique products have been
created. Enter 4 to return to the main menu. 
3
There are 1 number of unique products that were created. Key: Walkman2.

Enter 1 to see how many products have been created. Enter 2 to see how many of
each product has been created. Enter 3 for how many unique products have been
created. Enter 4 to return to the main menu. 
4
Returning to main menu. . .

Enter a menu number for selection: 
1. Add a New Product 
2. Display all Products 
3. Statistics of Products 
4. Quit Program
4
Program terminated. . .
```
# Built With
The ProductionLineProject program was built in the Intellij IDEA integrated development environment. It was made using the Java ver. 1.8.0_181.

Resources used:<ul><li>[HashMap](https://www.geeksforgeeks.org/java-util-hashmap-in-java/)  </li>
                <li>[More HashMap](https://stackoverflow.com/questions/6712587/how-to-count-frequency-of-characters-in-a-string)  </li>
                <li>[Even more HashMap](https://www.testingexcellence.com/4-different-ways-iterate-map-java/)  </li> 
                <li>[ArrayList Objects](https://stackoverflow.com/questions/34170491/counting-number-of-different-object-types-in-an-arraylist)  </li>
                <li>As well, there may be others that may not have gotten on this list.</ul>
                
# Author
- Developed by Marion Armbruster

# License
MIT License

Copyright (c) 2018 Marion Armbruster. See License.

# Acknowledgments
Web sites utilized: See the above resources.

Ackowledgements are also due to Professor Vanselow and Damian Morgan for assisting in various instances with the program as well as the
shenanigans introduced by both githib and IntelliJ. Professor Vanselow especially helped with some tricky portions. Ryan McGuire gave guidance as well.

# Key Programming Concepts Utilized
 
Key concepts: The key concepts introduced and worked with this semester include Object Oriented Programming-style classes, interfaces, abstract classes, inheritance and polymorphism, for-each loops, ArrayLists and Collections, generics combined with other elements of OOP, accessor methods, the CompareTo method, exception handling, general good practices with java programming including, but not limited to, javadoc comments, naming conventions, and utilizing resources.  

# Future Plans

In the future, I would like remodel this console program into a Graphical-User-Interface for better appeal and easier handling of input. Doing this would allow for more JavaFX practice. There are a few error checks I'd like to add as well, and maybe something else. 
