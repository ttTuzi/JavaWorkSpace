package RecursionPractice.Maze;

public class MiGong {

    public static void main(String[] args) {
        MiGong migong = new MiGong();
        migong.Map();
    }

    public void Map(){
        /*
            思路:
                1.创建迷宫,用2D Array[][], int[][] map = new int[8][7];
                2.规定用0表示道路,1表示路障
                3.将最上和最下的行全部设计为1
                4.将最右和左设为1

         */
        int[][] map = new int[8][7];
        for(int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }
        for(int i=0;i<7;i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        map[3][1]=1;
        map[3][2]=1;

        //输出地图
        for(int i=0;i<map.length;i++){
            for(int j=0; j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
