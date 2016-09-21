package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab1.Variant19;

import lab1.Variant19.ANIMAL;
import lab1.Variant19.COLOR;
import lab1.Variant19.COLOR_ANIMAL;

import lab1.DoublePair;


public class TestVariant19 {

	public static double EPS = 0.0000001;


	@Test(dataProvider = "inputProvider")
	public void inputTest(int x1, int y1, int x2, int y2, DoublePair res) {
		assertEquals(new Variant19().inputOutputTask(x1, y1, x2, y2), res);
	}

	@DataProvider
	public Object[][] inputProvider() {
		return new Object[][] { { 3, 4, 0, 0, new DoublePair(14.0,12.0) } };
	}


	////////////////////////////////////////////////

	@Test(dataProvider = "integerProvider")
	public void inputTest(int p1, int p3) {
		assertEquals(new Variant19().integerNumbersTask(p1), p3);
	}

	@DataProvider
	public Object[][] integerProvider() {
		return new Object[][] { { 7923, 132 }, { 3600, 60 }, { 3601, 60 },  {18658, 310},
				{0, 0}};
	}

	@Test(expectedExceptions = AssertionError.class, dataProvider = "negativeIntegerProvider")
	public void negativeIntegerTest(int number) {
		new Variant19().integerNumbersTask(number);
	}

	@DataProvider
	public Object[][] negativeIntegerProvider() {
		return new Object[][] { { -2}, {-8} };
	}


	////////////////////////////////////////////////

	@Test(dataProvider = "ifProvider")
	public void ifTest(int p1, int p2, int p3, int p4, int p5) {
		assertEquals(new Variant19().ifTask(p1, p2, p3, p4), p5);
	}

	@DataProvider
	public Object[][] ifProvider() {
		return new Object[][] { { 1, 3, 1, 1, 2 },
				{ 3, 3, 3, 5, 4} };
	}

	@Test(expectedExceptions = AssertionError.class, dataProvider = "negativeIfProvider")
	public void negativeIfTest(int a, int b, int c, int d) {
		new Variant19().ifTask(a,b,c,d);
	}

	@DataProvider
	public Object[][] negativeIfProvider() {
		return new Object[][] { {1, 2, 3, 1 }, {4, 4, 4, 4} };
	}

	//////////////////////////////////////////////////

	@Test(dataProvider = "booleanProvider")
	public void booleanTest(int p1, int p2, int p3, boolean p4) {
		assertEquals(new Variant19().booleanTask(p1, p2, p3), p4);
	}

	@DataProvider
	public Object[][] booleanProvider() {
		return new Object[][] { { 1, 2, 3, false }, { 1, -1, 1, true}, {1,1,-1, true } };
	}


	//////////////////////////////////////////////////

	@Test(dataProvider = "switchProvider")
	public void switchTest(int year, COLOR_ANIMAL p2) {
		assertEquals( new Variant19().switchTask(year).animal, p2.animal);
		assertEquals( new Variant19().switchTask(year).color, p2.color);
	}

	@DataProvider
	public Object[][] switchProvider() {
		return new Object[][] { { 1985, new COLOR_ANIMAL(COLOR.GREEN, ANIMAL.COW)},
				{ 2000, new COLOR_ANIMAL(COLOR.RED, ANIMAL.DRAGON)},
				{ 2070, new COLOR_ANIMAL(COLOR.GREEN, ANIMAL.TIGER)}};
	}



	///////////////////////////////////////////////////

	@Test(dataProvider = "forProvider")
	public void forTest(int n, double p2) {
		assertEquals(new Variant19().forTask(n), p2, EPS);
	}

	@DataProvider
	public Object[][] forProvider() {
		return new Object[][] { { 9, 362880.0},
				{ 2, 2}, { 13, 6.2270208E9} };
	}

	///////////////////////////////////////////////////


	@Test(dataProvider = "whileProvider")
	public void whileTest(int a, int c) {
		assertEquals(new Variant19().whileTask(a), c);
	}

	@DataProvider
	public Object[][] whileProvider() {
		return new Object[][] { { 12, 21}, { 45892, 29854}, { 89654, 45698}};
	}

	@Test(expectedExceptions = AssertionError.class, dataProvider = "negativeWhileProvider")
	public void negativeWhileTest(int a) {
		new Variant19().whileTask(a);
	}

	@DataProvider
	public Object[][] negativeWhileProvider() {
		return new Object[][] { { -1}, {0} };
	}

	//////////////////////////////////////////
	@Test(dataProvider = "arrayProvider")
	public void arrayTest(double[] array, double value) {
		assertEquals(new Variant19().arrayTask(array), value);
	}

	@DataProvider
	public Object[][] arrayProvider() {
		return new Object[][]{{new double[]{3, 2, -1}, 2},
				{new double[]{1, 3, -2, 3, 10, 19, 31}, 19},
				{new double[]{3, 2, -1, 5, 4, -2, 0, 2, 10}, 4.0}
		};
	}



	//////////////////////////////////////////

	@Test(dataProvider = "matrixProvider")
	public void twoDimensionArrayTest(int[][] input, int[][] output) {
		assertEquals(new Variant19().twoDimensionArrayTask(input), output);
	}

	@DataProvider
	public Object[][] matrixProvider() {
		int[][] input1 = {{2, 3, 6, 9, -9},
				{34, 98, -9, 2, -1},
				{4, 2, 1, 6, -1},
				{98, 8, 1, 5, -3}};


		int[][] output1 = {{3, 6, 9, -9},
				{98, -9, 2, -1},
				{2, 1, 6, -1},
				{ 8, 1, 5, -3}};


		int[][] input2 = {{-2, 3, -6, 9, 9},
				{4, 2, -1, 6, -1},
				{34, 98, -9, 2, -1},
				{98, 8, -1, 5, -3}};

		int[][] output2 = {{-2, -6, 9, 9},
				{4, -1, 6, -1},
				{34,  -9, 2, -1},
				{98, -1, 5, -3}};

		int[][] input3 = {{2, 3, -6, 9, 9},
				{4, -2, -1, 6, 1},
				{34, 98, 9, -2, 1},
				{-98, 8, -1, 5, 3}};

		int[][] output3 = {{2, 3, -6, 9},
				{4, -2, -1, 6},
				{34, 98, 9, -2},
				{-98, 8, -1, 5}};

		int[][] input4 = {{2, 3, -6, 9, 9},
				{-4, 2, -1, 6, -1},
				{-34, 98, 9, -2, -1},
				{-98, -8, -1, 5, -3}};


		return new Object[][] {{input1,output1},{input2,output2},
				{input3, output3} };

	}


}