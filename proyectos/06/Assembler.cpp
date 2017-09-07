#include <iostream>
#include<fstream>
#include<string>
using namespace std;
int main(int argc, char **argv){
  int parametro = 1;
  char line[256];
  while(argc > 0 && argc--){
    ifstream file(argv[parametro]);
    file.getline(line, 256);
    cout << line << endl;
    parametro++;
  }

  return 0;
}
//Revisa Expresiones regulares
