#include <iostream>

class BasicClass
{
	private:

	protected:

	public:
		void sayHello();
};

void BasicClass::sayHello()
{
	std::cout << "Hello World!" << std::endl;
}

int main( int argc, char *argv[] )
{
	BasicClass bc;
	bc.sayHello();
	return 0;
}
