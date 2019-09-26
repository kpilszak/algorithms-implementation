<h1 align="right">Algorithms Implementation</h1><br>

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Sources](#sources)

## General info
This project is a set of implementations of basic algorithms.  
The main purpose is to show how do the algoritms work.  
1. Binary Search Algorithm - used to search an element in a sorted input set. The time complexity of this algorithm is O(logN).  
Binary search works on the principle of divide and conquer. In this technique, a solution is found by dividing the input on some smaller set using some rules.  
In a binary search algorithm, you first find the middle element of the array and compare that with the number you are searching. If it's equal then you return true or index of that number and your binary search is complete but if it doesn't match then you divide the array in two-part based upon whether the middle element is greater than or less than the key value, which you are searching.  
If the key(target value) is greater than the middle element than search values in the second half of the array because the array is sorted in increasing order. Similarly, if the key is lower than the middle element it means it's in the first part of the array.  
In the examples there are two ways of implementing Binary Search Algorithm - using recursion and without recursion.  
2. Linear Search Algorithm - used to search an element in an array. The time complexity of this algorithm is O(n).  
In this technique, a solution is found by iterating over the array and comparing each element with target element to see if they are equal.  
3. Bubble Sort Algorithm - used to sort elements in an array. The time complexity of this algorithm is in average O(n^2). For small arrays, which are almost sorted, the time complexity in it's best case performance can be equal to O(n).  
In this technique, algorithm is comparing two adjacent elements and swapping them if the order is not correct. Since we compare each element with another, we need two for loops and that result in complexity of O(n^2).  
4. Quicksort Algorithm - used to sort elements in an array. The time complexity of this algorithm is in average O(nlogn).  
In this technique, algorithm is selecting one element from the array - the pivot. All elements which are smaller than the pivot element are placed in one array and all elements which are larger are placed in another array. And the steps repeat recursively. At the end the arrays are combined together.  



## Technologies
Project is created with:
* Java  
IDE: Intellij IDEA 2018

## Setup
To run this project, you need to have `jdk` and `jre` installed.
Download the `src` folder and open it in a `command prompt` or `terminal`.  
Type `javac name_of_the_algorithm_file.java` and press enter to compile.  
Type `java name_of_the_algorithm_file` to run the application.  

## Sources
This project was created with the usage of [https://www.java67.com](https://www.java67.com)
