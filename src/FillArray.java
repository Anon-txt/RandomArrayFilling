import java.util.*;

public class FillArray {

  public void fillArray(boolean[] x) {
    fillarray(x);
  }

  public void fillArray(int[] x) {
      fillarray(x);
  }

  public void fillArray(long[] x) {
      fillarray(x);
  }

  public void fillArray(float[] x) {
      fillarray(x);
  }

  public void fillArray(double[] x) {
      fillarray(x);
  }

  private void fillarray(boolean[] x) {
      Random random = new Random();
          for (int i = 0; i < x.length; i++) {
              boolean randomValue = random.nextBoolean();
                  x[i] = randomValue;
          }
  }

  private void fillarray(int[] x) {
      Random random = new Random();
          for (int i = 0; i < x.length; i++) {
              int randomValue = random.nextInt();
                  x[i] = randomValue;
          }
  }

  private void fillarray(long[] x) {
      Random random = new Random();
          for (int i = 0; i < x.length; i++) {
              long randomValue = random.nextLong();
                  x[i] = randomValue;
          }
  }

  private void fillarray(double[] x) {
      Random random = new Random();
          for (int i = 0; i < x.length; i++) {
              double randomValue = random.nextDouble();
                  x[i] = randomValue;
          }
  }

  private void fillarray(float[] x) {
      Random random = new Random();
          for (int i = 0; i < x.length; i++) {
              float randomValue = random.nextFloat();
                  x[i] = randomValue;
          }
  }

  public void fillBiArray(boolean[][] matrice) {
      fillbiArray(matrice);
  }

  public void fillBiArray(int[][] matrice) {
      fillbiArray(matrice);
  }

  public void fillBiArray(long[][] matrice) {
      fillbiArray(matrice);
  }

  public void fillBiArray(float[][] matrice) {
      fillbiArray(matrice);
  }

  public void fillBiArray(double[][] matrice) {
      fillbiArray(matrice);
  }

  private void fillbiArray(boolean[][] matrice) {
      Random random = new Random();
          for (int riga = 0; riga < matrice.length; riga++) {
              for (int colonna = 0; colonna < matrice.length; colonna++) {
                  boolean valore = random.nextBoolean();
                      matrice[riga][colonna] = valore;
              }
          }
  }

  private void fillbiArray(int[][] matrice) {
      Random random = new Random();
          for (int riga = 0; riga < matrice.length; riga++) {
              for (int colonna = 0; colonna < matrice.length; colonna++) {
                  int valore = random.nextInt();
                      matrice[riga][colonna] = valore;
              }
          }
  }

  private void fillbiArray(long[][] matrice) {
      Random random = new Random();
          for (int riga = 0; riga < matrice.length; riga++) {
              for (int colonna = 0; colonna < matrice.length; colonna++) {
                  long valore = random.nextLong();
                      matrice[riga][colonna] = valore;
              }
          }
  }

  private void fillbiArray(float[][] matrice) {
      Random random = new Random();
          for (int riga = 0; riga < matrice.length; riga++) {
              for (int colonna = 0; colonna < matrice.length; colonna++) {
                  float valore = random.nextFloat();
                      matrice[riga][colonna] = valore;
              }
          }
  }

  private void fillbiArray(double[][] matrice) {
      Random random = new Random();
          for (int riga = 0; riga < matrice.length; riga++) {
              for (int colonna = 0; colonna < matrice.length; colonna++) {
                  double valore = random.nextDouble();
                      matrice[riga][colonna] = valore;
              }
          }
  }

}
