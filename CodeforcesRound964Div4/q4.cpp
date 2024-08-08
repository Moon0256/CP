#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        string s, ti;
        cin >> s >> ti;

        int idx = 0;
    
    	for(int i = 0; i < (int)s.size(); ++i) {
    		if(s[i] == '?') {
    			if(idx < (int)ti.size()){s[i] = ti[idx++];} 
    			else{s[i] = 'a';} 
    		}else if(s[i] == ti[idx]){
                ++idx;
            }
            
    	}
// Credits to editorial for contest

        if(idx >= ti.size()){
            cout << "YES\n" << s << "\n";
        }else{
            cout << "NO\n";
        }
    	
    }
}