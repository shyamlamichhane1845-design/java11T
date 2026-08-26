#include<iostream>
using namespace std;
class student{
    private:
    string name;
    int roll;
    float marks;
    public:
    void setData(string n, int a, float b){
        name=n;
        roll=a;
        marks=b;
    }
    void display Data(){
        cout<<"Name:"<<name<<"\nAge:"<<roll
    }
}