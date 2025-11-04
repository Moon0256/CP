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
    string s;
    cin >> s;
    vec v;
    rep(i,0,n) if (s[i] == '1') v.push_back(i+1);
    cout << v.size() << "\n";
    rep(i,0,v.size()) cout << v[i] << " ";
    cout << "\n";
}
 
signed main() {
    fastio;
 
    ll _;
    cin >> _;
 
    while(_--) 
		SOLVE();
 
    return 0;
}

