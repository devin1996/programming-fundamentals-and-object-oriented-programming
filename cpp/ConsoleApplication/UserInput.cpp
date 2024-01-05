#include <iostream>
using namespace std;

class Strings {

public:
	void stringExample() {

		cout << "Enter your name:" << flush;
		
		string input;
		cin >> input;
		cout << "You entered" << input << endl;

		cout << "Enter a number:" << flush;

		int value;
		cin >> value;
		cout << "You entered" << value << endl;

	}
};