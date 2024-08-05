#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        ll n;
        cin >> n;
        vector<ll> a(n);
        // ll cev=0;
        // ll cod=0;
        // ll maxe = 0;
        ll maxo = -1;
        vector<ll> e;
        for(int i=0; i<n; i++){
            cin >> a[i];
            if(a[i]%2==0){
                // cev++;
                e.push_back(a[i]); 
                // if(a[i]>maxe){
                //     maxe = a[i];
                // }
            }else{
                // cod++;
                if(a[i]>maxo){
                    maxo = a[i];
                }
            }
        }
        
        if(maxo == -1 || e.empty()){
            cout << 0 << "\n";
            continue;
        }

        sort(e.begin(), e.end());

        ll ans = e.size();
        for (size_t i = 0; i < e.size(); i++) {
            if (e[i] < maxo) {
                maxo += e[i];
            } else {
                ans++;
                break;
            }
        }


        cout << ans << "\n";
        
    }
}