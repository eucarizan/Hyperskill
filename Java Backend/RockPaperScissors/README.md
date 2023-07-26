# Rock-Paper-Scissors (Java)

- [Rock-Paper-Scissors (Java)](#rock-paper-scissors-java)
  - [Learning Outcomes](#learning-outcomes)
  - [About](#about)
  - [Stages](#stages)
    - [1: Unfair computer](#1-unfair-computer)
      - [1.1 Description](#11-description)
      - [1.2 Objectives](#12-objectives)
      - [1.3 Example](#13-example)

## Learning Outcomes
A playable Rock-Paper-Scissors game, with a Player vs. Computer mode. Practice using arrays, the Random class, formatted strings, and algorithms.

## About
If you’ve ever wanted to create games, this project will get you started! In this project, you will code a Rock-Paper-Scissors-Lizard-Spock game, a more advanced version of Rock-Paper-Scissors and play against the computer.

## Stages
### 1: Unfair computer
#### 1.1 Description
Rock paper scissors is a popular hand game. Two players simultaneously form one of three shapes with their hands, and then, depending on the shapes, one player wins — rock beats scissors, paper wins over rock, scissors defeats paper.
The game is well-known for fair win-conditions between equal options.

Let's start with an unfair version! :)

Write a program that reads input that states which option users have chosen. After this, your program must make users lose! That is, your program should always select an option that defeats the one picked by users. Once it finds this option, output the line `Sorry, but the computer chose <option>`, where `<option>` is the name of the option that the program's picked depending on the user's input.
For example, if users enter `rock`, the program should print `Sorry, but the computer chose paper` and so on.

Pay attention to the format of the output. It should follow the one in the example, including capital letters and punctuation. Do not print additional strings.

Just think about it: in this stage, the computer has to win every time.
- if users choose `paper`, the computer chooses `scissors` (the computer wins);
- if users choose `scissors`, the computer chooses `rock` (the computer wins);
- if users choose `rock`, the computer chooses `paper` (the computer wins).

#### 1.2 Objectives
Your program should:
- Take input from the user;
- Find an option that wins over the user's option;
- Output the line: `Sorry, but the computer chose <option>`.

#### 1.3 Example
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

**Example 1:**
```console
> scissors
Sorry, but the computer chose rock
```

**Example 2:**
```console
> paper
Sorry, but the computer chose scissors
```