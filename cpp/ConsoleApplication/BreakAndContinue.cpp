#include <iostream>
using namespace std;

class BreakAndContinue {

public:
	
	void breakSample() {
		for (int i = 0; i < 5; i++) {
			cout << "I is" << i << endl;

			if (i == 3) {
				break;
			}

			cout << "looping ..." << endl;
		}

		cout << "Program Quits here ..." << endl;
	}

	void continueSample() {
		for (int i = 0; i < 5; i++) {
			cout << "I is" << i << endl;

			if (i == 3) {
				continue;
			}

			cout << "looping ..." << endl;
		}

		cout << "Program Quits here ..." << endl;
	}

	void doWhileExample() {
		const string password = "hello";
		string input;

		do {
			cout << "Enter your password >" << flush;
			cin >> input;

			if (input == password) {
				break;
			}
			else {
				cout << "Access Denied." << endl;
			}
		} while (true);

		cout << "Password Aceepted" << endl;
		cout << "Program Quits here ..." << endl;
	}
};