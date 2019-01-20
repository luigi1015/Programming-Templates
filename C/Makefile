default: BasicProgram

BasicProgram: BasicProgram.c
	gcc -Wall -g -o BasicProgram BasicProgram.c

clean:
	if [ -e BasicProgram ]; then rm BasicProgram; fi;
	if [ -e *~ ]; then rm *~; fi;
	if [ -e *.o ]; then rm *.o; fi;
	if [ -e *.gch ]; then rm *.gch; fi;
