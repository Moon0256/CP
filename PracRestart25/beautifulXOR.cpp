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
    ll a, b;
    cin >> a >> b;
    vec ans;
    ll c = 1;
    ll x = a, y = b;
    ll cx = 0, cy = 0;
    while(x) {x/=2; cx++;}
    while(y) {y/=2; cy++;}
    if (cy > cx) {cout << "-1\n"; return;}
 
    while(a) {
        if ((a&1) == (b&1));
        else ans.push_back(c);
        c *= 2;
        a/=2;
        b/=2;
    }
    cout << ans.size() << "\n";
    rep(i,0,ans.size()) cout << ans[i] << " ";
    if(ans.size()!=0) cout << "\n";
}
 
signed main() {
    fastio;
 
    ll _;
    cin >> _;
 
    while(_--) 
		SOLVE();
 
    return 0;
}
 