#include <iostream>
using namespace std;

class Loops {

public:
	bool iteration() {
		
		while (true) {
			cout << "Hello World!\n" << endl;
		}
		return 0;
	}

	void iterationTwo() {
		int i = 0;
		while (i <= 5) {
			cout << "Hello this is i iteration" << endl;

			i = i+1;
			//i++
		}

		cout << "Programming Quitting" << endl;
	}

	void doWhile() {
		int value = 7;
		
		 do{
			cout << "Hello this is iteration" << endl;

			value = value - 1;
			//i++
		 } while (value <= 5);

		cout << "Programming Quitting" << endl;
	}

	void whileExample() {
		const string password = "hello";

		cout << "Enter your password >" << flush;

		string input;
		cin >> input;

		while(input != password) {
			cout << "Access Denied." << endl;

			cout << "Enter your password > " << flush;
			cin >> input;
		}

		cout << "Password Accepted" << endl;
	}

	void doWhileExample() {
		const string password = "hello";
		string input;

		do {
			cout << "Enter your password >" << flush;
			cin >> input;
			
			if (input != password) {
				cout << "Access Denied." << endl;
			}
		} while (input != password);

		cout << "Password Aceepted" << endl;
	}

	void forLoop() {
		for (int i = 0; i < 10; i++) {
			cout << "Hello World" << i << endl;
		}
	}
};