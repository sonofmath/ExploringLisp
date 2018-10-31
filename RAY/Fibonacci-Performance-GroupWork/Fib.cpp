#include <iostream>
#include <chrono>

using namespace std;
using namespace std::chrono;

long int Fib(int n){
    //base case
    if(n < 2)
        return n;
    else
        return Fib(n-1) + Fib(n-2);
}

int main(){

    high_resolution_clock::time_point start = high_resolution_clock::now();
    std::cout<<"The 35th Fib number is: " <<Fib(35) <<std::endl;
    high_resolution_clock::time_point end = high_resolution_clock::now();
    auto duration = duration_cast<milliseconds>(end - start).count();
    
    std::cout<<"Execution time: " <<duration;
    std::cout<<endl;
    return 0;
}

