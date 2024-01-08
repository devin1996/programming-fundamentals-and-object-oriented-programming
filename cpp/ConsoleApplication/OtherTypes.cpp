#include <iostream>
using namespace std;

class OtherTypes {

public:
	void typesExample() {

		bool bValue = true;
		cout << bValue << endl;

		char cValue = 55;
		cout << cValue << endl;
		// outputs 7

		char cValueTwo = '7';
		cout << cValueTwo << endl;

		cout << (int)cValueTwo << endl;

		char cValueThree = 'g';
		cout << cValueThree << endl;
		cout << "Size of char" << sizeof(char) << endl;

		wchar_t wValue = 'i';
		cout << wValue << endl;
		cout << (char)wValue << endl;
		cout << "Size of wchar_t" << sizeof(wchar_t) << endl;

	}
};