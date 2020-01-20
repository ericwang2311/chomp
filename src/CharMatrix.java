/*
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  // Fields:
	
	//2D array for class
  private char[][] matrix;
  

  /*
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  
  public CharMatrix(int rows, int cols)
  {
	  new CharMatrix(rows, cols, ' ');		//use below constructor with space
  }

  /*
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill  character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
	  matrix=new char[rows][cols];
	  
	  for(int x = 0; x < rows; x++)		//nested for loops for every spot
	  {
		  for(int y = 0; y < cols; y++)
		  {
			  matrix[x][y]=fill;
		  }
	  }
  }

  /*
   * Returns the number of rows in grid
   */
  public int numRows()
  {
    return matrix.length;
  }

  /*
   * Returns the number of columns in grid
   */
  public int numCols()
  {
    return matrix[0].length;
  }

  /*
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
    return matrix[row][col];
  }

  /*
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
     matrix[row][col]=ch;
  }

  /*
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
	  if(matrix[row][col]==' ')	
		  return true;
	  return false;
  }

  /*
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
	  for(int x = row0; x <= row1; x++)				//nested for loops that fill all the sopts, including the ends
	  {
		  for(int y = col0; y <= col1;y++)
		  {
			  matrix[x][y]=fill;
		  }
	  }
  }

  /*
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
	  fillRect(row0,col0,row1,col1,' ');	//using bove method with spaces
  }

  /*
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
	  int end = 0;
	  
	  for(int x = 0; x <matrix[row].length; x++)		//find row length and loop through for spaces
	  {
		  if(matrix[row][x]!=' ')
			  end++;
	  }
	  return end;
  }

  /*
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
	  int end = 0;
	  
	  for(int y = 0; y <matrix.length; y++)		//find column length and loop through for spaces
	  {
		  if(matrix[y][col]!=' ')
			  end++;
	  }
	  return end;
  }
}
