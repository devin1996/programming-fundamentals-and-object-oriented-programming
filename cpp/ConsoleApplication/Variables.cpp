#include <iostream>
using namespace std;

class Variables {

public:
	void managePets() {
		int numberCats = 5;
		int numberDogs = 7;
		int numberAnimals = numberCats + numberDogs;

		cout << "Number of cats: " << numberCats << endl;
		cout << "Number of dogs: " << numberDogs << endl;

		cout << "Total number of animals: " << numberAnimals << endl;

		cout << "New dog acquired!" << endl;

		numberDogs = numberDogs + 1;

		cout << "New Number of dogs" << numberDogs << endl;

	}
};