/*
Project name: "����� ����"
16.11.2016
*/
class MoreArraysExamples {
  public static void main(String ...args) {
    int[] a1 = new int[5];
    int a2[] = new int[5];

    int[] a3 = new int[] {1, 2};
    int[] a4 = {1, 2};

    int[] a5 = new int[0];
//----------------------------------------------
    int[][] aa1 = new int[5][5];

    int[][] aa2 = new int[5][];
    aa2[0] = new int[5];
    aa2[1] = new int[4];
    aa2[2] = new int[3];
    aa2[3] = new int[2];
    aa2[4] = new int[1];

    int[][] aa3 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0}, {0, 0}, {0}};

    int[][] aa4 = new int[1][];
    System.out.println(aa4[0]);

    int[][][] aaa1 = new int[1][][];
    System.out.println(aa4[0]);

    varargs("Hello", "Worm", ":)");
  }
  public static void varargs(String ...args) {
    for (int i = 0; i < args.length; i++) {
      System.out.print(args[i] + " ");
    }
  }
}
