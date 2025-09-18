import java.util.*;
class dpDR{
    static int c=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int[][] vis=new int[n][m];
        dfs(0,0,mat,vis,n,m);
        if(c==0){
            System.out.println("NO PATH");
        }
        else{
            System.out.println("yes "+c);
        }}
        public static void dfs(int i,int j,int[][] mat,int[][] vis,int n,int m){
            if(i<0 || j<0 || i>=n || j>=m || mat[i][j]==0 || vis[i][j]==1){
                return;
            }
            if(i==n-1 && j==m-1 ){
                c+=1;
                return;
            }
            vis[i][j]=1;
            //down,right
            dfs(i+1,j,mat,vis,n,m);
            dfs(i,j+1,mat,vis,n,m);
            vis[i][j]=0;

        }

    }
