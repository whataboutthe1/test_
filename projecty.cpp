#include <iostream>
#include <string>
#include <bits/stdc++.h>
#include <tuple>
#include <map>

using namespace std;


int main()
{
    int a = 1;
    tuple <int, char> mp(2, 'g');

    for(int i = 0; i < tuple_size<decltype(mp)>; i++)
    {
        cout << get<i>(mp) << endl;
    }
}