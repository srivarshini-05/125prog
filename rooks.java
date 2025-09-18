import java.util.*;
public class rooks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] board=new int[n][n];
        boolean[] usedrow=new boolean[n];
        boolean[] usedcol=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=sc.nextInt();
                if(board[i][j]==1){
                    usedrow[i]=true;
                    usedcol[j]=true;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(!usedrow[i]){
                for(int j=0;j<n;j++){
                    if(!usedcol[j]){
                        board[i][j]=1;
                        usedrow[i]=true;
                        usedcol[j]=true;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
