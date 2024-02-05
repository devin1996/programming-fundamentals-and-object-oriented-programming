#include <iostream>

#include "Cat.h"

using namespace std;

Cat::Cat() {
	cout << "Cat Created" << endl;

	happy = true;
}

Cat::~Cat() {
	cout << "Destroyed" << endl;

	happy = true;
}

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