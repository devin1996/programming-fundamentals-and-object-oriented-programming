#pragma once

#ifndef CAT_H_
#define CAT_H_

class Cat {
private:
	bool happy;
public:
	Cat();
	~Cat(); // Destructor
	void makeHappy();
	void makeSad();
	void speak();
	void jump();
};


#endif
