#include <iostream>
#include <iomanip>

using namespace std;

class FloatingPointTypes {

public:
	void floatingPointsExample() {

		float fValue = - 76.4;
		cout << fixed << fValue << endl;
		
		float fValue2 = -76.4;
		cout << scientific << fValue2 << endl;

		float fValue3 = 76.4;
		cout << sizeof(float) << endl; // gives outcome in bytes
		cout << fixed << fValue3 << endl;
		cout << setprecision(20) << fixed << fValue3 << endl;

		float fValue4 = 76.4;
		cout << scientific << fValue4 << endl;

		double dValue = 123.456789;
		cout << setprecision(20) << fixed << dValue << endl;

		long double lValue = 123.456789876543210;
		cout << setprecision(20) << fixed << fValue3 << endl;
		cout << "Size of long double" << sizeof(float) << endl; // gives outcome in bytes

	}
};