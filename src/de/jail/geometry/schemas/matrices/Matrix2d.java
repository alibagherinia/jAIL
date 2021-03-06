/**
 * 
 */
package de.jail.geometry.schemas.matrices;

/**
 * This class represents a 2x2 matrix which is a special square matrix
 * where the order is two. 
 * 
 * @author Christian Vogel
 */
public class Matrix2d extends SquareMatrix {
	
	/**
	 * Initialize an empty 2x2 matrix. Only arrays with a size of 2 are allowed!
	 */
	public Matrix2d() {
		super(2);
	}

	/**
	 * This method will calculate the determinant of a 2x2 matrix. The algorithm
	 * is leant on the <i>Rule of Sarrus</i>.
	 * <p>
	 * {@link http://en.wikipedia.org/wiki/Rule_of_Sarrus}
	 * </p>
	 * 
	 * @return determinant of the matrix
	 * 
	 * @author Christian Vogel
	 */
	@Override
	public double determinant() {
		if(getElements() == null) {
			throw new NullPointerException("matrix cannot be null when trying to calculate determinant");
		}
		
		return this.getElementAt(0, 0) * this.getElementAt(1, 1) 
			- this.getElementAt(0, 1) * this.getElementAt(1, 0);
	}
}
