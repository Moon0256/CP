#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int n;
        cin >> n;
        string s;
        cin >> s;
        int count = 0;
        int firsti = n;
        int lasti = -1;
        for(int i = 0; i<n; i++){
            if(s[i]=='1'){
                count++;
                firsti = min(firsti, i);
                lasti = max(lasti, i);
            }
        }
        if(count==2){
            if(firsti==lasti-1){
                NO;
            }else{
                YES;
            }
            
        }else if(count%2==0){
            YES;
        }else{
            NO;
        }
    }
}