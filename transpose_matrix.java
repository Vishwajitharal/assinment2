package assament;

public class transpose_matrix {
    public static void main(String[] args) {
        int arr[][]={{1,3,4},{2,4,3},{3,4,5}};
        System.out.println("with out transpose");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After transpose");
        for (int i=0;i<3;i++){
            for (int j=j=0;j<3;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
