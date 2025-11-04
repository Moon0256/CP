#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int a[n];
        for(int i = 0; i<n; i++){
            cin >> a[i];
        }
        //int b[n];
        sort(a, a+n);
        // for(int i = 0; i < n; i++) {
        //     b[i] = a[i];
        // }
        int maxi = a[1]-a[0];
        for(int j = 2; j<n; j+=2){
            maxi = max(maxi, a[j+1]-a[j]);
        }
        cout << maxi << '\n';
    }
    
}
