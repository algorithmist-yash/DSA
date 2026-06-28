#include <bits/stdc++.h>

using namespace std;

int main(){
    int num1, num2;// compilers assigns garbage value until initialized
    // cin >> num1;
    // cout << num2 <<endl;
    cin >> num1 >> num2;
    cout <<num1 <<"+" <<num2 <<" = "<< num1+num2 <<endl;

    char ch1, ch2;
    cin >> ch1;
    cin >> ch2;
    cout <<"ch1: " << ch1 << endl<< "ch2:" << ch2 <<endl;

    string str1,str2;
    cin >> str1 >>str2;
    cout <<"str1: "<< str1 <<endl << "str2: "<<str2 <<endl;

    cin.ignore();   // use to trim the input buffer string next line "\n"

    string completestring1, completestring2;
    getline(cin, completestring1);
    getline(cin, completestring2);
    cout <<"complete string1 is: " << completestring1 << endl<< "completestring 2 is: " << completestring2;

    return 0;
}