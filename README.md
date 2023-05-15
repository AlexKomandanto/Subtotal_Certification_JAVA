# Intermediate test
---
### Job information
---
### Includes an assignment:
* Linux - Run at the command line
* Program in Java - You need to write a program to raffle toys in a children's goods store.

---

### Project Information Linux:
* Use the Linux operating system commands and create two new directories - "Toys for schoolchildren" and "Toys for preschoolers".
* Create text files in the directory "Toys for schoolchildren" - "Robots", "Constructor", "Board games
* Create in the directory "Toys for preschoolers" text files "Soft Toys", "Dolls", "Cars".
* Combine the 2 directories into one "Toy Name"
* Rename the directory "Toy Name" to "Toys
* View the contents of the "Toys" directory.
* Install and remove the snap package. (Any one you want.)
* Add a random task to run every 3 minutes (For example, writing something to a text file or copying from directory A to directory B).
  <image src="CW Linux.pdf">

### Project Information Java:
* Need to write a program - raffle toys in children's goods store.
* We try to apply OOP and work with files.
### Assignment
* The program must have at least one class with the following properties:
  toy id,
  text name,
  number
  toy dropout frequency (weight in % of 100)
* Method of adding new toys and the ability to change the weight (frequency of falling out toys)

* The possibility of organizing a raffle of toys.
  For example, as follows:
  With the method of choosing a prize toy - we get this prize toy and write it to the list\array.
  This is the list of prize toys that are waiting to be given out.
  We must also have a method - get prize toy.
  After calling it, we remove the first toy from the list/array and move the array. And this toy is written to the text file.

---
## **Project implementation**
## Alexei Komendantov ##
---
### General information :
1. A README.md file was created to describe the project;
2. **IMPORTANT!!!** As a project, the database was chosen - **which is more
   relevant and can be used in reality and shown in job searches**
3. Database fields (search by them is implemented)
    - ID - is generated randomly
    - name - to be set
    - quantity - to be set
    - weight - to be set
4. Implemented :
    - Method of adding new toys
    - weight change capability
    - Hold a raffle toys
    - Exit
5. Implemented the custom menu :

  <image src="11.png">

7. The winners.txt file is created to record the processed commands



