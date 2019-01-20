default: BasicProgram

BasicProgram: BasicProgram.cpp
	g++ -std=c++11 -Wall -g -o BasicProgram BasicProgram.cpp

clean:
	if [ -e BasicProgram ]; then rm BasicProgram; fi;
	if [ -e *~ ]; then rm *~; fi;
	if [ -e *.o ]; then rm *.o; fi;
	if [ -e *.gch ]; then rm *.gch; fi;
