#include <iostream>
using namespace std;
int main(void) {
    // Your code here!


    //h,wを宣言
    int high, wide;
    //入力から取り込む
    std::cin >> high >> wide;
    //２次元配列でマスを表現
    int board[high][wide];
    int ans[high][wide];
    //数値を取り込む
    for (int i = 0; i < high; i++) {
        for (int j = 0; j < wide; j++) {

            std::cin >> board[i][j];
            ans[i][j] = 0;
        }
    }
    int high_sum[high];//横が同じ座標の縦の総和
    for (int i = 0; i < high; i++) {
        high_sum[i] = 0;
        for (int j = 0; j < wide; j++) {
            high_sum[i] += board[i][j];

        }
    }

        int wide_sum[wide];//縦が同じ座標の横の総和
        for (int i = 0; i < wide; i++) {
            wide_sum[i] = 0;
            for (int j = 0; j < high; j++) {
                wide_sum[i] += board[j][i];

            }
        }
        string s[high];

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < wide; j++) {
                ans[i][j] = high_sum[i] + wide_sum[j] - board[i][j];//縦と横を足して同一座標が二重になっているので一つ引く
                // std::cout << ans[i][j] << std::endl;
                s[i] += to_string(ans[i][j]) + ' ';
            }
            s[i].pop_back();
            std::cout << s[i] << std::endl;
        }


    }
