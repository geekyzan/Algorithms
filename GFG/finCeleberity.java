// The task is to complete this function
    
int getCeleberityId(int M[][], int n){
   int a = 0;
   int b = n - 1;
    while (a < b) {
        if (M[a][b]==1)
            a++;
        else
            b--;
    }
    for (int i = 0; i < n; i++) {
        if (i != a && (!(M[i][a]==1) || M[a][i]==1))
            return -1;
    }
    return a;
}