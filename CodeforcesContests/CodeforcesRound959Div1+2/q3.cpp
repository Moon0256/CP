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
    ll n, x;
    cin >> n >> x;
    vec a(n+2);
    rep(i,1,n+1) cin >> a[i];
    a[n+1] = x+1;
    vec b(n+2);
    rep(i,1,n+2) b[i] = b[i-1] + a[i];
    // a_l + ... + a_r = b[r] - b[l-1];
    // (a_1 + ... + a_r) - (a_1 + ... + a_(l-1)) = a_l + ... + a_r
    vec dp(n+3);
    dp[n+1] = 0;
    dp[n+2] = -1;
    for(ll i = n; i >= 1; --i) {
        if (a[i] > x) {
            dp[i] = 1 + dp[i+1];
            continue;
        }
 
        ll f = 0;
        ll l = i; // a_i + ... + a_l <= x
        ll r = n+1; // a_i + ... + a_r > x
 
        while(l + 1 < r) {
            ll m = (l + r) / 2;
            if (b[m] - b[i-1] > x) r = m;
            else l = m;
        }
        
        dp[i] = 1 + dp[r+1];
    }
    
    ll ans = (n * (n + 1)) / 2;
    rep(i,1,n+1) ans -= dp[i];
    cout << ans << "\n";
}
 
signed main() {
    fastio;
 
    ll _;
    cin >> _;
 
    while(_--) 
		SOLVE();
 
    return 0;
}

//source: i24, i.e. Anand
 
