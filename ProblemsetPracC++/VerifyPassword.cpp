
#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

#define YES cout << "YES\n"
#define NO cout << "NO\n"

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        string s;
        cin >> s;
        bool yup = true;
        for (int i = 0; i < n-1; i++)
        {
            if (s[i] > s[i + 1])
            {
                yup = false;
                break;
            }
        }
        if(yup){
            YES;
        }else{
            NO;
        }
    }
}