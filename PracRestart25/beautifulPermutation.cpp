// File generated on 25/11/01 21:46 by Anand
 
#include <bits/stdc++.h>
using namespace std;
 
#define fastio ios::sync_with_stdio(false); cin.tie(0)
#define rep(i, m, n)  for (long long i = m; i < n; i++)
#define DEBUG(x) cout << "debug: " << x << "\n"
#define YES cout << "YES\n"
#define NO cout << "NO\n"
#define pb push_back
#define sz size
 
typedef long long ll;
typedef pair<ll,ll> pll;
typedef vector<ll> vec;
typedef vector<vec> vecc;
typedef vector<pll> vecp;
 
void SOLVE() {
    ll n;
    cin >> n;
    cout << "2 1 " << n << endl;
    ll x;
    cin >> x;
    ll E = x - ((n * (n + 1)) / 2);
    ll l = 1, r = n;
    while(r - l + 1 != E) {
        ll m = (l + r) / 2;
        ll p, a;
        cout << 1 << " " << l << " " << m << endl;
        cin >> p;
        cout << 2 << " " << l << " " << m << endl;
        cin >> a;
        ll e = a - p;
        if (e == 0) {l = m + 1; continue;}
        if (e == E) {r = m; continue;}
        l = m - e + 1;
        r = l + E - 1;
        break;
    }
    cout << "!" << " " << l << " " << r << endl;
 
}
 
signed main() {
    fastio;
 
    ll _;
    cin >> _;
 
    while(_--) 
		SOLVE();
 
    return 0;
}
 