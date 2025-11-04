#include <bits/stdc++.h>
using namespace std;
#include <iostream>
//typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int n;
        cin >> n;
        if(n==1){
            int x;
            cin >> x;
            cout << 1 << '\n';
        }else{
            set<int> s;
		    for (int i = 0; i < n; i++){
			    int x;
			    cin >> x;
			    s.insert(x);
		    }
		    //cout << s.size()<< '\n';
            cout << s.size() * 2 - 1 << '\n';
        }  
    }
}