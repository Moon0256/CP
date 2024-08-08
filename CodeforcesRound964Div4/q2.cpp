#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int f(int a, int b) {
    if (a > b) return 1;
    if (a == b) return 0;
    if (a < b) return -1;
    
}

int main(){
    int t;
    cin >> t;
    while (t--){
        int a1, a2, b1, b2;
        cin >> a1 >> a2 >> b1 >> b2;
        int ans = 0;
        if (f(a1, b1) + f(a2, b2) > 0) {
            ans += 1;
        }
        if (f(a1, b2) + f(a2, b1) > 0) {
            ans += 1;
        }
        if (f(a2, b1) + f(a1, b2) > 0) {
            ans += 1;
        }
        if (f(a2, b2) + f(a1, b1) > 0) {
            ans += 1;
        }

        cout << ans << "\n";
    }
}