#include <iostream>
#include "utils.h" // file you defined by yourself

using namespace std;

class PrototypesAndIncludes {

public:
	void doSomething() {
		cout << "1. Hello" << endl;
	}

	int processSelection() {
		doSomething();
	}
};