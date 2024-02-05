// ConsoleApplication.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

#include "Cat.h"
#include "Kitty.h"

#include "HelloThere.cpp"
#include "Variables.cpp"

int main()
{
    //speak();
    //jump();
    Cat tom;
    tom.makeHappy();
    tom.speak();
    tom.jump();
    
    Cat bob;
    tom.makeSad();
    tom.speak();
    tom.jump();

    std::cout << "Hello World!\n";
    HelloThere helloThereObj;
    helloThereObj.HelloWorld();

    Variables variableObj;
    variableObj.managePets();


}