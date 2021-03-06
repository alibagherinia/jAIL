/**
 * 
 */
package de.jail.statistic.clustering.partitional.kmeans;

import de.jail.geometry.schemas.Centroid;
import de.jail.geometry.schemas.Point;
import de.jail.statistic.clustering.Cluster;

/**
 * Class represents a special cluster which are related to the kmeans clustering. Difference to a general cluster is, we have
 * a center now.
 * 
 * @author Christian Vogel
 */
public class KMeansCluster extends Cluster {
	
	private Centroid center;
	
	/**
	 * Default constructor doing nothing special.
	 */
	public KMeansCluster() {
		super();
	}

	/**
	 * Returns the current centroid of this cluster.
	 * 
	 * @return the center point
	 */
	public Centroid getCenter() {
		return center;
	}
	
	/**
	 * Set a point to be the center of this cluster. 
	 * 
	 * @param center normal point
	 */
	public void setCenter(Point center) {
		this.center = new Centroid(center);
	}
}
