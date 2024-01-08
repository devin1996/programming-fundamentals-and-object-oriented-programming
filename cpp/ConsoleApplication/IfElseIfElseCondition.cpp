#include <iostream>
#include <iomanip>
using namespace std;

class IfElseIfElseCondtion {

public:
	void crudOps() {

		cout << "1.\tAdd new record" << endl;
		cout << "2.\tDelete record" << endl;
		cout << "3.\tView record" << endl;
		cout << "4.\tSearch record" << endl;
		cout << "5.\tQuit" << endl;

		cout << "Enter your selection >" << flush;

		int value;
		cin >> value;

		if (value == 1) {
			cout << "Adding new record..." << endl;
		}
		else if (value == 2) {
			cout << "Deleting record..." << endl;
		}
		else if (value == 3) {
			cout << "Viewing..." << endl;
		}
		else if (value == 4)
		{
			cout << "Searching..." << endl;
		}
		else if (value == 5) {
			cout << "Quitting..." << endl;
		}
		else {
			cout << "Invalid option." << endl;
		}

		//Comparing Floats
		float value1 = 1.1;
		
		if (value1 == 1.1) {
			cout << "equals" << endl;
		}
		else {
			cout << "not equal" << endl;
		}

		cout << setprecision(10) << value1 << endl;
	}
};

