#include <bits/stdc++.h>
using namespace std;
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
int main(void) {


    int a, b, c, x;
    std::cin >> a >> b >> c >> x;
    const int A = 500, B = 100, C = 50;

    int cnt = 0;
    for (int i = 0; i <= a; i++) {

        for (int j = 0; j <= b; j++) {

            for (int k = 0; k <= c; k++)
            {
                if (i * A + j * B + k * C == x)
                    cnt++;
            }

        }

    }
    cout << cnt << endl;

}
