# Kata DNI Number

## ✅Overview

This is a console-based Java application that calculates the letter corresponding to a Spanish DNI (Documento Nacional de Identidad) based on its numerical part. The application follows the official algorithm for determining the letter and handles user input validation.

## ✅Features

- DNI Letter Calculation: Automatically calculates the letter based on the provided DNI number.
- Input Validation: Ensures the number is within the valid range (0–99999999).
- Error Handling: Displays an error message for invalid inputs and allows the user to retry.
- Looped Input: Repeats until the user provides a valid DNI number.

## ✅How the Algorithm Works

1. The DNI number must be between 0 and 99999999.
2. Divide the number by 23 and calculate the remainder (modulo 23).
3. Map the remainder to a letter from the following sequence:
T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E
4. The letter corresponding to the remainder is the DNI letter.

For example:
- DNI number: 12345678
- Remainder: 12345678 % 23 = 14
- Letter: Z (14th position in the sequence)

## ✅Diagram of classes

[![temp-Image-Bliu-Xy.avif](https://i.postimg.cc/J4vydpY1/temp-Image-Bliu-Xy.avif)](https://postimg.cc/jL6dD4r9)

## ✅Technology Stack

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) 

## ✅Contacts

<a href='https://www.linkedin.com/in/nadiia-alaieva/'><img src="https://i.postimg.cc/3RLmssnH/linkedin-3.png" alt="linkedin icon" width="30" height="30"></a>

