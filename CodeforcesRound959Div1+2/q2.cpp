#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int n;
        cin >> n;
        string s, t;
        cin >> s >> t;
        int firstPosition = -1;
        for (int i = 0; i < n; ++i) {
            if (s[i] == '0' && t[i] == '1') {
                firstPosition = i;
                break;
            }
        }
        if (firstPosition == -1) {
            YES;
            continue;
        }

        bool canTransform = false;
        for (int i = 0; i < firstPosition; ++i) {
            if (s[i] == '1') {
                canTransform = true;
                break;
            }
        }

        if (canTransform) {
            YES;
        } else {
            NO;
        }
        
    }
}
