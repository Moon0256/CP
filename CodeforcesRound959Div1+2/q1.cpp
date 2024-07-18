#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int n, m;
        cin >> n >> m;
        int a[n][m];
        int b[n][m];
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                cin >> a[i][j];
            }

        }
        if (n == 1 && m == 1) {
            cout << -1 << "\n";
            continue;
        }
        if (m > 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m - 1; j++) {
                    b[i][j] = a[i][j + 1];
                }
                b[i][m - 1] = a[i][0];
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                b[i][0] = a[i + 1][0];
            }
            b[n - 1][0] = a[0][0];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cout << b[i][j] << " ";
            }
            cout << "\n";
        }
        
    }
}
