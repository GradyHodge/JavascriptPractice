// console.log("does this work");

//Random Crap that I don't save here
//This is just a drawing board
//if you want to save it, move it somewhere else.
// console.log("this random.js file is connected");

/*
/*
* Write a function that given a string, returns a boolean if it is the same read from the left or right
i.e - racecar

* Write a function that given a list of countries, returns the country(s) that occur the least times
i.e - ["Argentina", "Cuba", "Chile", "Argentina"] -> ["Cuba", "Chile"]

* Write a function that given a list of strings, returns the list sorted based on the length of each string
i.e - ["programming", "simply", "rocks"] -> ["rocks", "simply", "programming"]
*/


/* PSUEDOCODE
Check for Palendrome
does string equal the same string in reverse
if statement if string1 == string2.reversed //true
console log this is a palendrome
else this is not a palendrome

make all lower case
could use regular expressions
*/

// set variables
const string1 = 'racecar';
const string2 = .reverse(string1);

function isPal() {

    if (string1 === string2) {
    console.log(string1 + " is a palendrome");
    
    return = document.write(string1 + " is a palendrome);
}
else { console.log(string1 + "is NOT a palendrome")};

return = document.write(string1 + " is not a palendrome");

};


/* PSUEDOCODE

function gives least occuring entry

1. tally up array entries into  a variable
2. compare var1 to var2, is it the same? if yes then tally in a var += or i++
3. then compare that tallied var value with the other array items by index by sorting through them with another loop
4. you are looking for the min number of entries
5. the example shows a tie, so print all array items with the lowest tally

LAST -- refactor = higher order functions sort and reduce

*/

function fewestEntries() {

    const contries = ["Argentina", "Cuba", "Chile", "Argentina"] -> ["Cuba", "Chile"];
    var tally = 1;
    var minCount = [];
    
    /*change for loop to .sort higher level function*/
    for(i = 0; i < countries.length; i++) {
       if (contries[i] == countries[i+1]) {
       tally += countries[i];
       } 
      
     }
     
     if (countries[i] < countries[i-1]) {
         countries[i] == minCount;
     }
         return = minCount;
};

/* PSUEDOCODE

Write a function that given a list of strings, returns the list sorted based on the length of each string
i.e - ["programming", "simply", "rocks"] -> ["rocks", "simply", "programming"]

1. sort the list by length of string //// higher level .sort function
2. get the length of each array item
3. compare each array item with the next and drop it in place (BUBBLE SORT LOL, it could work but least efficient with Big O Notation)
4. return the new array with newly ordered list

*/

/*
* Write a function that given a string, returns a boolean if it is the same read from the left or right
i.e - racecar

* Write a function that given a list of countries, returns the country(s) that occur the least times
i.e - ["Argentina", "Cuba", "Chile", "Argentina"] -> ["Cuba", "Chile"]

* Write a function that given a list of strings, returns the list sorted based on the length of each string
i.e - ["programming", "simply", "rocks"] -> ["rocks", "simply", "programming"]
*/


/* PSUEDOCODE
Check for Palendrome
does string equal the same string in reverse
if statement if string1 == string2.reversed //true
console log this is a palendrome
else this is not a palendrome

make all lower case
could use regular expressions
*/

// set variables
const string1 = 'racecar';
const string2 = .reverse(string1);

function isPal() {

    if (string1 === string2) {
    console.log(string1 + " is a palendrome");
    
    return = document.write(string1 + " is a palendrome);
}
else { console.log(string1 + "is NOT a palendrome")};

return = document.write(string1 + " is not a palendrome");

};


/* PSUEDOCODE

function gives least occuring entry

1. tally up array entries into  a variable
2. compare var1 to var2, is it the same? if yes then tally in a var += or i++
3. then compare that tallied var value with the other array items by index by sorting through them with another loop
4. you are looking for the min number of entries
5. the example shows a tie, so print all array items with the lowest tally

LAST -- refactor = higher order functions sort and reduce

*/

function fewestEntries() {

    const contries = ["Argentina", "Cuba", "Chile", "Argentina"] -> ["Cuba", "Chile"];
    var tally = 1;
    var minCount = [];
    
    /*change for loop to .sort higher level function*/
    for(i = 0; i < countries.length; i++) {
       if (contries[i] == countries[i+1]) {
       tally += countries[i];
       } 
      
     }
     
     if (countries[i] < countries[i-1]) {
         countries[i] == minCount;
     }
         return = minCount;
};

/* PSUEDOCODE

Write a function that given a list of strings, returns the list sorted based on the length of each string
i.e - ["programming", "simply", "rocks"] -> ["rocks", "simply", "programming"]

1. sort the list by length of string //// higher level .sort function
2. get the length of each array item
3. compare each array item with the next and drop it in place (BUBBLE SORT LOL, it could work but least efficient with Big O Notation)
4. return the new array with newly ordered list

*/














































