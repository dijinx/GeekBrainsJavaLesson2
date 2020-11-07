import java.util.Arrays;

public class GeekBrainsJavaLesson2 {
	public static void main(String[] args) {
		changeOneToZero();
		arrayWhithThreeStep();
		lessSixMultiplyByTwo();
		diagonalValueChangeToOne();
		minMaxElementsInArray();
		leftEqualsRight();
		arrayStepAside();
	}

	//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
	// С помощью цикла и условия заменить 0 на 1, 1 на 0;
	public static void changeOneToZero() {
		int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				arr[i] = 0;
			} else arr[i] = 1;
			System.out.println("Реверс 1 на 0: " + Arrays.toString(arr));
		}
		System.out.println();
	}

	//Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
	public static void arrayWhithThreeStep() {
		int[] arr = new int[8];
		for (int i = 0; arr[i] <= 21; arr[i] = arr[i] + 3) {
			System.out.println("Заполнение массива значениями с шагом в 3: " + " " + arr[i]);
		}
		System.out.println();
	}

	//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
	public static void lessSixMultiplyByTwo() {
		int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		for (int i = 0; i < 12; i++) {
			if (arr[i] <= 6) {
				arr[i] *= 2;
				System.out.println("Умножение чисел меньше 6 на 2: " + Arrays.toString(arr));
			}
		}
	}

	//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
	//и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
	public static void diagonalValueChangeToOne() {
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					arr[i][j] = 1;
				} else arr[i][j] = 0;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	//**Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
	public static void minMaxElementsInArray() {

		int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Мнимальное значение ячейки массива: " + min);
		System.out.println("Максимальное значение ячейки массива: " + max);

	}


	//** Написать метод, в который передается не пустой одномерный целочисленный массив,
	//метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
	//Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
	//граница показана символами ||, эти символы в массив не входят.
	public static void leftEqualsRight() {


	}

	//**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
	// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
	// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
	// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
	// При каком n в какую сторону сдвиг можете выбирать сами.
	public static void arrayStepAside(){
		

	}
}
