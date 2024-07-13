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
        string s;
        cin >> s;
        s = "L"+s+ "L";
        int dp[n+2];
        dp[n+1]=0; // this is at the end, so swim distance = 0

        for(int i = n; i>=0; i--){
            if(s[i]=='L'){
                int mini = 1000000;
                for(int j = 1; j<=m; j++){
                    if(i+j<n+2){
                        mini = min(mini,dp[i+j]);
                    }
                }
                dp[i]=mini;
            }else if(s[i]=='W'){
                dp[i]=dp[i+1]+1;
            }else{
                dp[i]=1000000;
            }
        }

        if(dp[0]<=k){
            YES;
        }else{
            NO;
        }
    }
}
