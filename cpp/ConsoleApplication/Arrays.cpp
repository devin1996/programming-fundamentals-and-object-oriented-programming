#include <iostream>
using namespace std;

class Arrays {

public:
	bool arrays() {
		cout << "Array of integers" << endl;
		cout << "=================" << endl;

		int values[3];

		values[0] = 88;
		values[1] = 343;
		values[2] = 478;

		cout << values[0] << endl;
		cout << values[1] << endl;
		cout << values[2] << endl;

		cout << sizeof(int) << endl;

		cout << endl << "Array of doubles" << endl;
		cout << "=================" << endl;

		double numbers[4] = { 4.5, 2.3, 7.2, 8.1 };

		for (int i = 0; i < 4; i++) {
			cout << "Element at index " << i << ": " << numbers[i] << endl;
		}
		
		cout << endl << "Initializing with zero values" << endl;
		cout << "=================" << endl;

		int numberArray[8] = {};


		for (int i = 0; i < 8; i++) {
			cout << "Element at index " << i << ": " << numberArray[i] << endl;
		}

		cout << endl << "Initializing with strings" << endl;
		cout << "=================" << endl;

		string texts[] = {"apple", "banana", "orange"};

		for (int i = 0; i < 3; i++) {
			cout << "Element at index " << i << ": " << texts[i] << endl;
		}

		return 0;
	}

	void multidimensionalArrays() {
		string animals[2][3] = {
			{"fox", "dog", "cat"},
			{"mouse", "squirrel", "parrot"}
		};

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				cout << animals[i][j] << " " << flush;
			}

			cout << endl;
		}
	}

	void sizOfArrays() {
		int values[] = {4, 7, 3, 4};

		cout << sizeof(values) << endl;
		cout << sizeof(int) << endl;

		for (unsigned int i = 0; i < sizeof(values) / sizeof(int); i++) {
			cout << values[i] << " " << flush;
		}

		cout << endl;
	}

	void sizOfMultidimentionalArrays() {
		string animals[2][3] = {
					{"fox", "dog", "cat"},
					{"mouse", "squirrel", "parrot"}
		};

		for (unsigned int i = 0; i < sizeof(animals) / sizeof(animals[0]); i++) {
			for (int j = 0; j < sizeof(animals[0]) / sizeof(string); j++) {
				cout << animals[i][j] << " " << flush;
			}

			cout << endl;
		}
	}
};