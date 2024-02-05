// ConsoleApplication.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

#include "Cat.h"
#include "Kitty.h"

#include "HelloThere.cpp"
#include "Variables.cpp"

int main()
{
    cout << "Starting Program..." << endl;
    {
        Cat tom;
        tom.makeHappy();
        tom.speak();
        tom.jump();
    }

    {
        Cat bob;
        bob.makeSad();
        bob.speak();
        bob.jump();
    }
    std::cout << "Hello World!\n";
    HelloThere helloThereObj;
    helloThereObj.HelloWorld();

    Variables variableObj;
    variableObj.managePets();

    cout << "Ending Program..." << endl;
}