# Simple Chatty Bot (Java)
![output](output.gif)
- [Simple Chatty Bot (Java)](#simple-chatty-bot-java)
  - [Learning Outcomes](#learning-outcomes)
  - [About](#about)
  - [Stages](#stages)
    - [1: Chatty Bot welcomes you](#1-chatty-bot-welcomes-you)
      - [1.1 Description](#11-description)
      - [1.2 Objective](#12-objective)
      - [1.3 Example](#13-example)
    - [2: Print your name](#2-print-your-name)
      - [2.1 Description](#21-description)
      - [2.2 Objective](#22-objective)
      - [2.3 Example](#23-example)
    - [3: Guess the age](#3-guess-the-age)
      - [3.1 Description](#31-description)
      - [3.2 Objective](#32-objective)
      - [3.3 Example](#33-example)
    - [4: Learning numbers](#4-learning-numbers)
      - [4.1 Description](#41-description)
      - [4.2 Objective](#42-objective)
      - [4.3 Example](#43-example)
    - [5: Multiple Choice](#5-multiple-choice)
      - [5.1 Description](#51-description)
      - [5.2 Objective](#52-objective)
      - [5.3 Example](#53-example)

## Learning Outcomes
Get to know the basic syntax of Java and write a simple program using variables, conditions, loops, and methods.

## About
Here, at the beginning of your programmer’s path, creating a simple console chat bot will do wonders to guide you through the basics of coding. During this journey, you will also play some word and number games that you are going to implement on your own. Pack up and let’s hit the road, my friend!

## Stages
### 1: Chatty Bot welcomes you
#### 1.1 Description
Digital personal assistants help people to drive cars, plan their day, buy something online. In a sense, they are simplified versions of artificial intelligence with whom you can talk.

In this project, you will develop step by step a simple bot that will help you study programming.

#### 1.2 Objective
For the first stage, you will write a bot who displays a greeting, its name, and the date of its creation. First impressions count!

Your program should print the following lines:
```console
Hello! My name is {botName}.
I was created in {birthYear}.
```

Instead of `{botName}`, print any name you choose and replace `{birthYear}` with the current year (four digits).

#### 1.3 Example
Output
```console
Hello! My name is Aid.
I was created in 2020.
```

Next, we will use Aid and 2020 as your bot's name and its birth year, but you can change it if you need to.

### 2: Print your name
#### 2.1 Description
The greeting part is great, but chatbots are also supposed to interact with a user. It's time to implement this functionality.

#### 2.2 Objective
In this stage, you will introduce yourself to the bot so that it can greet you by your name.

Your program should print the following lines:
```console
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
What a great name you have, {yourName}!
```

You may change the name and the creation year of your bot if you want.

Instead of `{yourName}`, the bot must print your name entered from the standard input.

#### 2.3 Example
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

**Example 1:** _a dialogue with the bot_

```console
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
> Max
What a great name you have, Max!
```

### 3: Guess the age
#### 3.1 Description
Keep improving your bot by developing new skills for it. We suggest a simple guessing game that will predict the age of a user.

It's based on a simple math trick. First, take a look at this formula:
```
age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
```

The numbers `remainder3`, `remainder5`, and `remainder7` are the remainders of the division of `age` by 3, 5, and 7 respectively.

It turns out that for each number ranging from _0_ to _104_, the calculation will result in the number itself.
This perfectly fits the ordinary age range, doesn't it? Ask the user for the remainders and use them to guess the age!

#### 3.2 Objective
In this stage, you will introduce yourself to the bot. It will greet you by your name and then try to guess your age using arithmetic operations.

Your program should print the following lines:
```console
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
Your age is {yourAge}; that's a good time to start programming!
Read three numbers from the standard input. Assume that all the numbers will be given on separate lines.
```
Instead of `{yourAge}`, the bot will print the age determined according to the special formula discussed above.

#### 3.3 Example
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

**Example 1:** _a dialogue with the bot_
```console
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22; that's a good time to start programming!
```

### 4: Learning numbers
#### 4.1 Description
Now you will teach your bot to count. It's going to become an expert in numbers!

#### 4.2 Objective
In this stage, you will program the bot to count from 0 to any positive number users enter.

#### 4.3 Example
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

**Example 1:** _a dialogue with the bot_
```console
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22; that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 5
0!
1!
2!
3!
4!
5!
Completed, have a nice day!
```

**Note:** each number starts with a new line, and after a number, the bot should print the exclamation mark.

### 5: Multiple Choice
#### 5.1 Description
At the final stage, you will improve your simple bot so that it can give you a test and check your answers.
The test should be a multiple-choice quiz about programming with any number of options.
Your bot has to repeat the test until you answer correctly and congratulate you upon completion.

#### 5.2 Objective
Your bot can ask anything you want, but there are two rules for your output:

- the line with the test should end with the question mark character;
- an option starts with a digit followed by the dot (`1.`, `2.`, `3.`, `4.`)

If a user enters an incorrect answer, the bot may print a message:
```console
Please, try again.
```

The program should stop on the correct answer and print `Congratulations, have a nice day!` at the end.

#### 5.3 Example
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

**Example 1:** _a dialogue with the bot_
```console
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter the remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22: that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 3
0!
1!
2!
3!
Let's test your programming knowledge.
Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program.
> 4
Please, try again.
> 2
Congratulations, have a nice day!
```

The program must end with the `Congratulations, have a nice day!` message.