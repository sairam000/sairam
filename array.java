class matrix
{
public static void main(String []x)
{
int i,j,k=0;
int a[][]=new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(x[k]);
k++;
}}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println(a[i][j]+"\t");
}
System.out.println( );
}
}
}