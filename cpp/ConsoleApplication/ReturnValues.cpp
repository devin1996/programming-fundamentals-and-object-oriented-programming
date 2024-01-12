#include <iostream>
#include <iomanip>
using namespace std;

class ReturnValues {

public:
	void showMenu() {
		cout << "1. Search" << endl;
		cout << "2. View Record" << endl;
		cout << "3.  Quit" << endl;
	}

	int processSelection() {
		cout << "Enter Selection: " << endl;

		int input;
		cin >> input;

		return input;
	}

	void finalMethod() {
		showMenu();
		int selection = processSelection();

		switch (selection)
		{
		case 1:
			cout << "Searching" << endl;
			break;
		case 2:
			cout << "Viewing." << endl;
			break;
		case 3:
			cout << "Quitting" << endl;
			break;
		default:
			cout << "Please select an item from the menu." << endl;
		}
	}
};