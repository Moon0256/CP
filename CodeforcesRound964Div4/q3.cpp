#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int n, s, m;
        cin >> n >> s >> m;
        int a[n][2];
        for(int i =0; i<n; i++){
            cin >> a[i][0] >> a[i][1];
        }
        int boo = 1;
        if(a[0][0]>=s||m-a[n-1][1]>=s){
            boo = 0;
        }else{
            for(int j=1; j<n; j++){
                if(a[j][0]-a[j-1][1]>=s){
                    boo = 0;
                }
            }
        }
        if(boo==1){
            NO;
        }else{
            YES;
        }
    }
}