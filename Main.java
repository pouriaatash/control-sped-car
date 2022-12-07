class Main {
  @Override
	public String toString() {
		return "Main []";
	}

public static void main(final String[] args) {
    System.out.println("Система расчета штрафов");

    final int carSpeed = 2450;

    System.out.println(carSpeed);

    final int fineFor20to40 = 500;
    final int fineFor40to60 = 1000;
    final int fineFor60to80 = 2000;
    final int fineFor80andMore = 5000;

    final int townSpeed = 60;

    final int overSpeed = carSpeed - townSpeed;

    if (overSpeed >= 20 && overSpeed < 40) {
      System.out.println("штраф: " + fineFor20to40);
    } else if (overSpeed >= 40 && overSpeed < 60) {
      System.out.println("штраф: " + fineFor40to60);
    } else if (overSpeed >= 60 && overSpeed < 80) {
      System.out.println("штраф:" + fineFor60to80);
    } else if (overSpeed >= 80) {
      System.out.println("штраф:" + fineFor80andMore);
    }

  }
}