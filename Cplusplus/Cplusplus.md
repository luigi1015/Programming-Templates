# C++
C++ is a compiled language, so it needs to be compiled to be run.

To compile C++, you need a compiler. Let's take the BasicProgram.cpp file in this project as an example.

If you have access to a command line and G++, you should be able to run the following command:

```
g++ -o BasicProgram BasicProgram.cpp
```

That takes the code file, BasicProgram.cpp, as input and outputs the compiled version as a file called BasicProgram.

Alternatively you can compile with debugging info and showing all warnings with the following command:

```
g++ -Wall -g -o BasicProgram BasicProgram.cpp
```

I've also included a makefile that'll allow you to just use the `make` command to compile and `make clean` to clean up the files after you're done, assuming you have Make installed.
