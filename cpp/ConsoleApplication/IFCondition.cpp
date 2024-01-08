#include <iostream>
using namespace std;

class IFCondtion {

public:
	void passwordValidation() {
		string password = "hello";
		cout << "Enter your password" << endl;
		
		string input;
		cin >> input;

		if (input == password) {
			cout << "Password accepeted." << endl;
		}

		if (input != password) {
			cout << "Access Denied." << endl;
		}
	}
};

