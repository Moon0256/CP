#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int a,b,c;
        cin >> a >> b >> c;
        int max;
        for(int i = 0; i<5; i++){
            if (a <= b && a <= c) {
                ++a;
            } else if (b <= a && b <= c) {
                ++b;
            } else {
                ++c;
            }

        }
        max = a*b*c;
        cout << max << "\n";
    }
}
