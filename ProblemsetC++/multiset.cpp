#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int n, k;
        cin >> n >> k;
        if((n-1)%(k-1)==0){
            cout << (n-1)/(k-1) << "\n";
        }else{
            cout << ((n-1)/(k-1))+1 << "\n";
        }
        
    }
}
