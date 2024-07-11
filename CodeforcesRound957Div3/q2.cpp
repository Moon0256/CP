#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main(){
    int t;
    cin >> t;
    while (t--){
        int n, k;
        cin >> n >> k;
        int arr[k];
        for(int g = 0; g<k; g++){
            cin >> arr[g];
        }
        sort(arr, arr+k);
        ll sum = 0;
        for(int i = 0; i<k-1; i++){
            if(arr[i]==1){
                sum+=1;
            }else{
                sum+=(2*arr[i]-1);
            }

        }
        cout << sum << "\n";
    }
}
