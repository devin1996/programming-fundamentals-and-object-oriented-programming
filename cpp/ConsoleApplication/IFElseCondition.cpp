#include <iostream>
using namespace std;

class IFElseCondtion {

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

		if (value < 3) {
			cout << "Insufficient privileges to use these menu option." << endl;
		} else {
			cout << "Privilege level sufficient." << endl;
		}

		if (value == 5) {
			cout << "Quitting ..." << endl;
		}
		else {
			cout << "Not Quitting." << endl;
		}

	}
};

