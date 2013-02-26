package bodymodel.ymca;

import java.util.Vector;

import org.jnect.bodymodel.PositionedElement;

/**
 * Dumb utility class to perform some basic 3D vector maths.
 * @author istvanrath
 *
 */
public class VectorMaths {
	
	/**
	 * Calculate a vector based on X,Y,Z coordinates (given as Vectors) of its endpoints.
	 * endpoints should be 3D Float vectors of X,Y,Z coordinates respectively.
	 */
	public static Vector<Float> createVector(Vector<Float> start, Vector<Float> end) {
		Vector<Float> r = new Vector<Float>();
		r.add(end.get(0)-start.get(0)); // X 
		r.add(end.get(1)-start.get(1)); // Y 
		r.add(end.get(2)-start.get(2)); // Z 
		return r;
	}
	
	public static Vector<Float> createVector(PositionedElement start, PositionedElement end) {
		Vector<Float> r = new Vector<Float>();
		r.add(end.getX()-start.getX()); // X 
		r.add(end.getY()-start.getY()); // Y 
		r.add(end.getZ()-start.getZ()); // Z 
		return r;
	}
	
	public static Vector<Float> createVector(
			float startX, float startY, float startZ,
			float endX, float endY, float endZ) {
		Vector<Float> r = new Vector<Float>();
		r.add(endX-startX); // X 
		r.add(endY-startY); // Y 
		r.add(endZ-startZ); // Z 
		return r;
	}
	

	
	/**
	 * Calculate the dot product of two Float vectors (of equal length).
	 * Note: dumb method, does not check for equal dimensions, nulls etc.
	 */
	public static float dotProduct(Vector<Float> a, Vector<Float> b) {
		Float r = 0.0f;
		for (int x=0; x<a.size(); x++) {
			r+=a.get(x)*b.get(x);
		}
		return r;
	}
	
	/**
	 * Calculate the length of a 3D Float vector.
	 */
	public static float lengthOf(Vector<Float> a) {
		Float r = 0.0f;
		for (Float ai : a) {
			r+=ai*ai;
		}
		return (float)Math.sqrt(r);
	}
	
	/**
	 * Calculate the angle in radians between two orthonormal Float vectors.
	 */
	public static float angleBetween(Vector<Float> a, Vector<Float> b) {
		return (float)Math.acos( dotProduct(a, b) / (lengthOf(a)*lengthOf(b)) );
	}
}
