#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    
    
        string s;
        cin >> s;
        int count1 = 0, count2 = 0;
        for(int i =0; i<s.length();i++){
            if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
                count1++;
            }else if(s[i]=='y'){
                count2++;
            }
        }
        cout << count1 << " "<< (count1+count2) <<"\n";

    
}
