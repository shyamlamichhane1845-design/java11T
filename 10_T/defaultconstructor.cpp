#include<iostream>
using namespace std;
class person{
    private:
    string name;
    int age;
    public:
    person(string person_name)
    {
        cout<<"Constructor to set name is called"<<end1;
        public:
        person()
        {
            cout<<"Default constructor is called"<<end1;
            name="student";
            age=12;
        }
        void display()
        {
            cout<<"Name of current object:"<<name<<end1;
            cout<<"Age of current object:"<<age<<end1;
        }
    };
    int main()
    {
        person obj;
        obj.display();
        return 0;
}