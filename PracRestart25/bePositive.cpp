#include <bits/stdc++.h>
using namespace std;
#include <iostream>

int main(){
    int t; //Number of testcases
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int array[n];
        int minOperations = 0;
        int countNeg = 0;
        for(int i =0; i<n; i++){
            cin >> array[i];
            if(array[i]==0){
                minOperations++;
        }else if(array[i]==-1){
                countNeg++;
            }
        }
        if(countNeg%2==1){
            minOperations+=2;
        }

        cout << minOperations << '\n';
    }
}