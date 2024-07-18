#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int n, x;
        cin >> n >> x;
        int a[n];
        for(int j= 0; j<n; j++){
            cin >> a[j];
        }

        ll total = (ll)(n * (n + 1) / 2);
        ll inval = 0;
        

        for (int l = 0; l < n; ++l) {
            ll g = 0;
            for (int r = l; r < n; ++r) {
                
                g += a[r];
                if (g > x) {
                    inval++;
                    g = 0;
                    //break;
                }else{
                    
                    //continue;
                }
            }
        }
        cout << inval;


        ll val = total - inval;
        cout << val << "\n";
        
        
    }
}
