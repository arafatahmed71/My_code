#include<iostream>
#include<cstring>
#include<cstdlib>
using namespace std;



void lcs( char *M, char *F, int m, int n )
{
int L[m+1][n+1];



for (int i=0; i<=m; i++)
{
for (int j=0; j<=n; j++)
{
if (i == 0 || j == 0)
L[i][j] = 0;
else if (M[i-1] == F[j-1])
L[i][j] = L[i-1][j-1] + 1;
else
L[i][j] = max(L[i-1][j], L[i][j-1]);
}
}



int index = L[m][n];
char lcs[index+1];
lcs[index] = '\0';
int i = m, j = n;
while (i > 0 && j > 0)
{



if (M[i-1] == F[j-1])
{
lcs[index-1] = M[i-1];
i--; j--; index--;
}



else if (L[i-1][j] > L[i][j-1])
i--;
else
j--;
}



cout << "LCS of " << M << " and " << F << " is " << lcs;
}



int main()
{
char M[] = "ARAFATAHMED";
cout<<"My Name : ARAFATAHMED\n";
char F[] = "TAJUDDINAHMED";
cout<<" Father Name : TAJUDDINAHMED\n";



int m = strlen(M);
int n = strlen(F);
lcs(M, F, m, n);
return 0;
}
