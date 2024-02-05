#include <iostream>

#include "Cat.h"

using namespace std;

void Cat::makeHappy() {
	happy = true;
}

void Cat::makeSad()
{
	happy = false;
}

void Cat::speak() {
	if (happy) {
		cout << "Meouww!!!" << endl;
	}
	else {
		cout << "Ssssss!!!" << endl;
	}
}

void Cat::jump() {
	cout << "I want to Jump!!!" << endl;
}