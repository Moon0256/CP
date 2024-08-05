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
        int cta = 0, ctb = 0, ctc = 0, ctd = 0;
        for(int i = 0; i<4*n; i++){
            if(s[i]=='A'){
                cta++;
            }else if(s[i]=='B'){
                ctb++;
            }else if(s[i]=='C'){
                ctc++;
            }else if(s[i]=='D'){
                ctd++;
            }
        }
        cout << (min(cta, n)+min(ctb, n)+min(ctc, n)+min(ctd, n)) << "\n";
    }
}