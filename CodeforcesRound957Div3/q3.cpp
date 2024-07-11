#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int n, m, k;
        cin >> n >> m >> k;
        for (int i = n; i >= k; --i) {
            cout << i << " ";
        }
        for (int i = m; i < k-1; ++i) {
            cout << i+1 << " ";
        }
        for (int i = 0; i < m; ++i) {
            cout << i+1 << " ";
        }
        
        cout << "\n";
    }
}
