package com.practice;

public class Matrix {
	private int rows;
	private int cols;
	private int[][] matrix;

	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.matrix = new int[rows][cols];
	}
	
	public Matrix(int[] linearArray, int rows, int cols) throws Exception {
		this(rows, cols);
		this.matrix = populateMatrix(linearArray);		
	}
	
	public Matrix(int[][] matrix) throws Exception {
		this(matrix.length, matrix[0].length);
		this.matrix = matrix;		
	}

	private int[][] populateMatrix(int[] arr) throws Exception {
		int mappedLength = rows * cols;
		if (mappedLength != arr.length) {
			throw new Exception("Dimension mismatched");
		}
		int[][] mappedMatrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mappedMatrix[i][j] = arr[i * rows + j];
			}
		}
		return mappedMatrix;
	}
		
	public Matrix sum(Matrix m) throws Exception{
		if(m.rows != this.rows && m.cols != this.cols) {
			throw new Exception("Dimension mismatched"); 
		}
		int[][] sum = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				sum[i][j] = this.matrix[i][j] + m.matrix[i][j];
			}
		}
		return new Matrix(sum);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sb.append(matrix[i][j] + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
