#include <vector>
#include <cmath>
#include <cfloat>
#include <iostream>
#include <algorithm>


using namespace std;



vector<int> ClosestPair(const vector< vector<double> >& points){
    vector<int> closest_pair;
    closest_pair.resize(2);
    closest_pair[0] = 0;
    closest_pair[1] = 1;
    return closest_pair;
}



//utility function to calculate two point distance
double dist(vector<double> &p1, vector<double> &p2){
    double sum = 0;
    //n dimension point
    for(int i = 0; i < p1.size(); i ++){
        //cout << "i:" << i << endl;
        //cout << "1:" << p1[i] << ",2:" << p2[i] << endl;
        sum += (p1[i] - p2[i]) * (p1[i] - p2[i]);
    }
    //cout << "dist:" << sqrt(sum) << endl;
    return sqrt(sum);
}
//direct calculate the distance
double bruteForce(vector<vector<double> > &p, int min_d, int max_d, int & a, int & b){
    //set sum to the max_d value of double to test minimum
    double sum = DBL_MAX;
    //compare each distance
    for(int i = min_d; i < max_d; i ++){
        for(int j = i + 1; j < max_d + 1; j ++){
            if(dist(p[i], p[j]) < sum){
                a = i;
                b = j;
                sum = dist(p[i], p[j]);
            }
        }
    }
    cout << "brute:" << sum << endl;
    return sum;
}

double closest(vector<vector<double> > &p, int min_d, int max_d, int& a, int& b){
    //terminal condition
    if(max_d - min_d <= 3){
        //cout << "QQ" <<  endl;
        return bruteForce(p, min_d, max_d, a, b);
    }
    //divide and conquer
    else{
        int a1 = 0, b1 = 0;
        //cout << "haha" << endl;
        int median = (max_d - min_d) / 2;
        double left = closest(p, min_d, median, a1, b1);
        double right = closest(p, median + 1, max_d, a, b);
        if(left < right){
            a = a1;
            b = b1;
        }
        //minimun of left and right
        double d = min(left, right);

        //record index
        int first = 0;
        int last = 0;
        int count = 0;
        vector<vector<double> > temp(7,vector<double>(3));
        for(int i = min_d; i < max_d; i ++){
            //== d already exist
            if(abs(p[i][0] - p[median][0]) < d){
                if(count == 0)first = i;
                count ++;
                //cout << "inside:" << i << "count:" << count << endl;
                temp.push_back(p[i]);
            }
        }
        last = first + count - 1;
        //cout << "first" << first << "last" << last << endl;
        return min(d, closest(temp, first, last, a, b));
    }
}


int main(){
    int a = 0, b = 0;

    //3 dimension
    vector<vector<double> >test(7,vector<double>(3));
    //(10,20,30)
    test[0][0]= 10;
    test[0][1]= 20;
    test[0][2]= 30;
    //(1,2,3)
    test[1][0]= 1;
    test[1][1]= 2;
    test[1][2]= 3;
    //(1000,2000,3000)
    test[2][0]= 1000;
    test[2][1]= 2000;
    test[2][2]= 3000;
    //(100,200,300)
    test[3][0]= 100;
    test[3][1]= 200;
    test[3][2]= 300;
    //(100,200,300)
    test[4][0]= 100;
    test[4][1]= 200;
    test[4][2]= 301;
    //(100,200,300)
    test[5][1]= 200000;
    test[5][0]= 100000;
    test[5][2]= 300000;
    //(100,200,300)
    test[6][0]= 1000000;
    test[6][1]= 2000000;
    test[6][2]= 3000000;
    //sort X
   // sort (test.begin(), test.end());

    for (int i = 0; i < test.size(); i ++){
        for(int j = 0; j < test[i].size(); j ++){
            cout << test[i][j] << endl;
        }
    }

    cout << "result:" << closest(test, 0, 6, a, b);
    cout << "a" << a << "b" << b << endl;

    return 0;
}