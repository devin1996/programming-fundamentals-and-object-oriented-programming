#include <iostream>
using namespace std;

class SwitchCase {

public:
	bool switches() {
		
		int value = 5;
		const  int number = 4;

		switch (value)
		{
		case number:
			cout << "Value is 4." << endl;
			break;
		case 5:
			cout << "Value is 5." << endl;
			break;
		case 6:
			cout << "Value is 6." << endl;
			break;
		default:
			cout << "Unrecognized value." << endl;
		}
		return 0;
	}
};